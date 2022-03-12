package com.kitapyurdu.page;

import com.kitapyurdu.driver.BaseTestForKitapYurdu;
import com.kitapyurdu.methods.Methods;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;

public class KitapyurduHomePage {
    Logger logger = LogManager.getLogger(KitapyurduHomePage.class);

    Methods methods;

    public KitapyurduHomePage() {
        methods = new Methods();
    }

    public void home() {
        methods.waitBySeconds(5);
        Assert.assertTrue(methods.isElementVisible(By.xpath("//div[@class='logo-icon']")));
        logger.info("home Page");
    }
}