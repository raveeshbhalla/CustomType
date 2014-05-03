package co.robototext;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;

public class EditText extends android.widget.EditText {

	String TAG = "co.roboto.TextView";
	Context mContext;

	public EditText(Context context, AttributeSet attrs) {
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
					}
				}
				break;
			}
		}

	}

	@Override
	public void setTypeface(Typeface tf) {

		// TODO Auto-generated method stub
		super.setTypeface(tf);
	}
}
