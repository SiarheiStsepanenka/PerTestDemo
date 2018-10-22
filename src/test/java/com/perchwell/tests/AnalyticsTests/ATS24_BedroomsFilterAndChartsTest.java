package com.perchwell.tests.AnalyticsTests;

import com.perchwell.SampleTest;
import com.perchwell.entity.AppProperties;
import org.junit.Ignore;
import org.junit.Test;

public class ATS24_BedroomsFilterAndChartsTest extends SampleTest {

    @Ignore
    @Test
    public void bedroomsFilterAndChartsTest() throws Exception {
        user.atLoginPage.loginAsBroker(AppProperties.INSTANCE.getProperty("email"),
                AppProperties.INSTANCE.getProperty("password"));
        user.atPerchwellPage.skipAllHints();
        user.atPerchPopup.clickNotNowButton();
        user.atPerchwellPage.clickOnMyNewSearch();
        user.atSearchPage.selectBedroomsRangeOption();
        user.atSearchPage.clickOnFilter1Bed();
        user.atSearchPage.clickOnApplyButton();
        user.atPerchwellPage.clickOnAnalytics();
        user.atAnalyticsPage.rebnyListingsButtonClick();
        user.atRebnyListingsPage.addMKTShareBedroomsChart();
        user.atAnalyticsPage.skipHints();
//        user.atAnalyticsPage.verifyThatChartIsDisplayedWithFilter("");
        user.atAnalyticsPage.selectREBNYListingsWithDistribution();
        user.atRebnyListingsPage.addDistributionAskingPricePerBedChart();
//        user.atAnalyticsPage.verifyThatChartIsDisplayedWithFilter("");
        user.atAnalyticsPage.selectREBNYListingsWithDistribution();
        user.atRebnyListingsPage.addDistributionDOMByNumberBedsChart(); //??
//        user.atAnalyticsPage.verifyThatChartIsDisplayedWithFilter("");
        user.atAnalyticsPage.selectManagementWithMKTShare();
        user.atManagementPage.addMKTShareBedroomsChart(); //use another method
//        user.atAnalyticsPage.verifyThatChartIsDisplayedWithFilter("");

    }
}
