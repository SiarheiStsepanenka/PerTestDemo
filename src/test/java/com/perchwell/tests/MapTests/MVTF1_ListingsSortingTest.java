package com.perchwell.tests.MapTests;

import com.perchwell.SampleTest;
import com.perchwell.data.SortingTypes;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Test;

@WithTagValuesOf({"MapTests"})
public class MVTF1_ListingsSortingTest extends SampleTest {

    @Test
    public void sortListingsOnMap() throws Exception {
        user.atLoginPage.loginAsClient(AppProperties.INSTANCE.getProperty("client_email"),
                AppProperties.INSTANCE.getProperty("client_password"));
        user.atPerchwellPage.skipAllHints();
        user.atPerchPopup.clickNotNowButton();
        user.atPerchwellPage.clickOnMap();
        user.atMapPage.clickOnNotNowButton();
        user.atMapPage.selectPinOnMap();
        user.atMapPage.clickOnSortingSectionButton();
        user.atMapPage.selectLeastExpensiveOption();
        user.atMapPage.checkSortLabel(SortingTypes.LEASTEXPENSIVE);
        user.atMapPage.shouldListingBeSortedByLeastExpensive();
        user.atMapPage.clickOnSortingSectionButton();
        user.atMapPage.selectMostExpensiveOption();
        user.atMapPage.checkSortLabel(SortingTypes.MOSTEXPENSIVE);
        user.atMapPage.shouldListingBeSortedByMostExpensive();
        user.atMapPage.clickOnSortingSectionButton();
        user.atMapPage.selectBedroomsOption();
        user.atMapPage.checkSortLabel(SortingTypes.BEDROOMS);
        user.atMapPage.shouldListingBeSortedByBedrooms();
        user.atMapPage.clickOnSortingSectionButton();
        user.atMapPage.selectBathroomsOption();
        user.atMapPage.checkSortLabel(SortingTypes.BATHROOMS);
        user.atMapPage.shouldListingBeSortedByBathrooms();
    }
}
