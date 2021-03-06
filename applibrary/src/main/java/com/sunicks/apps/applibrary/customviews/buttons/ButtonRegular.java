package com.sunicks.apps.applibrary.customviews.buttons;

import android.content.Context;
import android.graphics.Typeface;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.AppCompatButton;
import android.util.AttributeSet;
import android.util.TypedValue;

import com.sunicks.apps.applibrary.R;
import com.sunicks.apps.applibrary.utils.CommonUtility;

public class ButtonRegular extends AppCompatButton {
    public ButtonRegular(Context context) {
        super(context);
        setCustomStyle();
    }

    public ButtonRegular(Context context, AttributeSet attrs) {
        super(context, attrs);
        setCustomStyle();
    }

    public ButtonRegular(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        setCustomStyle();
    }

    private void setCustomStyle(){
        setBackgroundColor(ContextCompat.getColor(getContext(), R.color.colorPrimary));
        setTextColor(ContextCompat.getColor(getContext(), R.color.colorWhite));
        setTextSize(TypedValue.COMPLEX_UNIT_PX, new CommonUtility().getFontSizeInSP(getContext(), getContext().getResources().getInteger(R.integer.textsize_18)));
        Typeface typeface = Typeface.createFromAsset(getContext().getAssets(), getContext().getString(R.string.path_of_regular_font));
        setTypeface(typeface);
    }
}
