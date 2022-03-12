package com.kitapyurdu.test;

import com.kitapyurdu.driver.BaseTestForKitapYurdu;
import com.kitapyurdu.page.KitapyurduAccountPage;
import com.kitapyurdu.page.KitapyurduBox;
import com.kitapyurdu.page.KitapyurduLoginPage;
import com.kitapyurdu.page.KitapyurduTurkishClassicals;
import org.junit.Test;

public class KitapYurduBoxTest extends BaseTestForKitapYurdu {

    @Test
    public void mainTest(){
        KitapyurduLoginPage loginPage = new KitapyurduLoginPage();

        KitapyurduAccountPage kitapyurduAccountPage = new KitapyurduAccountPage();

        KitapyurduTurkishClassicals kitapyurduTurkishClassicals = new KitapyurduTurkishClassicals();

        KitapyurduBox kitapyurduBox = new KitapyurduBox();

        loginPage.login();

        kitapyurduAccountPage.KitapyurduAccountPage();

        kitapyurduTurkishClassicals.KitapyurduTurkishClassicals();

        kitapyurduTurkishClassicals.clickRandomProduct();

        kitapyurduBox.payment();









    }


}
