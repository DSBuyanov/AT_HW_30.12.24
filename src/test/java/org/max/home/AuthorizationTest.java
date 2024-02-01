package org.max.home;

import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.text;

public class AuthorizationTest {

    @Test
        void getAuthorizationWithoutParams() {
        open("https://test-stand.gb.ru/login");

        LoginPage loginPage = new LoginPage();
        loginPage.LoginInSystemWithoutParams();

        SelenideElement checkElement = $x("//h2[@class='svelte-uwkxn9']");
        checkElement.shouldHave(text("401"));
    }
}
