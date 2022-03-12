package com.kitapyurdu.page;

import com.kitapyurdu.methods.Methods;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.lang.reflect.Method;
import java.util.List;
import java.util.Random;

public class KitapyurduTurkishClassicals {

    Methods methods;
    Logger logger = LogManager.getLogger(KitapyurduTurkishClassicals.class);

    public void KitapyurduTurkishClassicals(){

        methods = new Methods();

        methods.click(By.cssSelector(".lvl1catalog"));
        methods.waitBySeconds(3);
        methods.click(By.cssSelector("#landing-point>div:nth-child(4)>a:nth-child(2)>img"));
        methods.waitBySeconds(3);
        methods.click(By.xpath("//*[@id='content']//select/option[6]"));
        methods.waitBySeconds(3);
        methods.click(By.xpath("//*[@id=\"mainNav\"]//ul/li[1]//ul/li[3]/span"));
        methods.waitBySeconds(3);
        methods.click(By.xpath("//*[@id='mainNav']//ul/li[1]//ul/li[3]//ul[2]/li[14]/a"));
        methods.waitBySeconds(3);



    }
    public void clickRandomProduct(){
        Random rnd = new Random();
        List<WebElement> Products = methods.findElements(By.cssSelector(".cover"));
        WebElement rndProduct = Products.get(rnd.nextInt(Products.size()));
        rndProduct.click();
        logger.info("Rastgele ürün seçildi");
    }



}
