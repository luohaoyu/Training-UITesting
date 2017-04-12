package com.bluemoon.page;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Johnson on 2016/10/8.
 */
 public abstract class BasePage {

    private AndroidDriver<?> driver;
    BasePage(AndroidDriver<?> driver){
        this.driver =driver;

        PageFactory.initElements( new AppiumFieldDecorator(driver),this);
    }


    public AndroidDriver<?> getDriver() {
        return driver;
    }

    public void setDriver(AndroidDriver<?> driver) {
        this.driver = driver;
    }

}
