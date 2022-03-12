package com.kitapyurdu.page;

import com.kitapyurdu.methods.Methods;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;

public class KitapyurduAccountPage {

    Methods methods;
    Logger logger = LogManager.getLogger(KitapyurduAccountPage.class);


    public void KitapyurduAccountPage() {
        methods = new Methods();

        methods.click(By.id("search-input"));
        methods.sendKeys(By.id("search-input"), "Oyuncak");
        methods.waitBySeconds(1);
        methods.click(By.cssSelector(".common-sprite.button-search"));
        methods.waitBySeconds(3);
        methods.scrollWithAction(By.id("faceted-search-group-6"));
        methods.waitBySeconds(3);
        methods.addFavorites();
        methods.waitBySeconds(3);
        methods.addFavoritesControl();
        methods.click(By.xpath("//div[@class='logo-icon']"));
        logger.info("Ürünler Favoritelere eklendi");






    }


}
