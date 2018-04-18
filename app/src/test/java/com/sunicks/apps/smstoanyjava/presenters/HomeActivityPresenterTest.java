package com.sunicks.apps.smstoanyjava.presenters;

import com.sunicks.apps.smstoanyjava.models.AppFeatures;
import com.sunicks.apps.smstoanyjava.repositories.HomeRepository;
import com.sunicks.apps.smstoanyjava.views.HomeActivityView;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class HomeActivityPresenterTest {

    /*@Test
    public void shouldPass(){
        Assert.assertEquals(1,1);
    }*/

    @Test
    public void shouldPassHomeActivityToHomeActivityView(){
        //given
        HomeActivityView view = new MockView();
        HomeRepository homeRepository = new MockHomeRepository(false);

        // when
        HomeActivityPresenter presenter = new HomeActivityPresenter(view, homeRepository);
        presenter.loadAppFeatures();

        //then
        Assert.assertEquals(3, ((MockView)view).appHasFeaturesCount);
    }

    @Test
    public void shouldPassHomeActivityNoFeatureToActivityView(){
        //given
        HomeActivityView view = new MockView();
        HomeRepository homeRepository = new MockHomeRepository(true);

        // when
        HomeActivityPresenter presenter = new HomeActivityPresenter(view, homeRepository);
        presenter.loadAppFeatures();

        //then
        Assert.assertEquals(0, ((MockView)view).appHasFeaturesCount);
    }

    private class MockView implements HomeActivityView {

        long appHasFeaturesCount = -1;

        @Override
        public void displayAppFeatures(List<AppFeatures> appFeaturesList) {
            if(appFeaturesList.size()==3) appHasFeaturesCount = appFeaturesList.size();
        }

        @Override
        public void displayNoAppFeatures() {
            appHasFeaturesCount = 0;
        }
    }

    private class MockHomeRepository implements HomeRepository {

        private boolean isNoFeatures;

        public MockHomeRepository(boolean isNoFeatures) {
            this.isNoFeatures = isNoFeatures;
        }

        @Override
        public List<AppFeatures> getAppFeatures() {
            if(isNoFeatures) {
                return Collections.emptyList();
            } else {
                return Arrays.asList(new AppFeatures(), new AppFeatures(), new AppFeatures());
            }
        }
    }
}