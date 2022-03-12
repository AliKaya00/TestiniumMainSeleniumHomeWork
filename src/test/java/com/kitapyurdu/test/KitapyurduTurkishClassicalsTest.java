package com.kitapyurdu.test;

import com.kitapyurdu.driver.BaseTestForKitapYurdu;
import com.kitapyurdu.page.KitapyurduAccountPage;
import com.kitapyurdu.page.KitapyurduLoginPage;
import com.kitapyurdu.page.KitapyurduTurkishClassicals;
import org.junit.Test;

import javax.security.auth.login.LoginContext;

public class KitapyurduTurkishClassicalsTest extends BaseTestForKitapYurdu {

    @Test
    public void KitapyurduTurkishClassicalsTest(){
      KitapyurduLoginPage loginPage = new KitapyurduLoginPage();
      loginPage.login();
      KitapyurduAccountPage accountPage = new KitapyurduAccountPage();
      accountPage.KitapyurduAccountPage();
      KitapyurduTurkishClassicals kitapyurduTurkishClassicals = new KitapyurduTurkishClassicals();
      kitapyurduTurkishClassicals.clickRandomProduct();







    }




}
