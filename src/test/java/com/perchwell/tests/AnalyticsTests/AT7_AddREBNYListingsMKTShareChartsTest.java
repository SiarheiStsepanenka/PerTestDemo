package com.perchwell.tests.AnalyticsTests;

import com.perchwell.SampleTest;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Test;

@WithTagValuesOf({"AnalyticsTestSuit", "FirstAdditionalAnalytics"})
public class AT7_AddREBNYListingsMKTShareChartsTest extends SampleTest {

    @Test
    public void addREBNYListingsMKTShareChartsTest() throws Exception {
        user.atLoginPage.loginAsBroker(AppProperties.INSTANCE.getProperty("email"),
                AppProperties.INSTANCE.getProperty("password"));
        user.atPerchwellPage.skipAllHints();
        user.atPerchPopup.clickNotNowButton();
        user.atPerchwellPage.clickOnAnalytics();
        user.atAnalyticsPage.rebnyListingsButtonClick();
        user.atAnalyticsPage.mktShareButtonClick();
        user.atRebnyListingsPage.addMKTShareBedroomsChart();
        user.atAnalyticsPage.skipHints();
        user.atRebnyListingsPage.shouldSeeBedroomsChart();
        user.atAnalyticsPage.addButtonClick();
        user.atRebnyListingsPage.addBuildingHeightChartWithMKTShare();
        user.atRebnyListingsPage.shouldSeeMKTShareBuildingHeightChart();
        user.atAnalyticsPage.selectREBNYListingsWithMKTShare();
        user.atRebnyListingsPage.addAndVerifyMKTShareBuildingTypeChart();
        user.atAnalyticsPage.selectREBNYListingsWithMKTShare();
        user.atRebnyListingsPage.addAndVerifyMKTShareDoormanChart();
        user.atAnalyticsPage.selectREBNYListingsWithMKTShare();
        user.atRebnyListingsPage.addAndVerifyMKTShareElevatorChart();
        user.atAnalyticsPage.selectREBNYListingsWithMKTShare();
        user.atRebnyListingsPage.addAndVerifyMKTShareFireplaceChart();
        user.atAnalyticsPage.clickMyNewSearch();
        user.atSearchPage.clickOnLoadSavedSearchButton();
        user.atSearchPage.createNewSearchClick();
        user.atSearchPage.clickOnApplyButton();
        user.atAnalyticsPage.rebnyListingsButtonClick();
        user.atAnalyticsPage.mktShareButtonClick();
        user.atRebnyListingsPage.addAndVerifyMKTShareGarageChart();
        user.atAnalyticsPage.selectREBNYListingsWithMKTShare();
        user.atRebnyListingsPage.addAndVerifyMKTShareGymChart();
        user.atAnalyticsPage.selectREBNYListingsWithMKTShare();
        user.atRebnyListingsPage.addAndVerifyMKTShareLaundryBuildingChart();
        user.atAnalyticsPage.selectREBNYListingsWithMKTShare();
        user.atRebnyListingsPage.addAndVerifyMKTShareOutdoorSpaceChart();
        user.atAnalyticsPage.selectREBNYListingsWithMKTShare();
        user.atRebnyListingsPage.addAndVerifyMKTSharePetsChart();
        user.atAnalyticsPage.selectREBNYListingsWithMKTShare();
        user.atRebnyListingsPage.addAndVerifyMKTSharePoolChart();
        user.atAnalyticsPage.clickMyNewSearch();
        user.atSearchPage.clickOnLoadSavedSearchButton();
        user.atSearchPage.createNewSearchClick();
        user.atSearchPage.clickOnApplyButton();
        user.atAnalyticsPage.rebnyListingsButtonClick();
        user.atAnalyticsPage.mktShareButtonClick();
        user.atRebnyListingsPage.addAndVerifyMKTSharePrewarChart();
        user.atAnalyticsPage.selectREBNYListingsWithMKTShare();
        user.atRebnyListingsPage.addAndVerifyMKTShareWasherDryerChart();
        user.atAnalyticsPage.selectREBNYListingsWithMKTShare();
        user.atRebnyListingsPage.addAndVerifyMKTShareDaysOnMarketChart();
    }
}