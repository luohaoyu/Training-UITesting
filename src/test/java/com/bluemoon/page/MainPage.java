package com.bluemoon.page;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

/**
 * Created by Johnson on 2016/10/8.
 */
public class MainPage extends BasePage{
    MainPage(AndroidDriver<?> driver) {
        super(driver);
    }
    @AndroidFindBy(id="com.bluemoon.sz.trainingsystem:id/tv_tbb_title")
    AndroidElement title;
    @AndroidFindBy(id="com.bluemoon.sz.trainingsystem:id/img_right")
    AndroidElement search;
    public void search(String s){
        search.click();
        SearchPage searchPage= new SearchPage(getDriver());
        searchPage.input(s);
    }
}
