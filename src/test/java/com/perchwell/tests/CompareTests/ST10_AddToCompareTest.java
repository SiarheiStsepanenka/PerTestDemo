package com.perchwell.tests.CompareTests;

import com.perchwell.SampleTest;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Test;

@WithTagValuesOf({"SmokeTestSuit", "CompareTests", "First"})
public class ST10_AddToCompareTest extends SampleTest {

	@Test
	public void addToCompare() throws Exception {

		loginSteps.loginAsBroker(AppProperties.INSTANCE.getProperty("email"),
				AppProperties.INSTANCE.getProperty("password"));
		perchwellSteps.skipAllHints();
		perchPopupSteps.clickNotNowButton();
		perchwellSteps.openFirstBuilding();
		openedBuildingSteps.clickOnDiscussWithMyClientHint();
		openedBuildingSteps.addToCompare("the first building");
		openedBuildingSteps.clickOnBackButton();
		perchwellSteps.openSecondBuilding();
		openedBuildingSteps.addToCompare("the second building");
		openedBuildingSteps.clickOnBackButton();
		perchwellSteps.openThirdBuilding();
		openedBuildingSteps.addToCompare("the third building");
		openedBuildingSteps.clickOnBackButton();
		perchwellSteps.clickOnOpenAccountButton();
		accountSteps.clickOnCompareLabel();
		compareSteps.clickOnSwipeUpToRemoveHint();
		compareSteps.shouldSeeFirstBuildingInCompare("the first building");
		compareSteps.shouldSeeSecondBuildingInCompare("the second building");
		compareSteps.thirdBuildingIsDisplayed("the third building");
	}
}