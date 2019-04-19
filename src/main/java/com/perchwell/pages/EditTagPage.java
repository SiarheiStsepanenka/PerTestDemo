package com.perchwell.pages;

import com.perchwell.helpers.RandomGenerator;
import com.perchwell.helpers.SessionVariables;
import com.perchwell.helpers.TechHelper;
import io.appium.java_client.MobileBy;
import io.appium.java_client.pagefactory.iOSFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.temporal.ChronoUnit;
import java.util.concurrent.TimeUnit;

public class EditTagPage extends TechHelper {

    @iOSFindBy(accessibility = "label: delete")
    private WebElement removeButton;

//    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeCell' AND label == 'DELETE'")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeCollectionView/XCUIElementTypeCell[$name == 'DELETE'$]")
    private WebElement confirmButton;

    @iOSFindBy(accessibility = "label: duplicate")
    private WebElement duplicateButton;

    @iOSXCUITFindBy(iOSNsPredicate = "name == 'EDIT TAG' AND visible == 1")
    private WebElement editTagLabel;

    private WebElement duplicateCancelButton;

    private WebElement duplicateSaveButton;

    private WebElement duplicateTagNameTextField;

//    @iOSXCUITFindBy(iOSNsPredicate = "name == 'SAVE' AND visible == 1")
    @iOSFindBy(accessibility = "bar button: save")
    private WebElement saveButton;

    @iOSFindBy(accessibility = "Tag Name textField")
    private WebElement tagNameTextField;

    @iOSFindBy(accessibility = " Option: On")
    private WebElement alertsOn;

    @iOSFindBy(accessibility = " Option Selected: On")
    private WebElement alertsOnSelected;

    @iOSFindBy(accessibility = " Option: Off")
    private WebElement alertsOff;

    @iOSFindBy(accessibility = " Option Selected: Off")
    private WebElement alertsOffSelected;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeCollectionView/XCUIElementTypeCell[$name == 'CANCEL'$]")
    private WebElement cancelButton;

    @iOSFindBy(accessibility = "iconChevronLeft")
    private WebElement chevronLeft;

    @iOSFindBy(accessibility = "DISCARD")
    private WebElement discardButton;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeCell[@name='SAVE']")
    private WebElement popUpSaveButton;

    public EditTagPage(WebDriver driver) {
        super(driver);
    }

    public void clickOnDeleteButton() {
        element(removeButton).click();
    }

    public void confirmRemoving() {
        element(confirmButton).click();
    }

    public void clickOnDuplicateButton() {
        element(duplicateButton).click();
    }

    public void shouldSeeEditTagLabel() {
        element(editTagLabel).shouldBeVisible();
    }

    public void clickOnCancelButton() {
        element(duplicateCancelButton).click();
    }

    public void checkTagsItemsAmount(String valueToCheck) {
        setImplicitTimeout(3, ChronoUnit.SECONDS);
        element(MobileBy.AccessibilityId(valueToCheck)).shouldBeVisible();
        resetImplicitTimeout();
    }

    public void checkIfSaveButtonIsNotDisplayed() {
        setImplicitTimeout(3, ChronoUnit.SECONDS);
        element(saveButton).shouldNotBeVisible();
        resetImplicitTimeout();
    }

    public void changeTagName(String tag) {
        String newTagName = RandomGenerator.getRandomString(tag);
        SessionVariables.addValueInSessionVariable("Renamed_Tag", newTagName);

        element(tagNameTextField).clear();
        element(tagNameTextField).sendKeys(newTagName);
    }

    public void checkIfSaveButtonIsDisplayed() {
        element(saveButton).shouldBeVisible();
    }

    public void clickOnSaveButton() {
        element(saveButton).click();
    }

    public void fillInRandomTagName(String newTagName) {
        element(duplicateTagNameTextField).sendKeys(newTagName);
    }

    public void checkIfAlertsAreTurnedOn() {
        element(alertsOnSelected).shouldBeVisible();
    }

    public void switchAlertsToOff() {
        element(alertsOff).click();
    }

    public void checkIfAlertsAreTurnedOff() {
        element(alertsOffSelected).shouldBeVisible();
    }

    public void switchAlertsToOn() {
        element(alertsOn).click();
    }

    public void cancelTagRemoving() {
        element(cancelButton).click();
    }

    public void clickOnArrowBackFromEditTagPage() {
        element(chevronLeft).click();
    }

    public void shouldSeeClient(String clientName) {
        element(MobileBy.AccessibilityId(clientName)).shouldBeVisible();
    }

    public void clickOnDiscardButton() {
        element(discardButton).click();
    }

    public void clickOnPopUpSaveButton() {
        element(popUpSaveButton).click();
    }
}