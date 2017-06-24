package com.csform.onlinegallery.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.BaseAdapter;

import com.csform.onlinegallery.R;
import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;
/**
 * Contains object used for loading and display images i gallery
 * 
 * @author itcsform
 *
 */
public abstract class GalleryBaseAdapter extends BaseAdapter {
	protected Context context;
	protected ImageLoader imageLoader;
	protected DisplayImageOptions options;
	protected LayoutInflater inflater;
	protected int theme;

	public GalleryBaseAdapter(Context context, int theme) {
		super();
		this.context = context;
		//this.imageLoader = imageLoader;
		this.inflater = LayoutInflater.from(this.context);
		// Create global configuration and initialize ImageLoader with this
		// configuration
		this.theme = theme;
		ImageLoaderConfiguration config = new ImageLoaderConfiguration.Builder(
				context)

		.build();
		ImageLoader.getInstance().init(config);
		imageLoader = ImageLoader.getInstance();
		
		options = new DisplayImageOptions.Builder()
		//.showStubImage(R.drawable.icon_default)
		.showImageOnLoading(R.drawable.icon_default)
		.showImageForEmptyUri(R.drawable.icon_default) // resource or
														// drawable
	 
		.cacheOnDisc(true) // default
		.cacheInMemory(true).resetViewBeforeLoading(true).build();
	}

}
