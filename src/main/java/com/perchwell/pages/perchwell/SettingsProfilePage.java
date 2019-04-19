package com.perchwell.pages.perchwell;

import com.perchwell.crossPlatform.Config;
import com.perchwell.helpers.TechHelper;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SettingsProfilePage extends TechHelper {

    //region WebElements

    @AndroidFindBy(id = "com.perchwell.re.staging:id/name")
    @iOSFindBy(accessibility = "UserNameTextField")
    private WebElement nameTextBox;

    @AndroidFindBy(id = "com.perchwell.re.staging:id/company_edit_text")
    @iOSFindBy(accessibility = "UserCompanyTextField")
    private WebElement companyTextBox;

    @AndroidFindBy(id = "com.perchwell.re.staging:id/action_button")
    @iOSFindBy(accessibility = "AccountDetailsSaveButton")
    private WebElement saveButton;

    @AndroidFindBy(id = "com.perchwell.re.staging:id/ok")
    @iOSFindBy(accessibility = "OK")
    private WebElement okButton;

    @AndroidFindBy(id = "com.perchwell.re.staging:id/reset_password")
    @iOSFindBy(accessibility = "RESET PASSWORD")
    private WebElement resetPasswordButton;

    @AndroidFindBy(id = "com.perchwell.re.staging:id/up_button")
    @iOSFindBy(accessibility = "AccountDetailsCancelButton")
    private WebElement cancelButton;

    @iOSFindBy(accessibility = "AccountDetailsCancelButton")
    private WebElement backButton;

    @iOSFindBy(accessibility = "Back")
    private WebElement backFromEmailButton;

    @iOSFindBy(accessibility = "Back")
    private WebElement backButtonFromResetPasswordButton;

    //endregion
    
    public SettingsProfilePage(WebDriver driver) {
            super(driver);
    }

    public void saveButtonClick() {
        element(saveButton).click();
    }

    public void fillInNameTextBox(String name){
        element(nameTextBox).type(name);
    }

    public void fillInCompanyTextBox(String company){
        element(companyTextBox).type(company);
    }

    public String nameProfile() {
        return element(nameTextBox).getText();
    }

    public String companyProfile() {
        return element(companyTextBox).getText();
    }

    public void okButtonClick(){
        element(okButton).click();
    }

    public void resetPasswordButtonClick(){
        element(resetPasswordButton).click();
    }

    public void cancelButtonClick(){
        element(cancelButton).click();
    }

    public void backButtonClick() {
        if (Config.isAndroid()){
            getDriver().navigate().back();
        } else {
            element(backButton).click();
        }
    }

    public void isTextBoxChange(String previousText,String newText){
        Assert.assertTrue(previousText.contains(newText));
    }

    public void backFromEmailButtonClick() {
        element(backFromEmailButton).click();
    }

    public void backButtonFromResetPasswordClick() {
        element(backButtonFromResetPasswordButton).click();
    }
}