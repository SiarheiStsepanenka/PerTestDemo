package com.perchwell.tests.FiltersTests;

import com.perchwell.SampleTest;
import com.perchwell.entity.AppProperties;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Test;

@WithTagValuesOf({"FiltersTests", "FiltersSearchesSecond", "iOS_FiltersSearchesSecond", "Android_FiltersSearchesSecond"})
public class NFT19_CollapseExpandBathroomsTest extends SampleTest {

    @Test
    public void collapseExpandBathrooms() {
        user.atLoginPage.loginAsClient(AppProperties.INSTANCE.getProperty("email"),
                AppProperties.INSTANCE.getProperty("password"));
        user.atPerchwellPage.skipAllHints();
        user.atPerchPopup.clickNotNowButton();
        user.atPerchwellPage.clickOnMyNewSearch(); //search old
        user.inSearchMenu.openSearchPage(); //search new
        user.atSearchPage.selectTwoBathsMinimumFilter();
        user.atSearchPage.collapseBathroomsFilters();
        user.atSearchPage.collapseBathroomsFilters();
        user.atSearchPage.checkBathroomsRangeButtonIsNotSelected();
        user.atSearchPage.check2BathsMinFilterSelected();
        user.atSearchPage.selectBathroomsRangeOption();
        user.atSearchPage.selectFilter2Baths();
        user.atSearchPage.collapseBathroomsFilters();
        user.atSearchPage.collapseBathroomsFilters();
        user.atSearchPage.checkBathroomsRangeButtonSelected();
        user.atSearchPage.check2BathsRangeFilterSelected();
        user.atSearchPage.selectFilter4PlusBaths();
        user.atSearchPage.collapseBathroomsFilters();
        user.atSearchPage.collapseBathroomsFilters();
        user.atSearchPage.checkBathroomsRangeButtonSelected();
        user.atSearchPage.checkMultiBathroomsFiltersSelected();
    }
}