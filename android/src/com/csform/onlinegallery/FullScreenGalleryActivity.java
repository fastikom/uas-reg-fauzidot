package com.csform.onlinegallery;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

import android.app.Activity;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.app.WallpaperManager;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.graphics.Bitmap.CompressFormat;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.csform.onlinegallery.adapters.FullScreenGalleryAdapter;
import com.csform.onlinegallery.model.Category;
import com.csform.onlinegallery.themes.Themes;
import com.csform.onlinegallery.views.PhotoPager;
import com.google.analytics.tracking.android.EasyTracker;

/**
 * FullScreen gallery Swipe images
 * 
 * @author itcsform
 * 
 */
public class FullScreenGalleryActivity extends Activity {

	private int theme;
	private Category category;
	private PhotoPager mPhotoPager;
	private TextView imageText;
	private ImageView setWallPaper;
	private ImageView downloadImage;
	private ImageView shareImage;
	private int currentImageIndex;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		theme = getIntent().getIntExtra(getString(R.string.THEME), 0);
		setContentView(Themes.getGalleryLayout(theme));
		mPhotoPager = (PhotoPager) findViewById(R.id.photo_pager);
		imageText = (TextView) findViewById(R.id.image_text);
		imageText.setTypeface(Typeface.createFromAsset(getAssets(),
				Themes.getFont(theme)));
		setWallPaper = (ImageView) findViewById(R.id.wallpaper);
		downloadImage = (ImageView) findViewById(R.id.save);
		shareImage = (ImageView) findViewById(R.id.share);
		category = getIntent().getParcelableExtra(getString(R.string.category));
		int index = getIntent().getIntExtra(getString(R.string.index), 0);
		mPhotoPager.setAdapter(new FullScreenGalleryAdapter(this, category
				.getImages()));
		mPhotoPager.setCurrentItem(index);

