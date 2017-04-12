package com.bluemoon.page;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

/**
 * Created by Johnson on 2016/10/8.
 */
public class LoginPage extends BasePage{
   public LoginPage(AndroidDriver<?> driver){
        super(driver);
    }

    @AndroidFindBy(id="com.bluemoon.sz.trainingsystem:id/login_account_et")
    private AndroidElement  user;
    @AndroidFindBy(id="com.bluemoon.sz.trainingsystem:id/login_pwd_et")
    private  AndroidElement password;
    @AndroidFindBy(id="com.bluemoon.sz.trainingsystem:id/btn_login")
    private  AndroidElement login;

    public BasePage login(String user,String password){
        this.user.sendKeys(user);
        this.password.sendKeys(password);
        this.login.click();
        return new MainPage(getDriver());
    }


    public AndroidElement getUser() {
        return user;
    }

    public void setUser(AndroidElement user) {
        this.user = user;
    }

    public AndroidElement getPassword() {
        return password;
    }

    public void setPassword(AndroidElement password) {
        this.password = password;
    }

    public AndroidElement getLogin() {
        return login;
    }

    public void setLogin(AndroidElement login) {
        this.login = login;
    }

}
