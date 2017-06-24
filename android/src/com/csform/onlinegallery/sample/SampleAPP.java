package com.csform.onlinegallery.sample;

import java.util.ArrayList;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

import com.csform.onlinegallery.GalleryCategoryActivity;
import com.csform.onlinegallery.R;
import com.csform.onlinegallery.model.Image;
import com.csform.onlinegallery.sample.models.CategoryItem;
import com.csform.onlinegallery.sample.models.ImageItem;
import com.csform.onlinegallery.themes.Themes;

public class SampleAPP extends Activity {

	/**
	 * List of categories, array list of object. Class of object need to
	 * implement Category interface
	 */
	ArrayList<CategoryItem> travel = new ArrayList<CategoryItem>();
	ArrayList<CategoryItem> art = new ArrayList<CategoryItem>();
	ArrayList<CategoryItem> family = new ArrayList<CategoryItem>();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.sample);
		TextView b1 = (TextView) findViewById(R.id.button1);
		b1.setTypeface(Typeface.createFromAsset(getAssets(), Themes.getFont(0)));
		TextView b2 = (TextView) findViewById(R.id.button2);
		b2.setTypeface(Typeface.createFromAsset(getAssets(), Themes.getFont(1)));
		TextView b3 = (TextView) findViewById(R.id.button3);
		b3.setTypeface(Typeface.createFromAsset(getAssets(), Themes.getFont(2)));

		initData();

		b1.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// CALL GALLERY
				Intent i = new Intent(SampleAPP.this,
						GalleryCategoryActivity.class);
				// send list of categories
				i.putParcelableArrayListExtra(getString(R.string.categories),
						travel);
				// send thema
				i.putExtra(getString(R.string.THEME), Themes.THEME1);
				// send title name
				i.putExtra(getString(R.string.TITLE_NAME),
						getString(R.string.theme1));
				startActivity(i);

			}
		});
		b2.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// CALL GALLERY
				Intent i = new Intent(SampleAPP.this,
						GalleryCategoryActivity.class);
				// send list of categories
				i.putParcelableArrayListExtra(getString(R.string.categories),
						art);
				// send thema
				i.putExtra(getString(R.string.THEME), Themes.THEME2);
				// send title name
				i.putExtra(getString(R.string.TITLE_NAME),
						getString(R.string.theme2));
				startActivity(i);

			}
		});
		b3.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// CALL GALLERY
				Intent i = new Intent(SampleAPP.this,
						GalleryCategoryActivity.class);
				// send list of categories
				i.putParcelableArrayListExtra(getString(R.string.categories),
						family);
				// send thema
				i.putExtra(getString(R.string.THEME), Themes.THEME3);
				// send title name
				i.putExtra(getString(R.string.TITLE_NAME),
						getString(R.string.theme3));

				startActivity(i);

			}
		});

	}

	// init data used in sample app
	private void initData() {
		ArrayList<Image> images1 = new ArrayList<Image>();
		ImageItem i1 = new ImageItem();
		i1.setName("travel1");
		i1.setPath("assets://images/2312682227_397ae529e5.jpg");
		images1.add(i1);
		i1 = new ImageItem();
		i1.setName("travel2");
		i1.setPath("http://farm4.staticflickr.com/3014/2313447694_f76cb0188d.jpg");
		images1.add(i1);
		i1 = new ImageItem();
		i1.setName("travel3");
		i1.setPath("http://farm4.staticflickr.com/3126/2313513212_62e01afd60.jpg");
		images1.add(i1);
		i1 = new ImageItem();
		i1.setName("travel4");
		i1.setPath("http://farm4.staticflickr.com/3171/2313510436_5058eb3751.jpg");
		images1.add(i1);
		i1 = new ImageItem();
		i1.setName("travel5");
		i1.setPath("http://farm4.staticflickr.com/3075/2312697545_331e0d0319.jpg");
		images1.add(i1);
		i1 = new ImageItem();
		i1.setName("travel6");
		i1.setPath("http://farm4.staticflickr.com/3014/2313447694_f76cb0188d.jpg");
		images1.add(i1);
		i1 = new ImageItem();
		i1.setName("travel7");
		i1.setPath("http://farm4.staticflickr.com/3140/2313445336_52ac868f55.jpg");
		images1.add(i1);
		i1 = new ImageItem();
		i1.setName("travel8");
		i1.setPath("http://farm4.staticflickr.com/3240/2312624831_fd4e5259cd.jpg");
		images1.add(i1);
		i1.setName("travel9");
		i1.setPath("http://farm4.staticflickr.com/3076/2312620925_a05d771744.jpg");
		images1.add(i1);

		// 0 for category icon, so icon will be first image from category
		CategoryItem travel1 = new CategoryItem("TRAVEL CATEGORY 1", 0, "dsc1",
				0, images1);
		travel.add(travel1);
		
		
		images1 = new ArrayList<Image>();
		i1 = new ImageItem();
		i1.setName("travel2");
		i1.setPath("http://farm4.staticflickr.com/3020/2312682227_397ae529e5.jpg");
		images1.add(i1);
		i1 = new ImageItem();
		i1.setName("travel1");
		i1.setPath("http://farm4.staticflickr.com/3017/2313492822_d9ee33dbc2.jpg");
		images1.add(i1);
		i1 = new ImageItem();
		i1.setName("travel3");
		i1.setPath("http://farm4.staticflickr.com/3126/2313513212_62e01afd60.jpg");
		images1.add(i1);
		i1 = new ImageItem();
		i1.setName("travel4");
		i1.setPath("http://farm4.staticflickr.com/3171/2313510436_5058eb3751.jpg");
		images1.add(i1);
		i1 = new ImageItem();
		i1.setName("travel5");
		i1.setPath("http://farm4.staticflickr.com/3075/2312697545_331e0d0319.jpg");
		images1.add(i1);
		i1 = new ImageItem();
		i1.setName("travel6");
		i1.setPath("http://farm4.staticflickr.com/3014/2313447694_f76cb0188d.jpg");
		images1.add(i1);
		i1 = new ImageItem();
		i1.setName("travel7");
		i1.setPath("http://farm4.staticflickr.com/3140/2313445336_52ac868f55.jpg");
		images1.add(i1);
		i1 = new ImageItem();
		i1.setName("travel8");
		i1.setPath("http://farm4.staticflickr.com/3240/2312624831_fd4e5259cd.jpg");
		images1.add(i1);
		i1.setName("travel9");
		i1.setPath("http://farm4.staticflickr.com/3076/2312620925_a05d771744.jpg");
		images1.add(i1);

		// 0 for category icon, so icon will be first image from category
		CategoryItem travel2 = new CategoryItem("TRAVEL CATEGORY 2", 0, "dsc1",
				0, images1);
		travel.add(travel2);
		
		images1 = new ArrayList<Image>();
		i1 = new ImageItem();
		i1.setName("travel3");
		i1.setPath("http://farm4.staticflickr.com/3126/2313513212_62e01afd60.jpg");
		images1.add(i1); 
		i1 = new ImageItem();
		i1.setName("travel2");
		i1.setPath("http://farm4.staticflickr.com/3020/2312682227_397ae529e5.jpg");
		images1.add(i1);
		i1 = new ImageItem();
		i1.setName("travel1");
		i1.setPath("http://farm4.staticflickr.com/3017/2313492822_d9ee33dbc2.jpg");
		images1.add(i1);
		i1 = new ImageItem();
		i1.setName("travel4");
		i1.setPath("http://farm4.staticflickr.com/3171/2313510436_5058eb3751.jpg");
		images1.add(i1);
		i1 = new ImageItem();
		i1.setName("travel5");
		i1.setPath("http://farm4.staticflickr.com/3075/2312697545_331e0d0319.jpg");
		images1.add(i1);
		i1 = new ImageItem();
		i1.setName("travel6");
		i1.setPath("http://farm4.staticflickr.com/3014/2313447694_f76cb0188d.jpg");
		images1.add(i1);
		i1 = new ImageItem();
		i1.setName("travel7");
		i1.setPath("http://farm4.staticflickr.com/3140/2313445336_52ac868f55.jpg");
		images1.add(i1);
		i1 = new ImageItem();
		i1.setName("travel8");
		i1.setPath("http://farm4.staticflickr.com/3240/2312624831_fd4e5259cd.jpg");
		images1.add(i1);
		i1.setName("travel9");
		i1.setPath("http://farm4.staticflickr.com/3076/2312620925_a05d771744.jpg");
		images1.add(i1);

		// 0 for category icon, so icon will be first image from category
		CategoryItem travel3 = new CategoryItem("TRAVEL CATEGORY 3", 0, "dsc1",
				0, images1);
		travel.add(travel3);
		
		
		images1 = new ArrayList<Image>();
		i1 = new ImageItem();
		i1.setName("travel4");
		i1.setPath("http://farm4.staticflickr.com/3171/2313510436_5058eb3751.jpg");
		images1.add(i1);
		i1 = new ImageItem();
		i1.setName("travel3");
		i1.setPath("http://farm4.staticflickr.com/3126/2313513212_62e01afd60.jpg");
		images1.add(i1); 
		i1 = new ImageItem();
		i1.setName("travel2");
		i1.setPath("http://farm4.staticflickr.com/3020/2312682227_397ae529e5.jpg");
		images1.add(i1);
		i1 = new ImageItem();
		i1.setName("travel1");
		i1.setPath("http://farm4.staticflickr.com/3017/2313492822_d9ee33dbc2.jpg");
		images1.add(i1);
		i1 = new ImageItem();
		i1.setName("travel5");
		i1.setPath("http://farm4.staticflickr.com/3075/2312697545_331e0d0319.jpg");
		images1.add(i1);
		i1 = new ImageItem();
		i1.setName("travel6");
		i1.setPath("http://farm4.staticflickr.com/3014/2313447694_f76cb0188d.jpg");
		images1.add(i1);
		i1 = new ImageItem();
		i1.setName("travel7");
		i1.setPath("http://farm4.staticflickr.com/3140/2313445336_52ac868f55.jpg");
		images1.add(i1);
		i1 = new ImageItem();
		i1.setName("travel8");
		i1.setPath("http://farm4.staticflickr.com/3240/2312624831_fd4e5259cd.jpg");
		images1.add(i1);
		i1.setName("travel9");
		i1.setPath("http://farm4.staticflickr.com/3076/2312620925_a05d771744.jpg");
		images1.add(i1);

		// 0 for category icon, so icon will be first image from category
		CategoryItem travel4 = new CategoryItem("TRAVEL CATEGORY 4", 0, "dsc1",
				0, images1);
		travel.add(travel4);
		
		
		images1 = new ArrayList<Image>();
		i1 = new ImageItem();
		i1.setName("travel5");
		i1.setPath("http://farm4.staticflickr.com/3075/2312697545_331e0d0319.jpg");
		images1.add(i1);
		i1 = new ImageItem();
		i1.setName("travel4");
		i1.setPath("http://farm4.staticflickr.com/3171/2313510436_5058eb3751.jpg");
		images1.add(i1);
		i1 = new ImageItem();
		i1.setName("travel3");
		i1.setPath("http://farm4.staticflickr.com/3126/2313513212_62e01afd60.jpg");
		images1.add(i1); 
		i1 = new ImageItem();
		i1.setName("travel2");
		i1.setPath("http://farm4.staticflickr.com/3020/2312682227_397ae529e5.jpg");
		images1.add(i1);
		i1 = new ImageItem();
		i1.setName("travel1");
		i1.setPath("http://farm4.staticflickr.com/3017/2313492822_d9ee33dbc2.jpg");
		images1.add(i1);
		i1 = new ImageItem();
		i1.setName("travel6");
		i1.setPath("http://farm4.staticflickr.com/3014/2313447694_f76cb0188d.jpg");
		images1.add(i1);
		i1 = new ImageItem();
		i1.setName("travel7");
		i1.setPath("http://farm4.staticflickr.com/3140/2313445336_52ac868f55.jpg");
		images1.add(i1);
		i1 = new ImageItem();
		i1.setName("travel8");
		i1.setPath("http://farm4.staticflickr.com/3240/2312624831_fd4e5259cd.jpg");
		images1.add(i1);
		i1.setName("travel9");
		i1.setPath("http://farm4.staticflickr.com/3076/2312620925_a05d771744.jpg");
		images1.add(i1);


		// 0 for category icon, so icon will be first image from category
		CategoryItem travel5 = new CategoryItem("TRAVEL CATEGORY 5", 0, "dsc1",
				0, images1);
		travel.add(travel5);
		
		
		images1 = new ArrayList<Image>();
		i1 = new ImageItem();
		i1.setName("travel6");
		i1.setPath("http://farm4.staticflickr.com/3014/2313447694_f76cb0188d.jpg");
		images1.add(i1);
		i1 = new ImageItem();
		i1.setName("travel5");
		i1.setPath("http://farm4.staticflickr.com/3075/2312697545_331e0d0319.jpg");
		images1.add(i1);
		i1 = new ImageItem();
		i1.setName("travel4");
		i1.setPath("http://farm4.staticflickr.com/3171/2313510436_5058eb3751.jpg");
		images1.add(i1);
		i1 = new ImageItem();
		i1.setName("travel3");
		i1.setPath("http://farm4.staticflickr.com/3126/2313513212_62e01afd60.jpg");
		images1.add(i1); 
		i1 = new ImageItem();
		i1.setName("travel2");
		i1.setPath("http://farm4.staticflickr.com/3020/2312682227_397ae529e5.jpg");
		images1.add(i1);
		i1 = new ImageItem();
		i1.setName("travel1");
		i1.setPath("http://farm4.staticflickr.com/3017/2313492822_d9ee33dbc2.jpg");
		images1.add(i1);
		i1 = new ImageItem();
		i1.setName("travel7");
		i1.setPath("http://farm4.staticflickr.com/3140/2313445336_52ac868f55.jpg");
		images1.add(i1);
		i1 = new ImageItem();
		i1.setName("travel8");
		i1.setPath("http://farm4.staticflickr.com/3240/2312624831_fd4e5259cd.jpg");
		images1.add(i1);
		i1.setName("travel9");
		i1.setPath("http://farm4.staticflickr.com/3076/2312620925_a05d771744.jpg");
		images1.add(i1);

		// 0 for category icon, so icon will be first image from category
		CategoryItem travel6 = new CategoryItem("TRAVEL CATEGORY 6", 0, "dsc1",
				0, images1);
		travel.add(travel6);

		images1 = new ArrayList<Image>();
		i1 = new ImageItem();
		i1.setName("travel7");
		i1.setPath("http://farm4.staticflickr.com/3140/2313445336_52ac868f55.jpg");
		images1.add(i1);
		i1 = new ImageItem();
		i1.setName("travel6");
		i1.setPath("http://farm4.staticflickr.com/3014/2313447694_f76cb0188d.jpg");
		images1.add(i1);
		i1 = new ImageItem();
		i1.setName("travel5");
		i1.setPath("http://farm4.staticflickr.com/3075/2312697545_331e0d0319.jpg");
		images1.add(i1);
		i1 = new ImageItem();
		i1.setName("travel4");
		i1.setPath("http://farm4.staticflickr.com/3171/2313510436_5058eb3751.jpg");
		images1.add(i1);
		i1 = new ImageItem();
		i1.setName("travel3");
		i1.setPath("http://farm4.staticflickr.com/3126/2313513212_62e01afd60.jpg");
		images1.add(i1); 
		i1 = new ImageItem();
		i1.setName("travel2");
		i1.setPath("http://farm4.staticflickr.com/3020/2312682227_397ae529e5.jpg");
		images1.add(i1);
		i1 = new ImageItem();
		i1.setName("travel1");
		i1.setPath("http://farm4.staticflickr.com/3017/2313492822_d9ee33dbc2.jpg");
		images1.add(i1);
		i1 = new ImageItem();
		i1.setName("travel8");
		i1.setPath("http://farm4.staticflickr.com/3240/2312624831_fd4e5259cd.jpg");
		images1.add(i1);
		i1.setName("travel9");
		i1.setPath("http://farm4.staticflickr.com/3076/2312620925_a05d771744.jpg");
		images1.add(i1);

		// 0 for category icon, so icon will be first image from category
		CategoryItem travel7 = new CategoryItem("TRAVEL CATEGORY 7", 0, "dsc1",
				0, images1);
		travel.add(travel7);
		
		images1 = new ArrayList<Image>();
		i1 = new ImageItem();
		i1.setName("travel8");
		i1.setPath("http://farm4.staticflickr.com/3240/2312624831_fd4e5259cd.jpg");
		images1.add(i1);
		i1 = new ImageItem();
		i1.setName("travel7");
		i1.setPath("http://farm4.staticflickr.com/3140/2313445336_52ac868f55.jpg");
		images1.add(i1);
		i1 = new ImageItem();
		i1.setName("travel6");
		i1.setPath("http://farm4.staticflickr.com/3014/2313447694_f76cb0188d.jpg");
		images1.add(i1);
		i1 = new ImageItem();
		i1.setName("travel5");
		i1.setPath("http://farm4.staticflickr.com/3075/2312697545_331e0d0319.jpg");
		images1.add(i1);
		i1 = new ImageItem();
		i1.setName("travel4");
		i1.setPath("http://farm4.staticflickr.com/3171/2313510436_5058eb3751.jpg");
		images1.add(i1);
		i1 = new ImageItem();
		i1.setName("travel3");
		i1.setPath("http://farm4.staticflickr.com/3126/2313513212_62e01afd60.jpg");
		images1.add(i1); 
		i1 = new ImageItem();
		i1.setName("travel2");
		i1.setPath("http://farm4.staticflickr.com/3020/2312682227_397ae529e5.jpg");
		images1.add(i1);
		i1 = new ImageItem();
		i1.setName("travel1");
		i1.setPath("http://farm4.staticflickr.com/3017/2313492822_d9ee33dbc2.jpg");
		images1.add(i1);
		i1.setName("travel9");
		i1.setPath("http://farm4.staticflickr.com/3076/2312620925_a05d771744.jpg");
		images1.add(i1);

		// 0 for category icon, so icon will be first image from category
		CategoryItem travel8 = new CategoryItem("TRAVEL CATEGORY 8", 0, "dsc1",
				0, images1);
		travel.add(travel8);

		ArrayList<Image> images2 = new ArrayList<Image>();
		ImageItem i2 = new ImageItem();
		i2.setName("art1");
		i2.setPath("https://m1.behance.net/rendition/modules/60355227/disp/d6205a93cb19a12edaa7e1d7d4c9187a.jpg");
		images2.add(i2);
		i2 = new ImageItem();
		i2.setName("art2");
		i2.setPath("https://m1.behance.net/rendition/modules/60355229/disp/37f0f944cb868956b2970555402cd9e5.jpg");
		images2.add(i2);
		i2 = new ImageItem();
		i2.setName("art3");
		i2.setPath("https://m1.behance.net/rendition/modules/60355231/disp/45edccbe366512e5521e196dd7ad3bdd.jpg");
		images2.add(i2);
		i2 = new ImageItem();
		i2.setName("art4");
		i2.setPath("https://m1.behance.net/rendition/modules/93696909/disp/aeaa664c47352fafe262175a94dac588.jpg");
		images2.add(i2);
		i2 = new ImageItem();
		i2.setName("art5");
		i2.setPath("https://m1.behance.net/rendition/modules/60066633/disp/5ac253d2a685725e262f938afadcba5e.jpg");
		images2.add(i2);
		i2 = new ImageItem();
		i2.setName("art6");
		i2.setPath("https://m1.behance.net/rendition/modules/60068009/disp/83ba6558361d159755fa5ecadc7c6073.jpg");
		images2.add(i2);
		i2 = new ImageItem();
		i2.setName("art7");
		i2.setPath("https://m1.behance.net/rendition/modules/60066623/disp/6da632d417baae84dd13ec7f06c6f00b.jpg");
		images2.add(i2);
		i2 = new ImageItem();
		i2.setName("art8");
		i2.setPath("https://m1.behance.net/rendition/modules/60066631/disp/45b15806dbba8cd576a7c0ec9f55205b.jpg");
		images2.add(i2);
		i2.setName("art9");
		i2.setPath("https://m1.behance.net/rendition/modules/60066629/disp/099275cd35789350133ace9fcd9fb53c.jpg");
		images2.add(i2);
		i2.setName("art10");
		i2.setPath("https://m1.behance.net/rendition/modules/58989873/disp/5ece8e741cf50e73e5d647dbb88268b6.jpg");
		images2.add(i2);
		

		// 0 for category icon, so icon will be first image from category
		CategoryItem art1 = new CategoryItem("ART CATEGORY 1", 0, "dsc1", 0,
				images2);
		art.add(art1);

		images2 = new ArrayList<Image>();
		i2 = new ImageItem();
		i2.setName("art2");
		i2.setPath("https://m1.behance.net/rendition/modules/60355229/disp/37f0f944cb868956b2970555402cd9e5.jpg");
		images2.add(i2);
		i2 = new ImageItem();
		i2.setName("art1");
		i2.setPath("https://m1.behance.net/rendition/modules/60355227/disp/d6205a93cb19a12edaa7e1d7d4c9187a.jpg");
		images2.add(i2);
		i2 = new ImageItem();
		i2.setName("art3");
		i2.setPath("https://m1.behance.net/rendition/modules/60355231/disp/45edccbe366512e5521e196dd7ad3bdd.jpg");
		images2.add(i2);
		i2 = new ImageItem();
		i2.setName("art4");
		i2.setPath("https://m1.behance.net/rendition/modules/93696909/disp/aeaa664c47352fafe262175a94dac588.jpg");
		images2.add(i2);
		i2 = new ImageItem();
		i2.setName("art5");
		i2.setPath("https://m1.behance.net/rendition/modules/60066633/disp/5ac253d2a685725e262f938afadcba5e.jpg");
		images2.add(i2);
		i2 = new ImageItem();
		i2.setName("art6");
		i2.setPath("https://m1.behance.net/rendition/modules/60068009/disp/83ba6558361d159755fa5ecadc7c6073.jpg");
		images2.add(i2);
		i2 = new ImageItem();
		i2.setName("art7");
		i2.setPath("https://m1.behance.net/rendition/modules/60066623/disp/6da632d417baae84dd13ec7f06c6f00b.jpg");
		images2.add(i2);
		i2 = new ImageItem();
		i2.setName("art8");
		i2.setPath("https://m1.behance.net/rendition/modules/60066631/disp/45b15806dbba8cd576a7c0ec9f55205b.jpg");
		images2.add(i2);
		i2.setName("art9");
		i2.setPath("https://m1.behance.net/rendition/modules/60066629/disp/099275cd35789350133ace9fcd9fb53c.jpg");
		images2.add(i2);
		i2.setName("art10");
		i2.setPath("https://m1.behance.net/rendition/modules/58989877/disp/c5e6a5257958a26c617efc9920b24f1d.jpg");
		images2.add(i2);
		
		// 0 for category icon, so icon will be first image from category
		CategoryItem art2 = new CategoryItem("ART CATEGORY 2", 0, "dsc1", 0,
				images2);
		art.add(art2);

		images2 = new ArrayList<Image>();
		i2 = new ImageItem();
		i2.setName("art4");
		i2.setPath("https://m1.behance.net/rendition/modules/93696909/disp/aeaa664c47352fafe262175a94dac588.jpg");
		images2.add(i2);
		i2 = new ImageItem();
		i2.setName("art1");
		i2.setPath("https://m1.behance.net/rendition/modules/60355227/disp/d6205a93cb19a12edaa7e1d7d4c9187a.jpg");
		images2.add(i2);
		i2 = new ImageItem();
		i2.setName("art3");
		i2.setPath("https://m1.behance.net/rendition/modules/60355231/disp/45edccbe366512e5521e196dd7ad3bdd.jpg");
		images2.add(i2);
		i2 = new ImageItem();
		i2.setName("art2");
		i2.setPath("https://m1.behance.net/rendition/modules/60355229/disp/37f0f944cb868956b2970555402cd9e5.jpg");
		images2.add(i2);
		i2 = new ImageItem();
		i2.setName("art5");
		i2.setPath("https://m1.behance.net/rendition/modules/60066633/disp/5ac253d2a685725e262f938afadcba5e.jpg");
		images2.add(i2);
		i2 = new ImageItem();
		i2.setName("art6");
		i2.setPath("https://m1.behance.net/rendition/modules/60068009/disp/83ba6558361d159755fa5ecadc7c6073.jpg");
		images2.add(i2);
		i2 = new ImageItem();
		i2.setName("art7");
		i2.setPath("https://m1.behance.net/rendition/modules/60066623/disp/6da632d417baae84dd13ec7f06c6f00b.jpg");
		images2.add(i2);
		i2 = new ImageItem();
		i2.setName("art8");
		i2.setPath("https://m1.behance.net/rendition/modules/60066631/disp/45b15806dbba8cd576a7c0ec9f55205b.jpg");
		images2.add(i2);
		i2.setName("art9");
		i2.setPath("https://m1.behance.net/rendition/modules/60066629/disp/099275cd35789350133ace9fcd9fb53c.jpg");
		images2.add(i2);
		i2.setName("art10");
		i2.setPath("https://m1.behance.net/rendition/modules/58989873/disp/5ece8e741cf50e73e5d647dbb88268b6.jpg");
		images2.add(i2);
		
		
		// 0 for category icon, so icon will be first image from category
		CategoryItem art3 = new CategoryItem("ART CATEGORY 3", 0, "dsc1", 0,
				images2);
		art.add(art3);
		
		images2 = new ArrayList<Image>();
		i2 = new ImageItem();
		i2.setName("art5");
		i2.setPath("https://m1.behance.net/rendition/modules/60066633/disp/5ac253d2a685725e262f938afadcba5e.jpg");
		images2.add(i2);
		i2 = new ImageItem();
		i2.setName("art1");
		i2.setPath("https://m1.behance.net/rendition/modules/60355227/disp/d6205a93cb19a12edaa7e1d7d4c9187a.jpg");
		images2.add(i2);
		i2 = new ImageItem();
		i2.setName("art3");
		i2.setPath("https://m1.behance.net/rendition/modules/60355231/disp/45edccbe366512e5521e196dd7ad3bdd.jpg");
		images2.add(i2);
		i2 = new ImageItem();
		i2.setName("art2");
		i2.setPath("https://m1.behance.net/rendition/modules/60355229/disp/37f0f944cb868956b2970555402cd9e5.jpg");
		images2.add(i2);
		i2 = new ImageItem();
		i2.setName("art4");
		i2.setPath("https://m1.behance.net/rendition/modules/93696909/disp/aeaa664c47352fafe262175a94dac588.jpg");
		images2.add(i2);
		i2 = new ImageItem();
		i2.setName("art6");
		i2.setPath("https://m1.behance.net/rendition/modules/60068009/disp/83ba6558361d159755fa5ecadc7c6073.jpg");
		images2.add(i2);
		i2 = new ImageItem();
		i2.setName("art7");
		i2.setPath("https://m1.behance.net/rendition/modules/60066623/disp/6da632d417baae84dd13ec7f06c6f00b.jpg");
		images2.add(i2);
		i2 = new ImageItem();
		i2.setName("art8");
		i2.setPath("https://m1.behance.net/rendition/modules/60066631/disp/45b15806dbba8cd576a7c0ec9f55205b.jpg");
		images2.add(i2);
		i2.setName("art9");
		i2.setPath("https://m1.behance.net/rendition/modules/60066629/disp/099275cd35789350133ace9fcd9fb53c.jpg");
		images2.add(i2);
		i2.setName("art10");
		i2.setPath("https://m1.behance.net/rendition/modules/58989873/disp/5ece8e741cf50e73e5d647dbb88268b6.jpg");
		images2.add(i2);
		i2.setName("art10");
		i2.setPath("https://m1.behance.net/rendition/modules/58989877/disp/c5e6a5257958a26c617efc9920b24f1d.jpg");
		images2.add(i2);

		// 0 for category icon, so icon will be first image from category
		CategoryItem art4 = new CategoryItem("ART CATEGORY 4", 0, "dsc1", 0,
				images2);
		art.add(art4);

		images2 = new ArrayList<Image>();
		i2 = new ImageItem();
		i2.setName("art8");
		i2.setPath("https://m1.behance.net/rendition/modules/60066631/disp/45b15806dbba8cd576a7c0ec9f55205b.jpg");
		images2.add(i2);
		i2 = new ImageItem();
		i2.setName("art1");
		i2.setPath("https://m1.behance.net/rendition/modules/60355227/disp/d6205a93cb19a12edaa7e1d7d4c9187a.jpg");
		images2.add(i2);
		i2 = new ImageItem();
		i2.setName("art3");
		i2.setPath("https://m1.behance.net/rendition/modules/60355231/disp/45edccbe366512e5521e196dd7ad3bdd.jpg");
		images2.add(i2);
		i2 = new ImageItem();
		i2.setName("art2");
		i2.setPath("https://m1.behance.net/rendition/modules/60355229/disp/37f0f944cb868956b2970555402cd9e5.jpg");
		images2.add(i2);
		i2 = new ImageItem();
		i2.setName("art4");
		i2.setPath("https://m1.behance.net/rendition/modules/93696909/disp/aeaa664c47352fafe262175a94dac588.jpg");
		images2.add(i2);
		i2 = new ImageItem();
		i2.setName("art6");
		i2.setPath("https://m1.behance.net/rendition/modules/60068009/disp/83ba6558361d159755fa5ecadc7c6073.jpg");
		images2.add(i2);
		i2 = new ImageItem();
		i2.setName("art7");
		i2.setPath("https://m1.behance.net/rendition/modules/60066623/disp/6da632d417baae84dd13ec7f06c6f00b.jpg");
		images2.add(i2);
		i2 = new ImageItem();
		i2.setName("art5");
		i2.setPath("https://m1.behance.net/rendition/modules/60066633/disp/5ac253d2a685725e262f938afadcba5e.jpg");
		images2.add(i2);
		i2.setName("art9");
		i2.setPath("https://m1.behance.net/rendition/modules/60066629/disp/099275cd35789350133ace9fcd9fb53c.jpg");
		images2.add(i2);
		i2.setName("art10");
		i2.setPath("https://m1.behance.net/rendition/modules/58989873/disp/5ece8e741cf50e73e5d647dbb88268b6.jpg");
		images2.add(i2);
	
		// 0 for category icon, so icon will be first image from category
		CategoryItem art5 = new CategoryItem("ART CATEGORY 5", 0, "dsc1", 0,
				images2);
		art.add(art5);

		images2 = new ArrayList<Image>();
		i2 = new ImageItem();
		i2.setName("art9");
		i2.setPath("https://m1.behance.net/rendition/modules/60066629/disp/099275cd35789350133ace9fcd9fb53c.jpg");
		images2.add(i2);
		i2 = new ImageItem();
		i2.setName("art1");
		i2.setPath("https://m1.behance.net/rendition/modules/60355227/disp/d6205a93cb19a12edaa7e1d7d4c9187a.jpg");
		images2.add(i2);
		i2 = new ImageItem();
		i2.setName("art3");
		i2.setPath("https://m1.behance.net/rendition/modules/60355231/disp/45edccbe366512e5521e196dd7ad3bdd.jpg");
		images2.add(i2);
		i2 = new ImageItem();
		i2.setName("art2");
		i2.setPath("https://m1.behance.net/rendition/modules/60355229/disp/37f0f944cb868956b2970555402cd9e5.jpg");
		images2.add(i2);
		i2 = new ImageItem();
		i2.setName("art4");
		i2.setPath("https://m1.behance.net/rendition/modules/93696909/disp/aeaa664c47352fafe262175a94dac588.jpg");
		images2.add(i2);
		i2 = new ImageItem();
		i2.setName("art6");
		i2.setPath("https://m1.behance.net/rendition/modules/60068009/disp/83ba6558361d159755fa5ecadc7c6073.jpg");
		images2.add(i2);
		i2 = new ImageItem();
		i2.setName("art7");
		i2.setPath("https://m1.behance.net/rendition/modules/60066623/disp/6da632d417baae84dd13ec7f06c6f00b.jpg");
		images2.add(i2);
		i2 = new ImageItem();
		i2.setName("art5");
		i2.setPath("https://m1.behance.net/rendition/modules/60066633/disp/5ac253d2a685725e262f938afadcba5e.jpg");
		images2.add(i2);
		i2.setName("art8");
		i2.setPath("https://m1.behance.net/rendition/modules/60066631/disp/45b15806dbba8cd576a7c0ec9f55205b.jpg");
		images2.add(i2);
		i2.setName("art10");
		i2.setPath("https://m1.behance.net/rendition/modules/58989873/disp/5ece8e741cf50e73e5d647dbb88268b6.jpg");
		images2.add(i2);
		
		
		// 0 for category icon, so icon will be first image from category
		CategoryItem art6 = new CategoryItem("ART CATEGORY 6", 0, "dsc1", 0,
				images2);
		art.add(art6);

		images2 = new ArrayList<Image>();
		i2 = new ImageItem();
		i2.setName("art3");
		i2.setPath("https://m1.behance.net/rendition/modules/60355231/disp/45edccbe366512e5521e196dd7ad3bdd.jpg");
		images2.add(i2);
		i2 = new ImageItem();
		i2.setName("art1");
		i2.setPath("https://m1.behance.net/rendition/modules/60355227/disp/d6205a93cb19a12edaa7e1d7d4c9187a.jpg");
		images2.add(i2);
		i2 = new ImageItem();
		i2.setName("art9");
		i2.setPath("https://m1.behance.net/rendition/modules/60066629/disp/099275cd35789350133ace9fcd9fb53c.jpg");
		images2.add(i2);
		i2 = new ImageItem();
		i2.setName("art2");
		i2.setPath("https://m1.behance.net/rendition/modules/60355229/disp/37f0f944cb868956b2970555402cd9e5.jpg");
		images2.add(i2);
		i2 = new ImageItem();
		i2.setName("art4");
		i2.setPath("https://m1.behance.net/rendition/modules/93696909/disp/aeaa664c47352fafe262175a94dac588.jpg");
		images2.add(i2);
		i2 = new ImageItem();
		i2.setName("art6");
		i2.setPath("https://m1.behance.net/rendition/modules/60068009/disp/83ba6558361d159755fa5ecadc7c6073.jpg");
		images2.add(i2);
		i2 = new ImageItem();
		i2.setName("art7");
		i2.setPath("https://m1.behance.net/rendition/modules/60066623/disp/6da632d417baae84dd13ec7f06c6f00b.jpg");
		images2.add(i2);
		i2 = new ImageItem();
		i2.setName("art5");
		i2.setPath("https://m1.behance.net/rendition/modules/60066633/disp/5ac253d2a685725e262f938afadcba5e.jpg");
		images2.add(i2);
		i2.setName("art8");
		i2.setPath("https://m1.behance.net/rendition/modules/60066631/disp/45b15806dbba8cd576a7c0ec9f55205b.jpg");
		images2.add(i2);
		i2.setName("art10");
		i2.setPath("https://m1.behance.net/rendition/modules/58989873/disp/5ece8e741cf50e73e5d647dbb88268b6.jpg");
		images2.add(i2);
		
		// 0 for category icon, so icon will be first image from category
		CategoryItem art7 = new CategoryItem("ART CATEGORY 7", 0, "dsc1", 0,
				images2);
		art.add(art7);

		images2 = new ArrayList<Image>();
		i2 = new ImageItem();
		i2.setName("art10");
		i2.setPath("https://m1.behance.net/rendition/modules/58989873/disp/5ece8e741cf50e73e5d647dbb88268b6.jpg");
		images2.add(i2);
		i2 = new ImageItem();
		i2.setName("art1");
		i2.setPath("https://m1.behance.net/rendition/modules/60355227/disp/d6205a93cb19a12edaa7e1d7d4c9187a.jpg");
		images2.add(i2);
		i2 = new ImageItem();
		i2.setName("art9");
		i2.setPath("https://m1.behance.net/rendition/modules/60066629/disp/099275cd35789350133ace9fcd9fb53c.jpg");
		images2.add(i2);
		i2 = new ImageItem();
		i2.setName("art2");
		i2.setPath("https://m1.behance.net/rendition/modules/60355229/disp/37f0f944cb868956b2970555402cd9e5.jpg");
		images2.add(i2);
		i2 = new ImageItem();
		i2.setName("art4");
		i2.setPath("https://m1.behance.net/rendition/modules/93696909/disp/aeaa664c47352fafe262175a94dac588.jpg");
		images2.add(i2);
		i2 = new ImageItem();
		i2.setName("art6");
		i2.setPath("https://m1.behance.net/rendition/modules/60068009/disp/83ba6558361d159755fa5ecadc7c6073.jpg");
		images2.add(i2);
		i2 = new ImageItem();
		i2.setName("art7");
		i2.setPath("https://m1.behance.net/rendition/modules/60066623/disp/6da632d417baae84dd13ec7f06c6f00b.jpg");
		images2.add(i2);
		i2 = new ImageItem();
		i2.setName("art5");
		i2.setPath("https://m1.behance.net/rendition/modules/60066633/disp/5ac253d2a685725e262f938afadcba5e.jpg");
		images2.add(i2);
		i2.setName("art8");
		i2.setPath("https://m1.behance.net/rendition/modules/60066631/disp/45b15806dbba8cd576a7c0ec9f55205b.jpg");
		images2.add(i2);
		i2.setName("art3");
		i2.setPath("https://m1.behance.net/rendition/modules/60355231/disp/45edccbe366512e5521e196dd7ad3bdd.jpg");
		images2.add(i2);
		i2.setName("art10");
		i2.setPath("https://m1.behance.net/rendition/modules/58989877/disp/c5e6a5257958a26c617efc9920b24f1d.jpg");
		images2.add(i2);
		// 0 for category icon, so icon will be first image from category
		CategoryItem art8 = new CategoryItem("ART CATEGORY 8", 0, "dsc1", 0,
				images2);
		art.add(art8);

		images2 = new ArrayList<Image>();
		i2 = new ImageItem();
		i2.setName("art7");
		i2.setPath("https://m1.behance.net/rendition/modules/60066623/disp/6da632d417baae84dd13ec7f06c6f00b.jpg");
		images2.add(i2);
		i2 = new ImageItem();
		i2.setName("art1");
		i2.setPath("https://m1.behance.net/rendition/modules/60355227/disp/d6205a93cb19a12edaa7e1d7d4c9187a.jpg");
		images2.add(i2);
		i2 = new ImageItem();
		i2.setName("art9");
		i2.setPath("https://m1.behance.net/rendition/modules/60066629/disp/099275cd35789350133ace9fcd9fb53c.jpg");
		images2.add(i2);
		i2 = new ImageItem();
		i2.setName("art2");
		i2.setPath("https://m1.behance.net/rendition/modules/60355229/disp/37f0f944cb868956b2970555402cd9e5.jpg");
		images2.add(i2);
		i2 = new ImageItem();
		i2.setName("art4");
		i2.setPath("https://m1.behance.net/rendition/modules/93696909/disp/aeaa664c47352fafe262175a94dac588.jpg");
		images2.add(i2);
		i2 = new ImageItem();
		i2.setName("art6");
		i2.setPath("https://m1.behance.net/rendition/modules/60068009/disp/83ba6558361d159755fa5ecadc7c6073.jpg");
		images2.add(i2);
		i2 = new ImageItem();
		i2.setName("art10");
		i2.setPath("https://m1.behance.net/rendition/modules/58989873/disp/5ece8e741cf50e73e5d647dbb88268b6.jpg");
		images2.add(i2);
		i2 = new ImageItem();
		i2.setName("art5");
		i2.setPath("https://m1.behance.net/rendition/modules/60066633/disp/5ac253d2a685725e262f938afadcba5e.jpg");
		images2.add(i2);
		i2.setName("art8");
		i2.setPath("https://m1.behance.net/rendition/modules/60066631/disp/45b15806dbba8cd576a7c0ec9f55205b.jpg");
		images2.add(i2);
		i2.setName("art3");
		i2.setPath("https://m1.behance.net/rendition/modules/60355231/disp/45edccbe366512e5521e196dd7ad3bdd.jpg");
		images2.add(i2);
		i2.setName("art10");
		i2.setPath("https://m1.behance.net/rendition/modules/58989877/disp/c5e6a5257958a26c617efc9920b24f1d.jpg");
		images2.add(i2);
		// 0 for category icon, so icon will be first image from category
		CategoryItem art9 = new CategoryItem("ART CATEGORY 9", 0, "dsc1", 0,
				images2);
		art.add(art9);

		images2 = new ArrayList<Image>();
		i2 = new ImageItem();
		i2.setName("art6");
		i2.setPath("https://m1.behance.net/rendition/modules/60068009/disp/83ba6558361d159755fa5ecadc7c6073.jpg");
		images2.add(i2);
		i2 = new ImageItem();
		i2.setName("art1");
		i2.setPath("https://m1.behance.net/rendition/modules/60355227/disp/d6205a93cb19a12edaa7e1d7d4c9187a.jpg");
		images2.add(i2);
		i2 = new ImageItem();
		i2.setName("art9");
		i2.setPath("https://m1.behance.net/rendition/modules/60066629/disp/099275cd35789350133ace9fcd9fb53c.jpg");
		images2.add(i2);
		i2 = new ImageItem();
		i2.setName("art2");
		i2.setPath("https://m1.behance.net/rendition/modules/60355229/disp/37f0f944cb868956b2970555402cd9e5.jpg");
		images2.add(i2);
		i2 = new ImageItem();
		i2.setName("art4");
		i2.setPath("https://m1.behance.net/rendition/modules/93696909/disp/aeaa664c47352fafe262175a94dac588.jpg");
		images2.add(i2);
		i2 = new ImageItem();
		i2.setName("art7");
		i2.setPath("https://m1.behance.net/rendition/modules/60066623/disp/6da632d417baae84dd13ec7f06c6f00b.jpg");
		images2.add(i2);
		i2 = new ImageItem();
		i2.setName("art10");
		i2.setPath("https://m1.behance.net/rendition/modules/58989873/disp/5ece8e741cf50e73e5d647dbb88268b6.jpg");
		images2.add(i2);
		i2 = new ImageItem();
		i2.setName("art5");
		i2.setPath("https://m1.behance.net/rendition/modules/60066633/disp/5ac253d2a685725e262f938afadcba5e.jpg");
		images2.add(i2);
		i2.setName("art8");
		i2.setPath("https://m1.behance.net/rendition/modules/60066631/disp/45b15806dbba8cd576a7c0ec9f55205b.jpg");
		images2.add(i2);
		i2.setName("art3");
		i2.setPath("https://m1.behance.net/rendition/modules/60355231/disp/45edccbe366512e5521e196dd7ad3bdd.jpg");
		images2.add(i2);
		i2.setName("art10");
		i2.setPath("https://m1.behance.net/rendition/modules/58989877/disp/c5e6a5257958a26c617efc9920b24f1d.jpg");
		images2.add(i2);
		// 0 for category icon, so icon will be first image from category
		CategoryItem art10 = new CategoryItem("ART CATEGORY 10", 0, "dsc1", 0,
				images2);
		art.add(art10);

		ArrayList<Image> images3 = new ArrayList<Image>();
		ImageItem i3 = new ImageItem();
		i3.setName("family1");
		i3.setPath("http://farm8.staticflickr.com/7190/6856101611_ae9ac2aa3e.jpg");
		images3.add(i3);

		i3 = new ImageItem();
		i3.setName("family2");
		i3.setPath("http://farm5.staticflickr.com/4108/4954701922_ae2e5896ae.jpg");
		images3.add(i3);

		i3 = new ImageItem();
		i3.setName("family3");
		i3.setPath("http://farm5.staticflickr.com/4125/4954074291_d485fe5024.jpg");
		images3.add(i3);

		i3 = new ImageItem();
		i3.setName("family4");
		i3.setPath("http://farm8.staticflickr.com/7061/6941756263_8d08bd6b5f.jpg");
		images3.add(i3);

		i3 = new ImageItem();
		i3.setName("family5");
		i3.setPath("http://farm8.staticflickr.com/7209/6795644216_bec455ae64.jpg");
		images3.add(i3);

		i3 = new ImageItem();
		i3.setName("family6");
		i3.setPath("http://farm8.staticflickr.com/7210/6795650654_6e43671e04.jpg");
		images3.add(i3);

		i3 = new ImageItem();
		i3.setName("family7");
		i3.setPath("http://farm8.staticflickr.com/7192/6795627838_3a0cf94f55.jpg");
		images3.add(i3);

		i3 = new ImageItem();
		i3.setName("family8");
		i3.setPath("http://farm8.staticflickr.com/7064/6856103291_c46f18b406.jpg");
		images3.add(i3);

		i3 = new ImageItem();
		i3.setName("family9");
		i3.setPath("http://farm8.staticflickr.com/7198/6941768633_96487fc8d9.jpg");
		images3.add(i3);
		
		i3 = new ImageItem();
		i3.setName("family10");
		i3.setPath("http://farm8.staticflickr.com/7040/6941750507_e65f721eb0.jpg");
		images3.add(i3);

		// 0 for category icon, so icon will be first image from category
		CategoryItem family1 = new CategoryItem("FAMILY CATEGORY 1", 0, "dsc1",
				0, images3);
		family.add(family1);

		images3 = new ArrayList<Image>();
		i3 = new ImageItem();
		i3.setName("family2");
		i3.setPath("http://farm5.staticflickr.com/4108/4954701922_ae2e5896ae.jpg");
		images3.add(i3);

		i3 = new ImageItem();
		i3.setName("family1");
		i3.setPath("http://farm8.staticflickr.com/7190/6856101611_ae9ac2aa3e.jpg");
		images3.add(i3);

		i3 = new ImageItem();
		i3.setName("family3");
		i3.setPath("http://farm5.staticflickr.com/4125/4954074291_d485fe5024.jpg");
		images3.add(i3);

		i3 = new ImageItem();
		i3.setName("family4");
		i3.setPath("http://farm8.staticflickr.com/7061/6941756263_8d08bd6b5f.jpg");
		images3.add(i3);

		i3 = new ImageItem();
		i3.setName("family5");
		i3.setPath("http://farm8.staticflickr.com/7209/6795644216_bec455ae64.jpg");
		images3.add(i3);

		i3 = new ImageItem();
		i3.setName("family6");
		i3.setPath("http://farm8.staticflickr.com/7210/6795650654_6e43671e04.jpg");
		images3.add(i3);

		images3 = new ArrayList<Image>();
		i3 = new ImageItem();
		i3.setName("family7");
		i3.setPath("http://farm8.staticflickr.com/7192/6795627838_3a0cf94f55.jpg");
		images3.add(i3);

		i3 = new ImageItem();
		i3.setName("family8");
		i3.setPath("http://farm8.staticflickr.com/7064/6856103291_c46f18b406.jpg");
		images3.add(i3);

		i3 = new ImageItem();
		i3.setName("family9");
		i3.setPath("http://farm8.staticflickr.com/7198/6941768633_96487fc8d9.jpg");
		images3.add(i3);
		
		i3 = new ImageItem();
		i3.setName("family10");
		i3.setPath("http://farm8.staticflickr.com/7040/6941750507_e65f721eb0.jpg");
		images3.add(i3);

		// 0 for category icon, so icon will be first image from category
		CategoryItem family2 = new CategoryItem("FAMILY CATEGORY 2", 0, "dsc1",
				0, images3);
		family.add(family2);
		
		images3 = new ArrayList<Image>();
		i3 = new ImageItem();
		i3.setName("family3");
		i3.setPath("http://farm5.staticflickr.com/4125/4954074291_d485fe5024.jpg");
		images3.add(i3);

		i3 = new ImageItem();
		i3.setName("family1");
		i3.setPath("http://farm8.staticflickr.com/7190/6856101611_ae9ac2aa3e.jpg");
		images3.add(i3);

		i3 = new ImageItem();
		i3.setName("family2");
		i3.setPath("http://farm5.staticflickr.com/4108/4954701922_ae2e5896ae.jpg");
		images3.add(i3);

		i3 = new ImageItem();
		i3.setName("family4");
		i3.setPath("http://farm8.staticflickr.com/7061/6941756263_8d08bd6b5f.jpg");
		images3.add(i3);

		i3 = new ImageItem();
		i3.setName("family5");
		i3.setPath("http://farm8.staticflickr.com/7209/6795644216_bec455ae64.jpg");
		images3.add(i3);

		i3 = new ImageItem();
		i3.setName("family6");
		i3.setPath("http://farm8.staticflickr.com/7210/6795650654_6e43671e04.jpg");
		images3.add(i3);

		i3 = new ImageItem();
		i3.setName("family7");
		i3.setPath("http://farm8.staticflickr.com/7192/6795627838_3a0cf94f55.jpg");
		images3.add(i3);

		i3 = new ImageItem();
		i3.setName("family8");
		i3.setPath("http://farm8.staticflickr.com/7064/6856103291_c46f18b406.jpg");
		images3.add(i3);

		i3 = new ImageItem();
		i3.setName("family9");
		i3.setPath("http://farm8.staticflickr.com/7198/6941768633_96487fc8d9.jpg");
		images3.add(i3);
		
		i3 = new ImageItem();
		i3.setName("family10");
		i3.setPath("http://farm8.staticflickr.com/7040/6941750507_e65f721eb0.jpg");
		images3.add(i3);


		// 0 for category icon, so icon will be first image from category
		CategoryItem family3 = new CategoryItem("FAMILY CATEGORY 3", 0, "dsc1",
				0, images3);
		family.add(family3);

		images3 = new ArrayList<Image>();
		i3 = new ImageItem();
		i3.setName("family4");
		i3.setPath("http://farm8.staticflickr.com/7061/6941756263_8d08bd6b5f.jpg");
		images3.add(i3);

		images3 = new ArrayList<Image>();
		i3 = new ImageItem();
		i3.setName("family1");
		i3.setPath("http://farm8.staticflickr.com/7190/6856101611_ae9ac2aa3e.jpg");
		images3.add(i3);

		i3 = new ImageItem();
		i3.setName("family2");
		i3.setPath("http://farm5.staticflickr.com/4108/4954701922_ae2e5896ae.jpg");
		images3.add(i3);

		i3 = new ImageItem();
		i3.setName("family3");
		i3.setPath("http://farm5.staticflickr.com/4125/4954074291_d485fe5024.jpg");
		images3.add(i3);

		i3 = new ImageItem();
		i3.setName("family5");
		i3.setPath("http://farm8.staticflickr.com/7209/6795644216_bec455ae64.jpg");
		images3.add(i3);

		i3 = new ImageItem();
		i3.setName("family6");
		i3.setPath("http://farm8.staticflickr.com/7210/6795650654_6e43671e04.jpg");
		images3.add(i3);

		i3 = new ImageItem();
		i3.setName("family7");
		i3.setPath("http://farm8.staticflickr.com/7192/6795627838_3a0cf94f55.jpg");
		images3.add(i3);

		i3 = new ImageItem();
		i3.setName("family8");
		i3.setPath("http://farm8.staticflickr.com/7064/6856103291_c46f18b406.jpg");
		images3.add(i3);

		i3 = new ImageItem();
		i3.setName("family9");
		i3.setPath("http://farm8.staticflickr.com/7198/6941768633_96487fc8d9.jpg");
		images3.add(i3);
		
		i3 = new ImageItem();
		i3.setName("family10");
		i3.setPath("http://farm8.staticflickr.com/7040/6941750507_e65f721eb0.jpg");
		images3.add(i3);

		// 0 for category icon, so icon will be first image from category
		CategoryItem family4 = new CategoryItem("FAMILY CATEGORY 4", 0, "dsc1",
				0, images3);
		family.add(family4);

		images3 = new ArrayList<Image>();
		i3 = new ImageItem();
		i3.setName("family5");
		i3.setPath("http://farm8.staticflickr.com/7209/6795644216_bec455ae64.jpg");
		images3.add(i3);

		i3 = new ImageItem();
		i3.setName("family1");
		i3.setPath("http://farm8.staticflickr.com/7190/6856101611_ae9ac2aa3e.jpg");
		images3.add(i3);

		i3 = new ImageItem();
		i3.setName("family2");
		i3.setPath("http://farm5.staticflickr.com/4108/4954701922_ae2e5896ae.jpg");
		images3.add(i3);

		i3 = new ImageItem();
		i3.setName("family3");
		i3.setPath("http://farm5.staticflickr.com/4125/4954074291_d485fe5024.jpg");
		images3.add(i3);

		i3 = new ImageItem();
		i3.setName("family4");
		i3.setPath("http://farm8.staticflickr.com/7061/6941756263_8d08bd6b5f.jpg");
		images3.add(i3);

		i3 = new ImageItem();
		i3.setName("family6");
		i3.setPath("http://farm8.staticflickr.com/7210/6795650654_6e43671e04.jpg");
		images3.add(i3);

		i3 = new ImageItem();
		i3.setName("family7");
		i3.setPath("http://farm8.staticflickr.com/7192/6795627838_3a0cf94f55.jpg");
		images3.add(i3);

		i3 = new ImageItem();
		i3.setName("family8");
		i3.setPath("http://farm8.staticflickr.com/7064/6856103291_c46f18b406.jpg");
		images3.add(i3);

		i3 = new ImageItem();
		i3.setName("family9");
		i3.setPath("http://farm8.staticflickr.com/7198/6941768633_96487fc8d9.jpg");
		images3.add(i3);
		
		i3 = new ImageItem();
		i3.setName("family10");
		i3.setPath("http://farm8.staticflickr.com/7040/6941750507_e65f721eb0.jpg");
		images3.add(i3);

		// 0 for category icon, so icon will be first image from category
		CategoryItem family5 = new CategoryItem("FAMILY CATEGORY 5", 0, "dsc1",
				0, images3);
		family.add(family5);

		images3 = new ArrayList<Image>();
		i3 = new ImageItem();
		i3.setName("family6");
		i3.setPath("http://farm8.staticflickr.com/7210/6795650654_6e43671e04.jpg");
		images3.add(i3);

		i3 = new ImageItem();
		i3.setName("family1");
		i3.setPath("http://farm8.staticflickr.com/7190/6856101611_ae9ac2aa3e.jpg");
		images3.add(i3);

		i3 = new ImageItem();
		i3.setName("family2");
		i3.setPath("http://farm5.staticflickr.com/4108/4954701922_ae2e5896ae.jpg");
		images3.add(i3);

		i3 = new ImageItem();
		i3.setName("family3");
		i3.setPath("http://farm5.staticflickr.com/4125/4954074291_d485fe5024.jpg");
		images3.add(i3);

		i3 = new ImageItem();
		i3.setName("family4");
		i3.setPath("http://farm8.staticflickr.com/7061/6941756263_8d08bd6b5f.jpg");
		images3.add(i3);

		i3 = new ImageItem();
		i3.setName("family5");
		i3.setPath("http://farm8.staticflickr.com/7209/6795644216_bec455ae64.jpg");
		images3.add(i3);

		i3 = new ImageItem();
		i3.setName("family7");
		i3.setPath("http://farm8.staticflickr.com/7192/6795627838_3a0cf94f55.jpg");
		images3.add(i3);

		i3 = new ImageItem();
		i3.setName("family8");
		i3.setPath("http://farm8.staticflickr.com/7064/6856103291_c46f18b406.jpg");
		images3.add(i3);

		i3 = new ImageItem();
		i3.setName("family9");
		i3.setPath("http://farm8.staticflickr.com/7198/6941768633_96487fc8d9.jpg");
		images3.add(i3);
		
		i3 = new ImageItem();
		i3.setName("family10");
		i3.setPath("http://farm8.staticflickr.com/7040/6941750507_e65f721eb0.jpg");
		images3.add(i3);
		// 0 for category icon, so icon will be first image from category
		CategoryItem family6 = new CategoryItem("FAMILY CATEGORY 6", 0, "dsc1",
				0, images3);
		family.add(family6);

		images3 = new ArrayList<Image>();
		i3 = new ImageItem();
		i3.setName("family7");
		i3.setPath("http://farm8.staticflickr.com/7192/6795627838_3a0cf94f55.jpg");
		images3.add(i3);

		i3 = new ImageItem();
		i3.setName("family1");
		i3.setPath("http://farm8.staticflickr.com/7190/6856101611_ae9ac2aa3e.jpg");
		images3.add(i3);

		i3 = new ImageItem();
		i3.setName("family2");
		i3.setPath("http://farm5.staticflickr.com/4108/4954701922_ae2e5896ae.jpg");
		images3.add(i3);

		i3 = new ImageItem();
		i3.setName("family3");
		i3.setPath("http://farm5.staticflickr.com/4125/4954074291_d485fe5024.jpg");
		images3.add(i3);

		i3 = new ImageItem();
		i3.setName("family4");
		i3.setPath("http://farm8.staticflickr.com/7061/6941756263_8d08bd6b5f.jpg");
		images3.add(i3);

		i3 = new ImageItem();
		i3.setName("family5");
		i3.setPath("http://farm8.staticflickr.com/7209/6795644216_bec455ae64.jpg");
		images3.add(i3);

		i3 = new ImageItem();
		i3.setName("family6");
		i3.setPath("http://farm8.staticflickr.com/7210/6795650654_6e43671e04.jpg");
		images3.add(i3);

		i3 = new ImageItem();
		i3.setName("family8");
		i3.setPath("http://farm8.staticflickr.com/7064/6856103291_c46f18b406.jpg");
		images3.add(i3);

		i3 = new ImageItem();
		i3.setName("family9");
		i3.setPath("http://farm8.staticflickr.com/7198/6941768633_96487fc8d9.jpg");
		images3.add(i3);
		
		i3 = new ImageItem();
		i3.setName("family10");
		i3.setPath("http://farm8.staticflickr.com/7040/6941750507_e65f721eb0.jpg");
		images3.add(i3);
		// 0 for category icon, so icon will be first image from category
		CategoryItem family7 = new CategoryItem("FAMILY CATEGORY 7", 0, "dsc1",
				0, images3);
		family.add(family7);

		images3 = new ArrayList<Image>();
		i3 = new ImageItem();
		i3.setName("family8");
		i3.setPath("http://farm8.staticflickr.com/7064/6856103291_c46f18b406.jpg");
		images3.add(i3);

		i3 = new ImageItem();
		i3.setName("family1");
		i3.setPath("http://farm8.staticflickr.com/7190/6856101611_ae9ac2aa3e.jpg");
		images3.add(i3);

		i3 = new ImageItem();
		i3.setName("family2");
		i3.setPath("http://farm5.staticflickr.com/4108/4954701922_ae2e5896ae.jpg");
		images3.add(i3);

		i3 = new ImageItem();
		i3.setName("family3");
		i3.setPath("http://farm5.staticflickr.com/4125/4954074291_d485fe5024.jpg");
		images3.add(i3);

		images3 = new ArrayList<Image>();
		i3 = new ImageItem();
		i3.setName("family4");
		i3.setPath("http://farm8.staticflickr.com/7061/6941756263_8d08bd6b5f.jpg");
		images3.add(i3);

		i3 = new ImageItem();
		i3.setName("family5");
		i3.setPath("http://farm8.staticflickr.com/7209/6795644216_bec455ae64.jpg");
		images3.add(i3);

		i3 = new ImageItem();
		i3.setName("family6");
		i3.setPath("http://farm8.staticflickr.com/7210/6795650654_6e43671e04.jpg");
		images3.add(i3);

		i3 = new ImageItem();
		i3.setName("family7");
		i3.setPath("http://farm8.staticflickr.com/7192/6795627838_3a0cf94f55.jpg");
		images3.add(i3);

		i3 = new ImageItem();
		i3.setName("family9");
		i3.setPath("http://farm8.staticflickr.com/7198/6941768633_96487fc8d9.jpg");
		images3.add(i3);
		
		i3 = new ImageItem();
		i3.setName("family10");
		i3.setPath("http://farm8.staticflickr.com/7040/6941750507_e65f721eb0.jpg");
		images3.add(i3);
		// 0 for category icon, so icon will be first image from category
		CategoryItem family8 = new CategoryItem("FAMILY CATEGORY 8", 0, "dsc1",
				0, images3);
		family.add(family8);

	}

}
