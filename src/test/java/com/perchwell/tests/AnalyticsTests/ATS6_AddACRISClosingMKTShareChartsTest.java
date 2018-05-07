package com.perchwell.tests.AnalyticsTests;

import com.perchwell.SampleTest;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Test;

@WithTagValuesOf({"AnalyticsTestSuit", "AnalyticsTests"})
public class ATS6_AddACRISClosingMKTShareChartsTest extends SampleTest {

    @Test
    public void addACRISClosingMKTShareChartsTest(){
        user.atLoginPage.loginAsBroker(AppProperties.INSTANCE.getProperty("email"),
                AppProperties.INSTANCE.getProperty("password"));
        user.atPerchwellPage.skipAllHints();
        user.atPerchPopup.clickNotNowButton();
        user.atPerchwellPage.clickOnAnalytics();
        user.atAnalyticsPage.selectACRISClosingSection();
        user.atAnalyticsPage.mktShareButtonClick();
        user.atAcrisClosingPage.addBuildingTypeByDealCountChart();
        user.atAnalyticsPage.skipHints();
        user.atAcrisClosingPage.shouldBuildingTypeChartDisplayed();
        user.atAnalyticsPage.addButtonClick();
        user.atAnalyticsPage.selectACRISClosingSection();
        user.atAnalyticsPage.mktShareButtonClick();
        user.atAcrisClosingPage.addAndVerifyPriceByDealCountChart();
    }
}
