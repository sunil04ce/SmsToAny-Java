package com.sunicks.apps.applibrary.customviews.textviews;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;
import android.util.TypedValue;

import com.sunicks.apps.applibrary.R;
import com.sunicks.apps.applibrary.utils.CommonUtility;

public class TextViewRegular extends AppCompatTextView{

    public TextViewRegular(Context context) {
        super(context);
        setCustomStyle();
    }

    public TextViewRegular(Context context, AttributeSet attrs) {
        super(context, attrs);
        setCustomStyle();
    }

    public TextViewRegular(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        setCustomStyle();
    }

    private void setCustomStyle(){
//        setBackgroundColor(Color.TRANSPARENT);
        setTextColor(ContextCompat.getColor(getContext(), R.color.colorPrimary));
        setTextSize(TypedValue.COMPLEX_UNIT_PX, new CommonUtility().getFontSizeInSP(getContext(), getContext().getResources().getInteger(R.integer.textsize_18)));
        Typeface typeface = Typeface.createFromAsset(getContext().getAssets(), getContext().getString(R.string.path_of_regular_font));
        setTypeface(typeface);
    }
}
