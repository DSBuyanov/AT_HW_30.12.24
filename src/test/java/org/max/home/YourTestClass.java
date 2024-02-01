package org.max.home;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;

import com.codeborne.selenide.Configuration;
import static com.codeborne.selenide.Condition.disappear;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;


public class YourTestClass {

    @BeforeAll
    static void setUp() {
        Configuration.browser = "chrome";
        Configuration.headless = false;
        Configuration.baseUrl = "https://test-stand.gb.ru/";
        Configuration.timeout = 10000;
    }

    @Test
    public void yourTest() {
        login("Tester1347", "11bdc518d8");
        addDummy("Dummy", "Tester1347");
        saveScreenshotWithTimestamp();
    }

    @AfterAll
    public static void tearDown() {
        closeWebDriver();
    }

    private static void login(String username, String password) {
        open("/login");
        $("form#login input[type='text']").setValue(username);
        $("form#login input[type='password']").setValue(password);
        $("form#login button").click();
    }

    private static void addDummy(String dummyName, String dummyDescription) {
        $("#create-btn").click();
        $("#create-item").shouldBe(visible);
        $("input[type='text']").setValue(dummyName);
        $("div.field textarea.mdc-text-field__input").setValue(dummyDescription);
        $("button[type='submit'][form='create-item']").click();
        $("#create-item").should(disappear);
    }

    private static void saveScreenshotWithTimestamp() {
        String timestamp = String.valueOf(System.currentTimeMillis());
        screenshot("screenshot" + timestamp);
    }
}