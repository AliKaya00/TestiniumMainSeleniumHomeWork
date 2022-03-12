package com.kitapyurdu.test;

import com.kitapyurdu.driver.BaseTestForKitapYurdu;
import com.kitapyurdu.methods.Methods;
import org.junit.Assert;
import org.junit.Test;
import com.kitapyurdu.page.KitapyurduLoginPage;

public class KitapYurduLoginTest extends BaseTestForKitapYurdu {
    @Test
    public void loginTest(){
        KitapyurduLoginPage kitapyurduLoginPage = new KitapyurduLoginPage();
        kitapyurduLoginPage.login();

    }


}
