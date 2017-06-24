package com.csform.onlinegallery.sample.models;

import java.util.ArrayList;

import com.csform.onlinegallery.model.Category;
import com.csform.onlinegallery.model.Image;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Sample model, used in Sample app
 * Implemented Category interface
 * @author itcsform
 *
 */
 
public class CategoryItem  implements Category{

	//
	private String name;
	private int resIcon;
	private String description;
	private int position;
	ArrayList<Image> images = new ArrayList<Image>();

	public CategoryItem(String name, int resIcon, String description, int position,
			ArrayList<Image> images) {
		super();
		this.name = name;
		this.resIcon = resIcon;
		this.description = description;
		this.images = images;
		this.position = position;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getResIcon() {
		return resIcon;
	}

	public void setResIcon(int resIcon) {
		this.resIcon = resIcon;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}
	
	public void setImages(ArrayList<Image> images) {
		this.images = images;
	} 

 
	//CATEGORY INTERFACE 
	@Override
	public String getTitle() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public int getIconRes() {
		// TODO Auto-generated method stub
		return resIcon;
	}

	@Override
	public ArrayList<Image> getImages() {
		// TODO Auto-generated method stub
		return this.images;
	}

 

	//PARCELABLE INTERFACE
	 
	public CategoryItem(Parcel in) {
		readFromParcel(in); 
	}

	/**
	 * Read from parcel.
	 *
	 * @param in the in
	 */
	@SuppressWarnings("unchecked")
	private void readFromParcel(Parcel in) {
		name  = in.readString();
		resIcon = in.readInt();
		description = in.readString();
		in.readTypedList(images, ImageItem.CREATOR);
		position = in.readInt();
		
	}

	/* (non-Javadoc)
	 * @see android.os.Parcelable#describeContents()
	 */
	@Override
	public int describeContents() {
		return 0;
	}

	/* (non-Javadoc)
	 * @see android.os.Parcelable#writeToParcel(android.os.Parcel, int)
	 */
	@Override
	public void writeToParcel(Parcel dest, int flags) {
		dest.writeString(name);
		dest.writeInt(resIcon);
		dest.writeString(description);
		dest.writeTypedList(images);
		dest.writeInt(position);
	}
 
	/**
 
	/** The Constant CREATOR. */
	@SuppressWarnings("rawtypes")
	public static final Parcelable.Creator CREATOR = new Parcelable.Creator() {
		public CategoryItem createFromParcel(Parcel in) {
			return new CategoryItem(in);
		}

		public CategoryItem[] newArray(int size) {
			return new CategoryItem[size];
		}
	};

	
 
}
