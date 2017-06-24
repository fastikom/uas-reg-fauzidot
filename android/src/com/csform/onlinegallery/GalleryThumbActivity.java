package com.csform.onlinegallery;

import android.content.Intent;

import com.csform.onlinegallery.adapters.ThumbsGridAdapter;
import com.csform.onlinegallery.model.Category;
import com.csform.onlinegallery.themes.Themes;
import com.google.analytics.tracking.android.EasyTracker;

/**
 * Used for showing thumbs in grid
 * 
 * @author itcsform
 * 
 */
public class GalleryThumbActivity extends GalleryCategoryActivity {

	private Category category;

	@Override
	protected void init() {
		category = getIntent().getParcelableExtra(getString(R.string.category));

		grid.setNumColumns(Themes.getNumberOfThumbColumns(theme));
		grid.setAdapter(new ThumbsGridAdapter(this, category.getImages(), theme));

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

	@Override
	protected void next(int position) {
		Intent intent = new Intent(this, FullScreenGalleryActivity.class);
		intent.putExtra(getString(R.string.category), category);
		intent.putExtra(getString(R.string.index), position);
		intent.putExtra(getString(R.string.THEME), theme);
		startActivity(intent);
	}
}
