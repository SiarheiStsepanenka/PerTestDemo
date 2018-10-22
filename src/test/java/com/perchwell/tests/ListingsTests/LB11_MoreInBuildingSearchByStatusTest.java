package com.perchwell.tests.ListingsTests;

import com.perchwell.SampleTest;
import com.perchwell.data.Addresses;
import com.perchwell.data.Filters;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Test;

@WithTagValuesOf({"ListingsAndBuildingsTests", "ListingsTests"})
public class LB11_MoreInBuildingSearchByStatusTest extends SampleTest {

    @Test
    public void moreInBuildingSearchByStatus() {
        user.atLoginPage.loginAsBroker(AppProperties.INSTANCE.getProperty("email"),
                AppProperties.INSTANCE.getProperty("password"));
        user.atPerchwellPage.skipAllHints();
        user.atPerchPopup.clickNotNowButton();
        user.atPerchwellPage.clickOnMyNewSearch();
        user.atSearchPage.clickOnSearchByAddressButton();
        user.atSearchPage.fillInSearchField(Addresses.EAST_35TH);
        user.atSearchPage.clickOnTestBuilding();
        user.atOpenedBuildingPage.swipeToTheListings();
        user.atOpenedBuildingPage.clickOnTestListing();
        user.atOpenedBuildingPage.skipDiscussWithClientHint();
        user.atOpenedBuildingPage.swipeToTheListings();
        user.atOpenedBuildingPage.getBedsAndBathsListingsAmount();
        user.atOpenedBuildingPage.fixSearchField();
        user.atOpenedBuildingPage.fillInSearchFieldByFilter(Filters.ACTIVE_FILTER);
        user.atOpenedBuildingPage.checkIfListingsAreFilteredByActiveStatus();
        user.atOpenedBuildingPage.clickOnClearFieldButton();
        user.atOpenedBuildingPage.fillInSearchFieldByFilter(Filters.IN_CONTRACT_FILTER);
        user.atOpenedBuildingPage.checkIfListingsAreFilteredByInContractStatus();
        user.atOpenedBuildingPage.clickOnMoreInBuildingSection();
        user.atOpenedBuildingPage.checkIfSearchFieldIsFilledByFilter(Filters.IN_CONTRACT_FILTER);
        user.atOpenedBuildingPage.checkIfListingsAreFilteredByInContractStatus();
        user.atOpenedBuildingPage.clickOnSimilarListingsSection();
        user.atOpenedBuildingPage.clickOnClearFieldButton();
        user.atOpenedBuildingPage.checkIfListingReturnedToInitialState();
    }
}
