package com.bluemoon.page;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

/**
 * Created by Johnson on 2016/10/8.
 */
public class SearchPage extends BasePage{
    public SearchPage(AndroidDriver<?> driver) {
        super(driver);
    }
    @AndroidFindBy(id="com.bluemoon.sz.trainingsystem:id/noResult_rl")
    AndroidElement input;

    public void input(String s ){
        getDriver();
        input.sendKeys(s);
    }

}
