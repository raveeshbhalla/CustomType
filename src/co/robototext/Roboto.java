package co.robototext;

import java.util.HashMap;

import android.content.Context;
import android.graphics.Typeface;

public class Roboto {
	public final static int BLACK = 1;
	public final static int BLACK_ITALIC = 2;
	public final static int BOLD = 3;
	public final static int BOLD_ITALIC = 4;
	public final static int ITALIC = 5;
	public final static int LIGHT = 6;
	public final static int LIGHT_ITALIC = 7;
	public final static int MEDIUM = 8;
	public final static int MEDIUM_ITALIC = 9;
	public final static int REGULAR = 10;
	public final static int THIN = 11;
	public final static int THIN_ITALIC = 12;

	public final static int CONDENSED_BOLD = 13;
	public final static int CONDENSED_BOLD_ITALIC = 14;
	public final static int CONDENSED_ITALIC = 15;
	public final static int CONDENSED_LIGHT = 16;
	public final static int CONDENSED_LIGHT_ITALIC = 17;
	public final static int CONDENSED_REGULAR = 18;

	public final static int SLAB_BOLD = 19;
	public final static int SLAB_LIGHT = 20;
	public final static int SLAB_THIN = 21;
	public final static int SLAB_REGULAR = 22;
	private static HashMap<String, Typeface> typefaces = new HashMap<String, Typeface>();
	private static String fonts = "fonts/";
	private static String regular = "Roboto";
	private static String condensed = "RobotoCondensed";
	private static String slab = "RobotoSlab";

	private final static int total = 22;
	private final static String defaultFont = regular + "Regular.ttf";

	/**
	 * @param context
	 * @param typeface
	 * @return
	 */
	public static Typeface getTypeface(Context context, int typeface) {
		String path = defaultFont;
		if (typeface <= total && typeface != 0) {

			switch (typeface) {
			case BLACK:
				path = regular + "/Black.ttf";
				break;
			case BLACK_ITALIC:
				path = regular + "/BlackItalic.ttf";
				break;
			case BOLD:
				path = regular + "/Bold.ttf";
				break;
			case BOLD_ITALIC:
				path = regular + "/BoldItalic.ttf";
				break;
			case ITALIC:
				path = regular + "/Italic.ttf";
				break;
			case LIGHT:
				path = regular + "/Light.ttf";
				break;
			case LIGHT_ITALIC:
				path = regular + "/LightItalic.ttf";
				break;
			case MEDIUM:
				path = regular + "/Medium.ttf";
				break;
			case MEDIUM_ITALIC:
				path = regular + "/MediumItalic.ttf";
				break;
			case REGULAR:
				path = regular + "/Regular.ttf";
				break;
			case THIN:
				path = regular + "/Thin.ttf";
				break;
			case THIN_ITALIC:
				path = regular + "/ThinItalic.ttf";
				break;

			case CONDENSED_BOLD:
				path = condensed + "/Bold.ttf";
				break;
			case CONDENSED_BOLD_ITALIC:
				path = condensed + "/BoldItalic.ttf";
				break;
			case CONDENSED_ITALIC:
				path = condensed + "/Italic.ttf";
				break;
			case CONDENSED_LIGHT:
				path = condensed + "/Light.ttf";
				break;
			case CONDENSED_LIGHT_ITALIC:
				path = condensed + "/LightItalic.ttf";
				break;
			case CONDENSED_REGULAR:
				path = condensed + "/Regular.ttf";
				break;

			case SLAB_BOLD:
				path = slab + "/Bold.ttf";
				break;
			case SLAB_LIGHT:
				path = slab + "/Light.ttf";
				break;
			case SLAB_THIN:
				path = slab + "/Thin.ttf";
				break;
			case SLAB_REGULAR:
				path = slab + "/Regular.ttf";
				break;
			}
		}
		if (typefaces.containsKey(path)){
			return typefaces.get(path);
		}
		else{
			Typeface tf = Typeface.createFromAsset(context.getAssets(), fonts+path);
			typefaces.put(path, tf);
			return tf;
		}
	}
	
	public static Typeface getTypeface(Context context, String path){
		if (typefaces.containsKey(path)){
			return typefaces.get(path);
		}
		else{
			Typeface tf = Typeface.createFromAsset(context.getAssets(), fonts+path);
			typefaces.put(path, tf);
			return tf;
		}
	}
}
