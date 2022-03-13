package com.kitapyurdu.page;

import com.kitapyurdu.methods.Methods;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.util.Assert;
import org.openqa.selenium.By;

public class KitapyurduAccountPage {

    Methods methods;
    Logger logger = LogManager.getLogger(KitapyurduAccountPage.class);


    public void KitapyurduAccountPage() {
        methods = new Methods();

        methods.click(By.id("search-input"));
        methods.sendKeys(By.id("search-input"), "Oyuncak");
        methods.isElementVisible(By.id("search-input"));
        methods.click(By.cssSelector(".common-sprite.button-search"));
        methods.isElementVisible(By.cssSelector(".common-sprite.button-search"));
        methods.scrollWithAction(By.id("faceted-search-group-6"));
        methods.isElementVisible(By.id("faceted-search-group-6"));
        methods.addFavorites();
        methods.waitBySeconds(2);
        methods.addFavoritesControl();
        methods.waitBySeconds(2);
        methods.click(By.xpath("//div[@class='logo-icon']"));
        logger.info("Ürünler Favoritelere eklendi");






    }


}
