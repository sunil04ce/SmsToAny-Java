package com.sunicks.apps.smstoanyjava.presenters;

import com.sunicks.apps.smstoanyjava.models.AppFeatures;
import com.sunicks.apps.smstoanyjava.repositories.HomeRepository;
import com.sunicks.apps.smstoanyjava.views.HomeActivityView;

import java.util.List;

public class HomeActivityPresenter {
    private HomeActivityView view;
    private HomeRepository homeRepository;

    public HomeActivityPresenter(HomeActivityView view, HomeRepository homeRepository) {
        this.view = view;
        this.homeRepository = homeRepository;
    }

    public void loadAppFeatures() {
        List<AppFeatures> appFeatures = homeRepository.getAppFeatures();
        if(appFeatures.size()==0) {
            view.displayNoAppFeatures();
        } else {
            view.displayAppFeatures(appFeatures);
        }
    }
}
