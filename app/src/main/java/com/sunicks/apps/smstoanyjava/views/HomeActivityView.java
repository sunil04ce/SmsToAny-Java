package com.sunicks.apps.smstoanyjava.views;

import com.sunicks.apps.smstoanyjava.models.AppFeatures;

import java.util.List;

public interface HomeActivityView {

    void displayAppFeatures(List<AppFeatures> appFeaturesList);
    void displayNoAppFeatures();
}
