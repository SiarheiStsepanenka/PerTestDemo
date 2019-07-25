package com.perchwell.tests.ReportWizardTests;

import com.perchwell.SampleTest;
import com.perchwell.data.Addresses;
import com.perchwell.data.DiscussionMessages;
import com.perchwell.data.ReportTypes;
import com.perchwell.entity.AppProperties;
import org.junit.Test;

public class RW11_ReportWizardMultiSelectRentalSPDeletionTest extends SampleTest {

    @Test
    public void reportWizardMultiSelectRentalSPDeletionTest() {
        user.atLoginPage.loginAsClient(AppProperties.INSTANCE.getProperty("core_email"),
                AppProperties.INSTANCE.getProperty("password"));
        user.atPerchwellPage.skipAllHints();
        user.atPerchPopup.clickNotNowButton();
        user.inSearchMenu.openSearchPage();
        user.atSearchPage.selectRentalsProperty();
        user.atSearchPage.selectCondoFilter();
        user.atSearchPage.clickOnApplyButton();
        user.atPerchwellPage.selectFirstListing();
        user.atPerchwellPage.clickOnMoreOptionsButton();
        user.atPerchwellPage.clickOnCreateReportButton();
        user.atCreateReportPage.clickOnCmaButton();
        user.atCreateReportPage.clickOnRentalsButton();
        user.atCreateReportPage.clickOnSubjectPropertyButton();
        user.atAddSubjectPropertyPage.checkCcMaintenanceFieldIsNotShown();
        user.atAddSubjectPropertyPage.checkReTaxesFiledIsNotShown();
        user.atAddSubjectPropertyPage.checkSaveButtonIsEnabled();
        user.atAddSubjectPropertyPage.fillInAddressField(Addresses.DAKOTA_15PLACE);
        user.atAddSubjectPropertyPage.fillInUnitField(Addresses.DAKOTA);
        user.atAddSubjectPropertyPage.fillInPriceField("300000");
        user.atAddSubjectPropertyPage.fillInRoomsField("2.5");
        user.atAddSubjectPropertyPage.fillInBedsField("3.5");
        user.atAddSubjectPropertyPage.fillInBathsField("4.5");
        user.atAddSubjectPropertyPage.fillInSqrFootageField("3500");
        user.atAddSubjectPropertyPage.clickOnPropertyTypeField(); //TODO: need to implement locator
        user.atAddSubjectPropertyPage.clickOnCondo(); //TODO: need to implement locator
        user.atAddSubjectPropertyPage.selectOutdoorSpaceCrossFilter();
        user.atAddSubjectPropertyPage.selectDoormanBuildingCrossFilter();
        user.atAddSubjectPropertyPage.fillInBuildingSizeField("10x10");
        user.atAddSubjectPropertyPage.clickOnSaveButton();
        user.atCreateReportPage.checkSubjectPropertyCellIsShownWithValue(); //TODO: need to implement locators
        user.atCreateReportPage.swipeLeftSubjectPropertyCell();
        user.atCreateReportPage.clickOnDeleteButton();
        user.atCreateReportPage.checkSubjectPropertyFieldIsNotShown();
        user.atCreateReportPage.checkSubjectPropertyPlusIconIsShown();
        user.atCreateReportPage.clickOnSubjectPropertyButton();
        user.atAddSubjectPropertyPage.checkAllFieldsAreEmpty(); //TODO: need to implement locator for property type
        user.atAddSubjectPropertyPage.fillInAddressField(Addresses.DAKOTA_15PLACE);
        user.atAddSubjectPropertyPage.fillInUnitField(Addresses.DAKOTA);
        user.atAddSubjectPropertyPage.fillInPriceField("300000");
        user.atAddSubjectPropertyPage.fillInRoomsField("2.5");
        user.atAddSubjectPropertyPage.fillInBedsField("3.5");
        user.atAddSubjectPropertyPage.fillInBathsField("4.5");
        user.atAddSubjectPropertyPage.fillInSqrFootageField("3500");
        user.atAddSubjectPropertyPage.clickOnPropertyTypeField(); //TODO: need to implement locator
        user.atAddSubjectPropertyPage.clickOnCondo(); //TODO: need to implement locator
        user.atAddSubjectPropertyPage.selectOutdoorSpaceCrossFilter();
        user.atAddSubjectPropertyPage.selectDoormanBuildingCrossFilter();
        user.atAddSubjectPropertyPage.fillInBuildingSizeField("10x10");
        user.atAddSubjectPropertyPage.clickOnSaveButton();
        user.atCreateReportPage.clickNextButton();
        user.atCreateReportPage.clickNextButton();
        user.atCreateReportPage.fillEmailField("valid-report-wizard1@email.com");
        user.atCreateReportPage.fillSubjectField(DiscussionMessages.REPORT_SUBJECT);
        user.atCreateReportPage.clickOnEmailReportButton();
        user.atCreateReportPage.checkEmailContainsPDFReport(ReportTypes.CMA_REPORT);
    }
}
