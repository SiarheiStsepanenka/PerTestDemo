package com.perchwell.tests.AnalyticsTests;

import com.perchwell.SampleTest;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Test;

@WithTagValuesOf({"SmokeTestSuit", "AnalyticsTests", "Third"})
public class ST35_ReportDetailsOpeningTest extends SampleTest {

	@Test
	public void reportDetailsOpeningTest() throws Exception {
		user.atLoginPage.loginAsBroker(AppProperties.INSTANCE.getProperty("email"),
				AppProperties.INSTANCE.getProperty("password"));
		user.atPerchwellPage.skipAllHints();
		user.atPerchPopup.clickNotNowButton();
		user.atPerchwellPage.clickOnAnalytics();
		user.atRebnyListingsPage.addChartFromREBNYSection();
		user.atAnalyticsPage.skipHints();
		user.atRebnyListingsPage.addREBNYListingsAskingPriceChart();
		user.atAnalyticsPage.upToOneMillionButtonClick();
		user.atAnalyticsPage.selectSecondBuildingInList();
		user.atOpenedBuildingPage.clickOnDiscussWithMyClientHint();
		user.atOpenedBuildingPage.isBuildingOpen();
	}
}
