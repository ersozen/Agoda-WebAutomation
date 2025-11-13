package com.web.base.pagesteps;

import com.thoughtworks.gauge.Step;
import com.web.base.pages.HomePage;

public class HomePageSteps {
    HomePage homePage=new HomePage();

    @Step("Login sayfasına gidilir.")
    public void goLogin(){
        homePage.loginPageEnter();
    }

}
