package com.web.base.pagesteps;

import com.thoughtworks.gauge.Step;
import com.web.base.pages.LoginPage;

public class LoginPageSteps {

    LoginPage loginPage=new LoginPage();

    @Step("Kullanıcı bilgileri doldurulur.")
    public void fillLoginFormSteps(){
        loginPage.fillLoginForm();
    }
}
