package com.csform.onlinegallery.model;
 

import android.os.Parcelable;
/**
 * Image interface
 * @author itcsform
 *
 */
public interface Image extends Parcelable {

	public String getTitle();
	
	public String getDescription();

	public String getPath();

	public String getThumbPath();

}
