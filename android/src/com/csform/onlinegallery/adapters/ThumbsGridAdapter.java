package com.csform.onlinegallery.adapters;

import java.util.ArrayList;

import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.csform.onlinegallery.R;
import com.csform.onlinegallery.model.Image;
import com.csform.onlinegallery.themes.Themes;

public class ThumbsGridAdapter extends GalleryBaseAdapter {

	private ArrayList<Image> images;

	class ViewHolder {
		private ImageView image;
		private TextView text;
	}

	public ThumbsGridAdapter(Context context, ArrayList<Image> images, int theme) {
		super(context, theme);
		this.images = images;
	}

	@Override
	public int getCount() {
		if (images == null)
			return 0;
		return images.size();
	}

	@Override
	public Object getItem(int arg0) {
		// TODO Auto-generated method stub
		return images.get(arg0);
	}

	@Override
	public long getItemId(int arg0) {
		// TODO Auto-generated method stub
		return arg0;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub

		final ViewHolder holder;

		if (convertView == null) {
			convertView = inflater.inflate(Themes.getGridLayoutItem(theme),
					parent, false);
			holder = new ViewHolder();

			holder.image = (ImageView) convertView.findViewById(R.id.image);

			holder.text = (TextView) convertView.findViewById(R.id.text);
			holder.text.setTypeface(Typeface.createFromAsset(
					context.getAssets(), Themes.getFont(theme)));
			if (Themes.isThumbTextEnabled(theme))
				holder.text.setVisibility(View.VISIBLE);
			convertView.setTag(holder);
		} else {
			holder = (ViewHolder) convertView.getTag();
		}
		// if text not null set it
		if (Themes.isThumbTextEnabled(theme))
			holder.text.setText(images.get(position).getTitle());
		String tmpPath = "";
		if (images.get(position).getThumbPath() != null)
			tmpPath = images.get(position).getThumbPath();

		tmpPath = images.get(position).getPath();
		imageLoader.displayImage(tmpPath, holder.image, options);

		return convertView;
	}

}
