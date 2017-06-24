package com.csform.onlinegallery.adapters;

import java.util.ArrayList;

import uk.co.senab.photoview.PhotoViewAttacher;
import android.content.Context;
import android.graphics.Bitmap;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;

import com.csform.onlinegallery.R;
import com.csform.onlinegallery.model.Image;
import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;
import com.nostra13.universalimageloader.core.assist.FailReason;
import com.nostra13.universalimageloader.core.assist.ImageLoadingListener;
/**
 * Used for PhotoPager
 * @author itcsform
 *
 */
public class FullScreenGalleryAdapter extends PagerAdapter {

	private Context context;
	private LayoutInflater inflater;
	private ArrayList<Image> images;
	DisplayImageOptions options;
	ImageLoader imageLoader;
	String category_path;

	public FullScreenGalleryAdapter(Context context, ArrayList<Image> images) {
		this.context = context;
		this.images = images; 

		ImageLoaderConfiguration config = new ImageLoaderConfiguration.Builder(
				context).memoryCacheExtraOptions(480, 800)
				// default = device screen dimensions
				.threadPoolSize(5)
				// default
				.threadPriority(Thread.NORM_PRIORITY - 1)
				// default
				.denyCacheImageMultipleSizesInMemory()
				.defaultDisplayImageOptions(DisplayImageOptions.createSimple()) // default
				.build();
		imageLoader = ImageLoader.getInstance();
		imageLoader.init(config);
		inflater = (LayoutInflater) this.context
				.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		imageLoader.resume();
	}

	@Override
	public int getCount() {
		if (images != null)
			return images.size();
		return 0;
	}

	/**
	 * Shows image in pager item
	 */
	@Override
	public View instantiateItem(View view, int position) {
		final View imageLayout = inflater.inflate(R.layout.fullimage, null);
		final ImageView imageView = (ImageView) imageLayout
				.findViewById(R.id.image);
		final ProgressBar bar = (ProgressBar) imageLayout
				.findViewById(R.id.imageProgressBar);
		final PhotoViewAttacher attacher = new PhotoViewAttacher(imageView);

		// String path = context.getString(R.string.SERVER_PATH) +
		// category_path+"/"+urls.get(position);

		imageLoader.displayImage(images.get(position).getPath(), imageView,
				options, new ImageLoadingListener() {
 
					@Override
					public void onLoadingCancelled(String arg0, View arg1) {
						// TODO Auto-generated method stub
						
					}

					@Override
					public void onLoadingComplete(String arg0, View arg1,
							Bitmap arg2) {
						// TODO Auto-generated method stub
						bar.setVisibility(View.GONE);

						attacher.update();
					}

					@Override
					public void onLoadingFailed(String arg0, View arg1,
							FailReason arg2) {
						// TODO Auto-generated method stub
						
					}

					@Override
					public void onLoadingStarted(String arg0, View arg1) {
						// TODO Auto-generated method stub
						
					}
				});
		((ViewPager) view).addView(imageLayout, 0);
		return imageLayout;
	}

	@Override
	public void destroyItem(ViewGroup container, int position, Object object) {
		container.removeView((View) object);
	}

	@Override
	public boolean isViewFromObject(View view, Object object) {
		return view == object;
	}

}