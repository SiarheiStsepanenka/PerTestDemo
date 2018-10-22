package com.perchwell.tests.TagsTests;

import com.perchwell.SampleTest;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Test;

@WithTagValuesOf({"SmokeTestSuit", "TagsTests", "First"})
public class ST6_CreateNewTagForListingTest extends SampleTest {

	@Test
	public void createNewTagForListing() throws Exception {
		user.atLoginPage.loginAsBroker(AppProperties.INSTANCE.getProperty("email"),
				AppProperties.INSTANCE.getProperty("password"));
		user.atPerchwellPage.skipAllHints();
		user.atPerchPopup.clickNotNowButton();
		user.atPerchwellPage.openFirstBuilding();
		user.atOpenedBuildingPage.clickOnDiscussWithMyClientHint();
		user.atOpenedBuildingPage.getFirstBuildingAddress();
		user.atOpenedBuildingPage.clickOnMyTagsLabel();
		user.atTagsPage.setRandomTagAndSave();
		user.atTagsPage.clickOnArrowBackFromTagsButton();
		user.atTagsPage.justCreatedTagIsAddedToListing();
		user.atOpenedBuildingPage.clickOnArrowBackButtonFromListing();
		user.atPerchwellPage.clickOnOpenAccountButton();
		user.atAccountPage.clickOnTagsLabel();
		user.atTagsPage.shouldSeeJustCreatedTag(); //temp solution for iOS
		user.atTagsPage.clickOnCreatedTag();
		user.atTagsPage.clickOnSearchButton();
		user.atTagsPage.shouldSeeTaggedListing();
	}
}