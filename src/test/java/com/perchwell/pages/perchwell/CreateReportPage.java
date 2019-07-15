package com.perchwell.pages.perchwell;

import com.perchwell.email.MailTrap;
import com.perchwell.entity.MailTrapResponse;
import com.perchwell.helpers.SessionVariables;
import com.perchwell.helpers.TechHelper;
import io.appium.java_client.MobileBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static com.perchwell.email.MailTrap.getTextBody;

public class CreateReportPage extends TechHelper {

    @iOSXCUITFindBy(accessibility = "CMA")
    private WebElement cmaButton;

    @iOSXCUITFindBy(accessibility = "Extended CMA")
    private WebElement extendedCmaButton;

    @iOSXCUITFindBy(accessibility = "Listing Report")
    private WebElement listingReportButton;

    @iOSXCUITFindBy(accessibility = "Show Sheet")
    private WebElement showSheetButton;

    @iOSXCUITFindBy(accessibility = "Export To Excel")
    private WebElement exportToExcelButton;

    @iOSXCUITFindBy(accessibility = "Itinerary")
    private WebElement itineraryButton;

    @iOSXCUITFindBy(accessibility = "Media Report")
    private WebElement mediaReportButton;

    @iOSXCUITFindBy(accessibility = "Short")
    private WebElement shortButton;

    @iOSXCUITFindBy(accessibility = "Medium")
    private WebElement mediumButton;

    @iOSXCUITFindBy(accessibility = "Default")
    private WebElement defaultButton;

    @iOSXCUITFindBy(accessibility = "Default (Includes Buildings)")
    private WebElement defaultIncludesBuildingButton;

    @iOSXCUITFindBy(accessibility = "iconChevronLeft")
    private WebElement backButton;

    @iOSXCUITFindBy(accessibility = "Detailed ")
    private WebElement detailedButton;

    @iOSXCUITFindBy(accessibility = "Next")
    private WebElement nextButton;

    @iOSXCUITFindBy(accessibility = "Tag Cell: Search Text Field")
    private WebElement emailField;

    @iOSXCUITFindBy(accessibility = "EMAIL REPORT")
    private WebElement emailReportButton;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField[@name='Tag Cell: Search Text Field']/XCUIElementTypeOther")
    private WebElement emailPill;

    @iOSXCUITFindBy(accessibility = "Subject textField")
    private WebElement subjectField;

    @iOSXCUITFindBy(accessibility = "Return")
    private WebElement returnButtonOnKeyboard;

    @iOSXCUITFindBy(accessibility = "REPORT SUCCESSFULLY SENT")
    private WebElement emailReportPopUp;

    @iOSXCUITFindBy(accessibility = "EXIT")
    private WebElement popUpExitButton;

    @iOSXCUITFindBy(accessibility = "OK")
    private WebElement popUpOkButton;

    @iOSXCUITFindBy(accessibility = "textView")
    private WebElement messageField;

    @iOSXCUITFindBy(accessibility = "shrink")
    private WebElement shrinkButton;

    @iOSXCUITFindBy(iOSNsPredicate = "label = 'removeBubble'")
    private WebElement removeBubble;

    public CreateReportPage(WebDriver driver) {
        super(driver);
    }

    public void clickOnListingReportButton() {
        element(listingReportButton).click();
    }

    public void cmaOptionButtonIsShown() {
        element(cmaButton).shouldBeVisible();
    }

    public void extendedCmaOptionButtonIsShown() {
        element(extendedCmaButton).shouldBeVisible();
    }

    public void listingReportOptionButtonIsShown() {
        element(listingReportButton).shouldBeVisible();
    }

    public void showSheetOptionButtonIsShown() {
        element(showSheetButton).shouldBeVisible();
    }

    public void exportToExcelOptionButtonIsShown() {
        element(exportToExcelButton).shouldBeVisible();
    }

    public void shortOptionButtonIsShown() {
        element(shortButton).shouldBeVisible();
    }

    public void itineraryOptionButtonIsShown() {
        element(itineraryButton).shouldBeVisible();
    }

