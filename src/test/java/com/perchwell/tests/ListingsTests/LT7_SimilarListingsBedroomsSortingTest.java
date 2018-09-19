package com.perchwell.tests.ListingsTests;

import com.perchwell.SampleTest;
import com.perchwell.data.Addresses;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Test;

@WithTagValuesOf({"ListingsAndBuildingsTests", "Listings"})
public class LT7_SimilarListingsBedroomsSortingTest extends SampleTest {

    @Test
    public void similarListingsBedroomsSortingTest() {
        user.atLoginPage.loginAsBroker(AppProperties.INSTANCE.getProperty("email"),
                AppProperties.INSTANCE.getProperty("password"));
        user.atPerchwellPage.skipAllHints();
        user.atPerchPopup.clickNotNowButton();
        user.atPerchwellPage.clickOnMyNewSearch();
        user.atSearchPage.clickOnSearchByAddressButton();
        user.atSearchPage.fillInSearchField(Addresses.EAST_35TH);
        user.atSearchPage.clickOnTestBuilding();
        user.atOpenedBuildingPage.swipeToTheSimilarListings();
        user.atOpenedBuildingPage.clickOnTestListing();
        user.atOpenedBuildingPage.skipDiscussWithClientHint();
        user.atOpenedBuildingPage.swipeToTheSimilarListings();
        user.atOpenedBuildingPage.fixSearchField();
        user.atOpenedBuildingPage.clickOnSortButton();
        user.atOpenedBuildingPage.clickOnBedroomsButton();
        user.atOpenedBuildingPage.listingsShouldBeSortedByBedrooms();
        user.atOpenedBuildingPage.clickOnMoreInBuildingSection();
        user.atOpenedBuildingPage.listingsShouldBeSortedByBedrooms();
        user.atOpenedBuildingPage.clickOnSimilarListingsSection();
        user.atOpenedBuildingPage.listingsShouldBeSortedByBedrooms();
    }
}