package com.perchwell.steps;

import com.perchwell.helpers.Helper;
import com.perchwell.pages.perchwell.SearchPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;

public class SearchSteps extends ScenarioSteps {
	SearchPage onPage;

	@Step
	public void clickDeleteSecondLocation() {
		onPage.clickDeleteSecondLocation();
	}

	@Step
	public void clickApplyButton() {
		onPage.clickApplyButton();
	}

	@Step
	public void setUpFilter3Baths() {
		onPage.selectFilterFor3Baths();
	}

	@Step
	public void setUpFilter2Beds() {
		onPage.selectFilterFor2Beds();
	}

	@Step
	public void setUpFilterFirepace() {
		onPage.scrollToFireplace();
		onPage.selectFilterFireplace();
	}

	@Step
	public void clickLoadSavedSearchButton() {
		onPage.clickLoadSavedSearchButton();
	}

	@Step
	public void clickTapToSaveChanges() {
		onPage.clickTapToSaveChanges();
	}

	public void setSearchName() {
		onPage.addValueInSessionVariable("Search", onPage.generateRandomString("Search"));
		onPage.setSearchName(onPage.getValueFromSessionVariable("Search"));
	}

	public void clickSaveButton() {
		onPage.clickSaveButton();
	}

	public void clickPreviouslyCreatedSearch() {
		onPage.clickPreviouslyCreatedSearch(onPage.getValueFromSessionVariable("Search"));
	}

	public void shouldSeePreviouslyCreatedSearch() {
		Assert.assertTrue(onPage.shouldSeePreviouslyCreatedSearch(onPage.getValueFromSessionVariable("Search")));
	}

	@Step
	public void setMinimumPriceFilter(){
		onPage.setMinimumPriceFilter("600000");
	}

	@Step
	public void setFilterForStudioBeds(){
		onPage.setFilterForStudioBeds();
	}

	@Step
	public void setUpFilter1Bath() {
		onPage.setFilterFor1Bath();
	}

	public void deleteDefaultLocationInFilter() {
		onPage.clickDeleteTagButtonBROOKLYN();
		onPage.clickDeleteTagButtonQUEENS();
		onPage.clickDeleteTagButtonMANHATTAN();
	}

	@Step
	public void addLocationFilter() {
		onPage.clickOnLocationFilter();
		//onPage.addLocationFilterAlphabetCity();
	}

	@Step
	public void clickThirdSearchInList() {
		onPage.clickThirdSearchInList();
	}

	@Step
	public void clickActiveFilter(){
		onPage.setFilterActive();
	}

	@Step
	public void isBuildingsFilteredAfterApplyingStatusFilter() throws Exception {
		Assert.assertTrue(onPage.isElementExistsInEachCell(onPage.getValueFromSessionVariable("filterName")));
	}

	@Step
	public void setUpFilterContract() {
		onPage.addValueInSessionVariable("filterName","InContractBanner");
		onPage.setFilterForContract();
	}

	@Step
	public void setUpFilterOffMkt(){
		onPage.addValueInSessionVariable("filterName","OffMarketBanner");
		onPage.setFilterForOffMkt();
	}

	@Step
	public void setUpFilterSold(){
		onPage.addValueInSessionVariable("filterName","SoldBanner");
		onPage.setFilterForSoldOrRented();
	}

	@Step
	public void setUpFilterRented(){
		onPage.addValueInSessionVariable("filterName","RentedBanner");
		onPage.setFilterForRentals();
	}

	@Step
	public void createNewSearchClick(){
		onPage.createNewSearchButtonClick();
	}
}
