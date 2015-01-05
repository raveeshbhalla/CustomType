package in.raveesh.customtype;

import android.content.Context;
import android.util.AttributeSet;

public class TextView extends android.widget.TextView {

    public TextView(Context context, AttributeSet attrs) {
		super(context, attrs);
		for (int i = 0; i < attrs.getAttributeCount(); i++) {
			/**
			 * Searching for the typeface attribute
			 */
			if (attrs.getAttributeName(i).equals("typeface")) {
				String typeface = attrs.getAttributeValue(i);
				if (!isInEditMode()) {
					try {
						setTypeface(Helper.getTypeface(context, typeface));
					} catch (RuntimeException e) {
                        e.printStackTrace();
					}
				}
				break;
			}
		}
	}
}
