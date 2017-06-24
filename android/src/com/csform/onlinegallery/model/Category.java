package com.csform.onlinegallery.model;

import java.util.ArrayList;

import android.os.Parcelable;
/**
 * Category interface
 * @author itcsform
 */
public interface Category extends Parcelable{
	
	public String getTitle();
	public int getIconRes();
	public ArrayList<Image> getImages();

}
