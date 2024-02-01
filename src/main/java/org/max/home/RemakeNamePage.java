package org.max.home;


import static com.codeborne.selenide.Selenide.$x;

public class RemakeNamePage {

    private String firstDummyXPath = "//div[@class='posts svelte-127jg4t']/a";
    private String dummyButtonEditPostXPath = "//div[@class='button-block svelte-tv8alb']/button";
    private String fieldToTitleXPath = "//input[@type='text']";
    private String saveButtonXPath = "//*[@type='submit']";
    private String buttonUserPageXPath = "//a[contains(text(),'Hello')]";
    private String buttonProfileXPath = "//ul[@class='mdc-deprecated-list']/li";

    public void openFirstDummyCardAndSaveNewName(String name) {
        $x(firstDummyXPath).click();
        $x(dummyButtonEditPostXPath).click();
        $x(fieldToTitleXPath).clear();
        $x(fieldToTitleXPath).setValue(name);
        $x(saveButtonXPath).click();
    }

    public void openProfile() {
        $x(buttonUserPageXPath).click();
        $x(buttonProfileXPath).click();
    }
}
