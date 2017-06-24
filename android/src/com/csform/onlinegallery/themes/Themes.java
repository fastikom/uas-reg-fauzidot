package com.csform.onlinegallery.themes;

import com.csform.onlinegallery.R;
/**
 * Themes used for gallery  
 * @author itcsform
 *
 */

public class Themes {
	 
	public static int THEME1=0,THEME2=1,THEME3=2;
	public static String[] FONTS = {"fonts/Roboto-Bold.ttf","fonts/Amatic-Bold.ttf","fonts/Ostrich-Medium.ttf"}; 
	public static int[] GRID_LAYOUT = {R.layout.t1_category_grid,R.layout.t2_category_grid,R.layout.t3_category_grid};
	public static int[] GRID_ITEM_LAYOUT = {R.layout.t1_category_grid_item,R.layout.t2_category_grid_item,R.layout.t3_category_grid_item};
	public static int[] GALLERY_LAYOUT = {R.layout.t1_gallery,R.layout.t2_gallery,R.layout.t3_gallery};
	public static int[] CATEGORY_NUMBER_OF_COLUMNS = {1,2,1}; 
	public static int[] THUMB_NUMBER_OF_COLUMNS = {2,1,2}; 
	public static int[] SPLASH_SCREEN_BACKGROUND_DRAWABLE = {R.drawable.t1_title_backgroud_color,R.drawable.t2_title_backgroud_color,R.drawable.t3_title_backgroud_color};
	public static boolean[] IS_CATEGORY_TEXT_ENABLED = {true,true,true};  
	public static boolean[] IS_THUMB_TEXT_ENABLED = {false,true,false};  
	
	
	/**
	 * Returns resID of selected layout(grid layout)
	 * @param theme
	 * @return
	 */
	public static int getGridLayout(int theme){
	
			return GRID_LAYOUT[theme];
	}
	
	
	/**
	 * Returns resID of selected layout(grid item layout)
	 * @param theme
	 * @return
	 */
	public static int getGridLayoutItem(int theme){
		return GRID_ITEM_LAYOUT[theme];
	}
	
	/**
	 * Returns Path of font for selected theme
	 * @param theme
	 * @return
	 */
	public static String getFont(int theme){
		return FONTS[theme];
	}
	
	/**
	 * Returns number of catrgory columns for selected theme
	 * @param theme
	 * @return
	 */
	public static int getNumberOfCategoryColumns(int theme){
		return CATEGORY_NUMBER_OF_COLUMNS[theme];
	}
	
	/**
	 * Returns number of thumb columns for selected theme
	 * @param theme
	 * @return
	 */
	public static int getNumberOfThumbColumns(int theme){
		return THUMB_NUMBER_OF_COLUMNS[theme];
	}
	
	/**
	 * Returns is text on category item enabled or not
	 * @param theme
	 * @return
	 */
	public static boolean isCategoryTextEnabled(int theme){
		return IS_CATEGORY_TEXT_ENABLED[theme];
	}
	
	/**
	 * Returns is text on thumb item enabled or not
	 * @param theme
	 * @return
	 */
	public static boolean isThumbTextEnabled(int theme){
		return IS_THUMB_TEXT_ENABLED[theme];
	}
	
	/**
	 * Returns resID of gallery layout for selected theme
	 * @param theme
	 * @return
	 */
	public static int getGalleryLayout(int theme){
		return GALLERY_LAYOUT[theme];
	}
	
	/**
	 * Returns resID of splash screen background for selected theme
	 * @param theme
	 * @return
	 */
	public static int getSplashScreenBackground(int theme){
		return SPLASH_SCREEN_BACKGROUND_DRAWABLE[theme];
	}
	
	 
}
/*




 


*/