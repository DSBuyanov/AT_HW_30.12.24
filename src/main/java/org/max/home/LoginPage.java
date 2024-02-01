package org.max.home;

import static com.codeborne.selenide.Selenide.$x;

public class LoginPage {


    private String loginFieldXPath = "//input[@type='text']";
    private String passwordFieldXPath = "//input[@type='password']";
    private String loginButtonXPath = "//*[@class='mdc-button__label']";

    public LoginPage() {

    }

    public void loginInSystem(String login, String password) {
        $x(loginFieldXPath).setValue(login);
        $x(passwordFieldXPath).setValue(password);
        $x(loginButtonXPath).click();
    }

    public void LoginInSystemWithoutParams() {
        $x(loginButtonXPath).click();
    }
}
