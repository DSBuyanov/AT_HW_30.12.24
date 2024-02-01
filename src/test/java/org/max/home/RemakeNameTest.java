package org.max.home;

import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.text;

public class RemakeNameTest {

    @Test
        void getDummyIDRewritten() {
        open("https://test-stand.gb.ru/login");
        LoginPage loginPage = new LoginPage();
        loginPage.loginInSystem("Tester1347", "11bdc518d8");
        RemakeNamePage remakeNamePage = new RemakeNamePage();
        remakeNamePage.openFirstDummyCardAndSaveNewName("RemakeNameTest");
        remakeNamePage.openProfile();
        $("tbody tr td").shouldHave(text("96799"));
    }
}
