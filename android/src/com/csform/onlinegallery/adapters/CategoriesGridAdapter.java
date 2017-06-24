package com.csform.onlinegallery.adapters;

import java.util.ArrayList;

import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.csform.onlinegallery.R;
import com.csform.onlinegallery.model.Category;
import com.csform.onlinegallery.themes.Themes;
/**
 * Adapter used for categoryGrid
 * @author itcsform
 *
 */
public class CategoriesGridAdapter extends GalleryBaseAdapter {

	private ArrayList<Category> categories; 

	/*
	 * ViewHolder contains views in item
	 */
	class ViewHolder {
		private ImageView image;
		private TextView text;
	}

	/**
	 * public Constructor
	 * 
	 * @param context
	 * @param imageLoader
	 * @param categories
	 * @param is_title_enabled
	 */
	public CategoriesGridAdapter(Context context,
			ArrayList<Category> categories,int theme) {
		super(context,theme);
		this.context = context;
		this.categories = categories; 
		 

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see android.widget.Adapter#getCount()
	 */
	@Override
	public int getCount() {

		return categories.size();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see android.widget.Adapter#getItem(int)
	 */
	@Override
	public Object getItem(int arg0) {
		// TODO Auto-generated method stub
		return categories.get(arg0);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see android.widget.Adapter#getItemId(int)
	 */
	@Override
	public long getItemId(int arg0) {
		// TODO Auto-generated method stub
		return arg0;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see android.widget.Adapter#getView(int, android.view.View,
	 * android.view.ViewGroup)
	 */
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		
		final ViewHolder holder;
		
		//if convertView null inflate layout
		if (convertView == null) {
			convertView = inflater.inflate(Themes.getGridLayoutItem(theme), parent,
					false);
			holder = new ViewHolder();

			holder.image = (ImageView) convertView.findViewById(R.id.image);

			holder.text = (TextView) convertView.findViewById(R.id.text);
			holder.text.setTypeface(Typeface.createFromAsset(context.getAssets(), Themes.getFont(theme)));
			if (Themes.isCategoryTextEnabled(theme))
				holder.text.setVisibility(View.VISIBLE);
			convertView.setTag(holder);
		//if not get convertView from tag
		} else {
			holder = (ViewHolder) convertView.getTag();
		}
		
		//if title enabled set text
		if (Themes.isCategoryTextEnabled(theme))
			holder.text.setText(categories.get(position).getTitle());
		
		//if there is category icon use it, if not use first picture in category
		if (categories.get(position).getIconRes() != 0)
			holder.image
					.setImageResource(categories.get(position).getIconRes());
		else
			imageLoader.displayImage(categories.get(position).getImages()
					.get(0).getPath(),holder.image, options); 
		return convertView;
	}

}