    public void mediaReportOptionButtonIsShown() {
        element(mediaReportButton).shouldBeVisible();
    }

    public void mediumButtonIsShown() {
        element(mediumButton).shouldBeVisible();
    }

    public void defaultOptionButtonIsShown() {
        element(defaultButton).shouldBeVisible();
    }

    public void defaultIncludesBuildingButtonIsShown() {
        element(defaultIncludesBuildingButton).shouldBeVisible();
    }

    public void clickOnBackButton() {
        element(backButton).click();
    }

    public void detailedOptionButtonIsShown() {
        element(detailedButton).shouldBeVisible();
    }

    public void clickOnDefaultButton() {
        element(defaultButton).click();
    }

    public void clickOnNextButton() {
        element(nextButton).click();
    }

    public void fillEmailField(String email) {
        element(emailField).sendKeys(email);
        SessionVariables.addValueInSessionVariable("emailAddress", email);
    }

    public void checkEmailReportButtonIsDisabled() {
        element(emailReportButton).shouldNotBeEnabled();
    }

    public void checkEmailReportButtonIsEnabled() {
        element(emailReportButton).shouldBeEnabled();
    }

    public void fillSubjectField(String message) {
        element(subjectField).typeAndEnter(message);
        SessionVariables.addValueInSessionVariable("Report_subject", message);
    }

    public void clickOnReturnButtonOnKeyboard() {
        element(returnButtonOnKeyboard).click();
    }

    public void clearEmailField() {
        element(emailField).clear();
    }

    public void checkEmailFieldValueIsShownAsText() {
        Assert.assertEquals(SessionVariables.getValueFromSessionVariable("emailAddress"), element(emailField).getAttribute("value"));

    }

    public void checkEmailFieldIsShownAsGreenPill() {
        element(MobileBy.xpath("//XCUIElementTypeStaticText[@name='" + SessionVariables.getValueFromSessionVariable("emailAddress") + "']")).shouldBeVisible();
        element(emailPill).shouldBePresent();
        Assert.assertEquals(SessionVariables.getValueFromSessionVariable("emailAddress"), element(emailField).getAttribute("value"));
    }

    public void fillInMessageField(String message) {
        element(messageField).sendKeys(message);
        SessionVariables.addValueInSessionVariable("Report_message", message);
    }

    public void clickOnEmailReportButton() {
        element(emailReportButton).click();
    }

    public void checkEmailReportPopUpIsShown() {
        element(emailReportPopUp).shouldBeVisible();
    }

    public void checkPopUpExitButtonIsShown() {
        element(popUpExitButton).shouldBeVisible();
    }

    public void checkPopUpOkButtonIsShown() {
        element(popUpOkButton).shouldBeVisible();
    }

    public void clickOnPopUpOkButton() {
        element(popUpOkButton).click();
    }

    public void checkPopUpMessageIsClosed() {
        element(emailReportPopUp).shouldNotBeVisible();
    }

    public void checkSubjectFieldIsFilledOut() {
        Assert.assertEquals(element(subjectField).getText(), SessionVariables.getValueFromSessionVariable("Contact_subject"));
    }

    public void clickOnPopUpExitButton() {
        element(popUpExitButton).click();
    }

    public void clickOnMediaReportButton() {
        element(mediaReportButton).click();
    }

    public void clickOnShrinkButton() {
        element(shrinkButton).click();
    }

    public void removeValidEmail() {
        element(removeBubble).click();
    }

    public void shouldFindSentReportBySubjectAndMessage() {
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        String subject = SessionVariables.getValueFromSessionVariable("Report_subject");
        String message = SessionVariables.getValueFromSessionVariable("Report_message");
        String rawBody;

        MailTrapResponse[] mailTrapResponse = MailTrap.getEmail(subject);
        rawBody = getTextBody(mailTrapResponse[0].getRaw_path());

        Assert.assertTrue(rawBody.contains("Subject: " + subject));
        Assert.assertTrue(rawBody.contains(message));
    }
}
