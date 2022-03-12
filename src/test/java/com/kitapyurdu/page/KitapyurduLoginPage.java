package com.kitapyurdu.page;

import com.kitapyurdu.driver.BaseTestForKitapYurdu;
import com.kitapyurdu.methods.Methods;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;

public class KitapyurduLoginPage{

    Methods methods;
    Logger logger1 = LogManager.getLogger(KitapyurduLoginPage.class);
    public KitapyurduLoginPage(){
        methods = new Methods();
    }

    public void login(){
        methods.click(By.cssSelector(".menu-top-button.login"));
        methods.waitBySeconds(2);
        methods.sendKeys(By.id("login-email"),"tramendous34@gmail.com");
        methods.waitBySeconds(1);
        methods.sendKeys(By.id("login-password"),"kitap3112666");
        methods.waitBySeconds(1);
        methods.click(By.cssSelector(".ky-btn.ky-btn-orange.w-100.ky-login-btn"));
        methods.waitBySeconds(2);
        Assert.assertTrue(methods.isElementVisible(By.cssSelector(".section")));
        logger1.info("Login Olundu");



    }

}
