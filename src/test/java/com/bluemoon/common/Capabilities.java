package com.bluemoon.common;

import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by Johnson on 2016/10/8.
 */
public class Capabilities {
    public static DesiredCapabilities getCapabilities(){
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"Android");
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Seledoird");
        capabilities.setCapability(MobileCapabilityType.APP, "D:\\trainingsystem.apk");
        capabilities.setCapability("unicodeKeyboard", "True");
        capabilities.setCapability("resetKeyboard", "True");
        capabilities.setCapability("appPackage", "com.bluemoon.sz.trainingsystem");
        capabilities.setCapability("appActivity", ".activity.LoadingActivity");
        return  capabilities;
    }
    public  static URL getUrl() {
        URL url = null;
        try {
            url = new URL("http://127.0.0.1:4723/wd/hub");
        } catch (MalformedURLException e) {
            System.out.println("url 错误！");
            e.printStackTrace();
        }
        return  url;
    }

    public  void test(){
        By
    }
}
