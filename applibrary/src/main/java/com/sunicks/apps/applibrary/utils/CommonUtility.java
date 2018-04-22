package com.sunicks.apps.applibrary.utils;

import android.content.Context;
import android.util.TypedValue;

public class CommonUtility {
    public String removeLastCharacterOfText(String text, String character) {
        if (text != null) {
            text = text.trim();
            if (text.endsWith(character)) {
                text = text.substring(0, text.length() - 1);
            }
        }
        return text;
    }

    public float getFontSizeInSP(Context context, float fontSize) {
        return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_SP, fontSize, context.getResources().getDisplayMetrics());
    }

}
