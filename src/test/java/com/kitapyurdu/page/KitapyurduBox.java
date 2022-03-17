package com.kitapyurdu.page;

import com.kitapyurdu.methods.Methods;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;

public class KitapyurduBox {

    Methods methods;
    Logger logger2 = LogManager.getLogger(KitapyurduBox.class);
    public void payment() {
        methods = new Methods();

        methods.scrollWithAction(By.cssSelector(".add-to-cart.btn-orange.btn-ripple"));
        methods.isElementVisible(By.cssSelector(".add-to-cart.btn-orange.btn-ripple"));
        methods.click(By.cssSelector(".add-to-cart.btn-orange.btn-ripple"));
        methods.isElementVisible(By.cssSelector(".add-to-cart.btn-orange.btn-ripple"));
        methods.scrollWithAction(By.xpath("//*[@id='header-top']/div/div[2]/ul/li[1]/div/ul/li/a"));
        methods.isElementVisible(By.xpath("//*[@id='header-top']/div/div[2]/ul/li[1]/div/ul/li/a"));
        methods.click(By.xpath("//*[@id=\'header-top\']//ul/li[1]//ul/li//ul/li[1]/a"));
        methods.isElementVisible(By.xpath("//*[@id=\'header-top\']//ul/li[1]//ul/li//ul/li[1]/a"));
        methods.click(By.xpath("(//*[@data-title='Favorilerimden Sil'])[3]"));
        methods.isElementVisible(By.xpath("(//*[@data-title='Favorilerimden Sil'])[3]"));
        methods.click(By.xpath("//*[@id='cart-items']"));
        methods.waitBySeconds(2);
        methods.click(By.id("js-cart"));
        methods.waitBySeconds(2);
        methods.click(By.xpath("//*[@id='cart_module']//table/tbody/tr/td[4]/form/input[1]"));
        methods.sendKeys(By.xpath("//*[@id='cart_module']//table/tbody/tr/td[4]/form/input[1]"), "2");
        methods.click(By.xpath("//*[@id='cart_module']//table/thead/tr/td[8]/a"));
        methods.waitBySeconds(2);
        methods.click(By.id("address-firstname-companyname"));
        methods.sendKeys(By.id("address-firstname-companyname"),"Ali");
        methods.waitBySeconds(2);
        methods.click(By.id("address-lastname-title"));
        methods.sendKeys(By.id("address-lastname-title"), "Kaya");
        methods.waitBySeconds(2);
        methods.click(By.xpath("//*[@id=\'address-zone-id\']"));
        methods.sendKeys(By.xpath("//*[@id='address-zone-id']"),"r");
        methods.waitBySeconds(2);
        methods.click(By.id("address-county-id"));
        methods.sendKeys(By.id("address-county-id"),"d");
        methods.click(By.id("address-address-text"));
        methods.sendKeys(By.id("address-address-text"), "asd");
        methods.click(By.id("address-telephone"));
        methods.sendKeys(By.id("address-telephone"),"5369573434");
        methods.click(By.id("address-mobile-telephone"));
        methods.sendKeys(By.id("address-mobile-telephone"), "5369573434");
        methods.waitBySeconds(2);
        methods.click(By.id("button-checkout-continue"));
        methods.click(By.id("button-checkout-continue"));
        methods.click(By.id("credit-card-owner"));
        methods.sendKeys(By.id("credit-card-owner"),"alikaya");
        methods.click(By.id("credit_card_number_1"));
        methods.sendKeys(By.id("credit_card_number_1"),"4234234564522411");
        methods.click(By.id("credit-card-expire-date-month"));
        methods.sendKeys(By.id("credit-card-expire-date-month"),"1");
        methods.click(By.id("credit_card_expire_date_year"));
        methods.sendKeys(By.id("credit_card_expire_date_year"), "2");
        methods.click(By.id("credit-card-security-code"));
        methods.sendKeys(By.id("credit-card-security-code"),"123");
        methods.waitBySeconds(2);
        methods.click(By.id("button-checkout-continue"));
        methods.click(By.xpath("//*[@id='logo']/a/img"));
        methods.waitBySeconds(2);
        methods.click(By.xpath("//*[@id=2header-top']//ul/li//ul/li[4]/a"));

        logger2.info("Logout işlemi tamamlandı");











    }
}