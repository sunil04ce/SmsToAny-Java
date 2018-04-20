package com.sunicks.apps.applibrary.utils;

public class CommonUtility {
    public String removeLastCharacterOfText(String text, String character) {
        if(text!=null) {
            text = text.trim();
            if (text.endsWith(character)) {
                text = text.substring(0, text.length()-1);
            }
        }
        return text;
    }
}
