package com.perchwell.pages.account;

import com.perchwell.helpers.TechHelper;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AccountPage extends TechHelper {

    @AndroidFindBy(accessibility = "CLIENTS")
    @iOSFindBy(accessibility = "CLIENTS")
    private WebElement clientLabel;

    @AndroidFindBy(accessibility = "TAGS")
    @iOSFindBy(accessibility = "TAGS")
    private WebElement tagsLabel;

    @AndroidFindBy(accessibility = "DISCUSSIONS")
    @iOSFindBy(accessibility = "DISCUSSIONS")
    private WebElement discussionsLabel;

    @AndroidFindBy(xpath = "//*[@text='COMPARE']")
    @iOSFindBy(accessibility = "COMPARE")
    private WebElement compareLabel;

    @AndroidFindBy(xpath = "//*[@text='AGENTS']")
    @iOSFindBy(accessibility = "AGENTS")
    private WebElement agentsLabel;

    @AndroidFindBy(id = "com.perchwell.re.staging:id/name")
    @iOSFindBy(accessibility = "AccountDetailsHeader")
    private WebElement settingProfileButton;

    public AccountPage(WebDriver driver){
        super (driver);
    }

    public void clickOnClientsLabel() {
        element(clientLabel).click();
    }

    public void clickOnTagsLabel() {
        element(tagsLabel).click();
    }

    public void clickOnCompareLabel() {
        element(compareLabel).click();
    }

    public void optionTagsIsDisplayed() {
        element(tagsLabel).shouldBeVisible();
    }

    public void optionCompareIsDisplayed() {
        element(compareLabel).shouldBeVisible();
    }

    public void optionDiscussionsIsDisplayed() {
        element(discussionsLabel).shouldBeVisible();
    }

    public void optionClientsIsDisplayed() {
        element(clientLabel).shouldBeVisible();
    }

    public void optionAgentsIsDisplayed() {
        element(agentsLabel).shouldBeVisible();
    }

    public void clickOnDiscussionsLabel() {
        element(discussionsLabel).click();
    }

    public void clickOnSettingProfileButton() {
        element(settingProfileButton).click();
    }
}