		mPhotoPager.setOnPageChangeListener(new OnPageChangeListener() {

			@Override
			public void onPageSelected(int position) {
				// TODO Auto-generated method stub
				currentImageIndex = position;
				imageText.setText(category.getImages().get(currentImageIndex)
						.getTitle());
			}

			@Override
			public void onPageScrolled(int arg0, float arg1, int arg2) {
				// TODO Auto-generated method stub

			}

			@Override
			public void onPageScrollStateChanged(int arg0) {
				// TODO Auto-generated method stub

			}
		});
		currentImageIndex = index;
		setWallPaper.setOnClickListener(imageClick);
		downloadImage.setOnClickListener(imageClick);
		shareImage.setOnClickListener(imageClick);
		imageText.setText(category.getImages().get(currentImageIndex)
				.getTitle());

	}

	@Override
	public void onStart() {
		super.onStart();
		EasyTracker.getInstance(this).activityStart(this);
	}

	@Override
	public void onStop() {
		super.onStop();
		EasyTracker.getInstance(this).activityStop(this);
	}

	private OnClickListener imageClick = new OnClickListener() {

		@Override
		public void onClick(View arg0) {
			int id = arg0.getId();
			if (id == R.id.wallpaper) {
				new GetBitmap(0).execute();
			} else if (id == R.id.save) {
				new GetBitmap(1).execute();
			} else if (id == R.id.share) {
				new GetBitmap(2).execute();
				//share();
			}
		}
	};

	/**
	 * Set wallpaper on device
	 * 
	 * @param bitmap
	 */
	private void setPhoneWallpaper(Bitmap bitmap) {
		WallpaperManager myWallpaperManager = WallpaperManager
				.getInstance(getApplicationContext());

		try {
			myWallpaperManager.setBitmap(bitmap);

			Toast.makeText(this, getString(R.string.wallpaper_set),
					Toast.LENGTH_SHORT).show();
		} catch (IOException e) {
			Toast.makeText(this, getString(R.string.wallpaper_error),
					Toast.LENGTH_SHORT).show();
		}
	}

	/**
	 * Save image on SDcard
	 * 
	 * @param bitmap
	 */
	private Uri saveSDCard(Bitmap bitmap) {
		File folder = new File(
				Environment.getExternalStorageDirectory()
						+ "/com.csform.onlinegallery");
		try {
			if (!folder.exists()) {
				folder.mkdir();
			}

			OutputStream fOut = null;
			File file = new File(folder, "image_"
					+ String.valueOf(mPhotoPager.getCurrentItem()) + ".jpg");
			fOut = new FileOutputStream(file);
			bitmap.compress(CompressFormat.JPEG, 100, fOut);

			fOut.flush();
			fOut.close();

			if (Build.VERSION.SDK_INT == 7) {
				this.sendBroadcast(new Intent(Intent.ACTION_MEDIA_MOUNTED, Uri
						.parse("file://"
								+ Environment.getExternalStorageDirectory())));
			} else {
				MediaScannerConnection.scanFile(getApplicationContext(),
						new String[] { file.toString() }, null,
						new MediaScannerConnection.OnScanCompletedListener() {
							public void onScanCompleted(String path, Uri uri) {
							}
						});
			}
			Toast.makeText(FullScreenGalleryActivity.this,
					getString(R.string.image_saved), Toast.LENGTH_SHORT).show();

		} catch (Exception ex) {
			ex.printStackTrace();
			Toast.makeText(FullScreenGalleryActivity.this,
					getString(R.string.error_occured), Toast.LENGTH_SHORT)
					.show();
			return null;
		}
		return Uri.fromFile(new File(folder, "image_"
				+ String.valueOf(mPhotoPager.getCurrentItem()) + ".jpg"));
	}

	/**
	 * Share image over intet
	 * 
	 */
	private void share(Uri uriToShare) {
		if (category.getImages().get(currentImageIndex) != null) {
			Intent share = new Intent(Intent.ACTION_SEND);
			share.setType("text/plain");
			share.putExtra(Intent.EXTRA_SUBJECT,
					category.getImages().get(currentImageIndex).getTitle());
			share.putExtra(Intent.EXTRA_STREAM, uriToShare);
			startActivity(Intent
					.createChooser(share, getString(R.string.share)));
		}
	}

	/**
	 * Get bitmap from url
	 * 
	 * @author itcsform
	 * 
	 */
	private class GetBitmap extends AsyncTask<Void, Void, Bitmap> {
		Dialog progressDialog;

		private int type;
		private String path;

		public GetBitmap(int type) {

			this.type = type;
			if (category.getImages().get(currentImageIndex) != null)
				this.path = category.getImages().get(currentImageIndex)
						.getPath();
			progressDialog = ProgressDialog.show(
					FullScreenGalleryActivity.this, "",
					getString(R.string.please_wait));

			progressDialog.show();

		}

		@Override
		protected Bitmap doInBackground(Void... arg0) {
			// TODO Auto-generated method stub
			try {
				if (path != null) {
					if (path.startsWith("http://")) {
						URL url = new URL(path);
						HttpURLConnection connection = (HttpURLConnection) url
								.openConnection();
						connection.setDoInput(true);
						connection.connect();
	
						InputStream input = connection.getInputStream();
	
						Bitmap tmp = BitmapFactory.decodeStream(input);
						connection.disconnect();
						input.close();
						return tmp;
					} else if (path.startsWith("assets://")) {
						InputStream input = new BufferedInputStream(getAssets().open(path.replace("assets://", "")));
						
						Bitmap tmp = BitmapFactory.decodeStream(input);
						input.close();
						return tmp;
					}
				}
			} catch (Exception e) {

				e.printStackTrace();
			} catch (OutOfMemoryError er) {
				er.printStackTrace();
			}

			return null;
		}

		@Override
		protected void onPostExecute(Bitmap bitmap) {

			if (bitmap != null) {
				if (type == 0)
					setPhoneWallpaper(bitmap);
				else {
					Uri uriToShare = saveSDCard(bitmap);
					if (type == 2) {
						share(uriToShare);
					}
				}

			} else
				Toast.makeText(FullScreenGalleryActivity.this,
						getString(R.string.error_occured), Toast.LENGTH_SHORT)
						.show();
			progressDialog.dismiss();
		}

	}

}
