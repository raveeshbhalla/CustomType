package in.raveesh.customtype;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;

public class TextView extends android.widget.TextView {
	String TAG = "in.raveesh.customtype.TextView";

	Context mContext;

	public TextView(Context context, AttributeSet attrs) {
		super(context, attrs);
		mContext = context;
		for (int i = 0; i < attrs.getAttributeCount(); i++) {
			/**
			 * Searching for the typeface attribute
			 */
			if (attrs.getAttributeName(i).equals("typeface")) {
				String typeface = attrs.getAttributeValue(i);
				if (!isInEditMode()) {
					try {
						setTypeface(Roboto.getTypeface(mContext, typeface));
					} catch (RuntimeException e) {
                        e.printStackTrace();
					}
				}
				break;
			}
		}
	}

	@Override
	public void setTypeface(Typeface tf) {
		super.setTypeface(tf);
	}
}
