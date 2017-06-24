package com.csform.onlinegallery;

import java.util.ArrayList;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.GridView;
import android.widget.TextView;

import com.csform.onlinegallery.adapters.CategoriesGridAdapter;
import com.csform.onlinegallery.model.Category;
import com.csform.onlinegallery.themes.Themes;
import com.google.analytics.tracking.android.EasyTracker;
/**
 * 
 * Used to show category grid
 * @author itcsform
 *
 */
public class GalleryCategoryActivity extends Activity {

	protected GridView grid;
	private ArrayList<Category> categories;
	protected TextView categoryTitle;
	protected int theme;
	protected String title;

	private Dialog splashScreenDialog;
    private Handler handler;
    private Runnable runnable;
	private static final long SPLASH_SCREEN_TIMEOUT_MILLIS = 2000;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		theme = getIntent().getIntExtra(getString(R.string.THEME), 0);
		title = getIntent().getStringExtra(getString(R.string.TITLE_NAME));
		setContentView(Themes.getGridLayout(theme));

		grid = (GridView) findViewById(R.id.grid);
		grid.setOnItemClickListener(gridItemListener); 
		categoryTitle = (TextView) findViewById(R.id.category_title);
		categoryTitle.setTypeface(Typeface.createFromAsset(getAssets(),
				Themes.getFont(theme)));
		categoryTitle.setText(title);
		init();
		showSplashScreen();
	}

	@Override
	protected void onDestroy() {
		super.onDestroy();
		if (handler != null) {
			handler.removeCallbacks(runnable);
		}
	}
	
	private void showSplashScreen() {
		splashScreenDialog = new Dialog(this, R.style.SplashScreenStyle);
		splashScreenDialog.setContentView(R.layout.splash_screen);
		splashScreenDialog.getWindow().setBackgroundDrawableResource(Themes.getSplashScreenBackground(theme));
		splashScreenDialog.show();
		handler = new Handler();
		runnable = new Runnable() {
			@Override
			public void run() {
				hideLoginSplashScreen();
			}
		};
		handler.postDelayed(runnable, SPLASH_SCREEN_TIMEOUT_MILLIS);
		splashScreenDialog.setOnCancelListener(new OnCancelListener() {
			
			@Override
			public void onCancel(DialogInterface dialogInterface) {
				finish();
			}
		});
		TextView splashScreenTitle = (TextView) splashScreenDialog.findViewById(R.id.splash_screen_title);
		splashScreenTitle.setTypeface(Typeface.createFromAsset(getAssets(), Themes.getFont(theme)));
	}
	
	public void hideLoginSplashScreen() {
		if (splashScreenDialog != null) {
			splashScreenDialog.dismiss();
			splashScreenDialog = null;
		}
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

	protected void init() {
		categories = getIntent().getParcelableArrayListExtra(
				getString(R.string.categories));

		grid.setNumColumns(Themes.getNumberOfCategoryColumns(theme));
		grid.setAdapter(new CategoriesGridAdapter(this, categories, theme));

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.gallery, menu);
		return true;
	}

	public OnItemClickListener gridItemListener = new OnItemClickListener() {

		@Override
		public void onItemClick(AdapterView<?> parent, View view, int position,
				long id) {
			// TODO Auto-generated method stub
			final Animation anim = AnimationUtils.loadAnimation(GalleryCategoryActivity.this, R.anim.zoom_out);
			 
			final int p = position;
			anim.setAnimationListener(new AnimationListener() {
				
				@Override
				public void onAnimationStart(Animation animation) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void onAnimationRepeat(Animation animation) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void onAnimationEnd(Animation animation) {
					// TODO Auto-generated method stub
					next(p);
				 
					
				}
			});
			view.startAnimation(anim);
			
		}
	};

	protected void next(int position) {
		Intent intent = new Intent(this, GalleryThumbActivity.class);
		intent.putExtra(getString(R.string.category), categories.get(position));
		intent.putExtra(getString(R.string.THEME), theme);
		intent.putExtra(getString(R.string.TITLE_NAME), title);
		startActivity(intent);
	}

}
