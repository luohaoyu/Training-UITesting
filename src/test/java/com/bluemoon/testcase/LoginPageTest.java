package com.bluemoon.testcase;

import com.bluemoon.common.Capabilities;
import com.bluemoon.page.LoginPage;
import com.bluemoon.page.MainPage;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Created by Johnson on 2016/10/8.
 */
public class LoginPageTest {
    AndroidDriver<AndroidElement> driver;
    AppiumDriverLocalService service;
    LoginPage loginPage ;
    @BeforeMethod
    public void setUp(){
        System.setProperty(AppiumServiceBuilder.APPIUM_PATH,"D:\\soft\\appium\\node_modules\\appium\\bin\\appium.js");
        service = AppiumDriverLocalService.buildDefaultService();
        service.start();
        driver = new AndroidDriver<AndroidElement>(service.getUrl(), Capabilities.getCapabilities());
    }

    @Test
    public  void testLogin(){
        loginPage = new LoginPage(driver);
        MainPage mainPage= (MainPage) loginPage.login("80498706","lhy123456");
        mainPage.search("测试");
    }

    public void tearDown(){
        driver.quit();
        service.stop();
    }
}
