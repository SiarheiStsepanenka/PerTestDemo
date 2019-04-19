package com.perchwell.pages.analytics;

import com.perchwell.helpers.Helper;
import com.perchwell.helpers.TechHelper;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.temporal.ChronoUnit;

import static java.util.concurrent.TimeUnit.SECONDS;

public class ManagementPage extends TechHelper {

    //region WebElements

    @iOSFindBy(accessibility = "PRICE")
    private WebElement askingPriceButton;

    @AndroidFindBy(xpath = "//*[@text='BEDROOMS']")
    @iOSFindBy(accessibility = "BEDROOMS")
    private WebElement bedroomsButton;

    @iOSFindBy(accessibility = "BUILDING HEIGHT")
    private WebElement buildingHeightButton;

    @iOSFindBy(accessibility = "BUILDING TYPE")
    private WebElement buildingTypeButton;

    @AndroidFindBy(xpath = "//*[@text='DAYS ON MARKET']")
    @iOSFindBy(accessibility = "DAYS ON MARKET")
    private WebElement daysOnMarketButton;

    @AndroidFindBy(xpath = "//*[@text='DAYS ON MARKET']")
    @iOSFindBy(accessibility = "DAYS ON MARKET_DAYSONMARKETPIE_DAYS_ON_MARKET_LISTINGS_MANAGEMENT: HEADER TITLE LABEL")
    private WebElement mktShareDaysOnMarketChart;

    @iOSFindBy(accessibility = "FIRM LISTING COUNT")
    private WebElement firmListingCountButton;

    @iOSFindBy(accessibility = "FIRM LISTING COUNT")
    private WebElement distributionFirmListingCountButton;

    @iOSFindBy(accessibility = "FIRM LISTING COUNT_COUNTPER_BROKERAGE_DISPLAY_NAME_LISTINGS_MANAGEMENT: HEADER TITLE LABEL")
    private WebElement distributionFirmListingCountChart;

    @iOSFindBy(accessibility = "PRICE_PRICETRANCHES_LISTING_PRICE_LISTINGS_MANAGEMENT: HEADER TITLE LABEL")
    private WebElement mktShareAskingPriceChart;

    @iOSFindBy(accessibility = "BEDROOMS_ROOMS_NUM_BEDROOMS_LISTINGS_MANAGEMENT: HEADER TITLE LABEL")
    private WebElement mktShareBedroomsChart;

    @iOSFindBy(accessibility = "BUILDING HEIGHT_RISE_NUM_STORIES_LISTINGS_MANAGEMENT: HEADER TITLE LABEL")
    private WebElement mktShareBuildingHeightChart;

    @iOSFindBy(accessibility = "BUILDING TYPE_PROPERTYTYPES_PROPERTY_TYPE_CODE_LISTINGS_MANAGEMENT: HEADER TITLE LABEL")
    private WebElement mktShareBuildingTypeChart;

    @iOSFindBy(accessibility = "AGENT LISTING COUNT")
    private WebElement agentListingCountButton;

    @iOSFindBy(accessibility = "AGENT LISTING COUNT_COUNTPERAGENT_LISTING_PRICE_LISTINGS_MANAGEMENT: HEADER TITLE LABEL")
    private WebElement distributionAgentListingCountChart;

    @iOSFindBy(accessibility = "AGENT MEDIAN PRICE")
    private WebElement agentMedianPriceButton;

    @iOSFindBy(accessibility = "FIRM DOM")
    private WebElement firmDOMButton;

    @iOSFindBy(accessibility = "FIRM LISTING VOLUME")
    private WebElement firmListingVolumeButton;

    @iOSFindBy(accessibility = "FIRM MEDIAN $/SQFT")
    private WebElement firmMedianDollarPerSQFTButton;

    @iOSFindBy(accessibility = "FIRM MEDIAN PRICE")
    private WebElement firmMedianPriceButton;

    @iOSFindBy(accessibility = "AGENT MEDIAN PRICE_MEDIANPERAGENT_LISTING_PRICE_LISTINGS_MANAGEMENT: HEADER TITLE LABEL")
    private WebElement distributionAgentMedianPriceChart;

    @iOSFindBy(accessibility = "MEDIAN DOM_DAYSONMARKETBYBROKERAGE_DAYS_ON_MARKET_LISTINGS_MANAGEMENT: HEADER TITLE LABEL")
    private WebElement distributionFirmDOMChart;

    @iOSFindBy(accessibility = "CURRENT LISTING VOLUME_VOLUMEPERBROKERAGE_BROKERAGE_DISPLAY_NAME_LISTINGS_MANAGEMENT: HEADER TITLE LABEL")
    private WebElement distributionFirmListingVolumeChart;

    @iOSFindBy(accessibility = "FIRM MEDIAN $/SQFT_MEDIANPERBROKERAGE_LISTING_PRICE_PER_SQFT_LISTINGS_MANAGEMENT: HEADER TITLE LABEL")
    private WebElement distributionFirmMedianDollarPerSQFTChart;

    @iOSFindBy(accessibility = "FIRM MEDIAN PRICE_MEDIANPERBROKERAGE_LISTING_PRICE_LISTINGS_MANAGEMENT: HEADER TITLE LABEL")
    private WebElement distributionFirmMedianPriceChart;

    //endregion


    public ManagementPage(WebDriver driver) {
        super(driver);
    }

    public void daysOnMarketButtonClick(){
        setImplicitTimeout(1, ChronoUnit.SECONDS);
        Helper.universalVerticalSwipe(daysOnMarketButton);
        resetImplicitTimeout();
        element(daysOnMarketButton).click();
    }

    public void bedroomsButtonClick(){
        element(bedroomsButton).click();
    }

    public void isAskingPriseChartAdd(){
        element(askingPriceButton).shouldBeVisible();
    }

    public void isDaysOnMarketChartAdd(){
        element(mktShareDaysOnMarketChart).shouldBeVisible();
    }

    public void buildingHeightButton(){
        element(buildingHeightButton).click();
    }

    public void isBuildingHeightChartAdd(){
        element(buildingHeightButton).shouldBeVisible();
    }

    public void askingPriceButtonClick(){
        element(askingPriceButton).click();
    }

    public void firmListingCountButtonClick(){
        element(firmListingCountButton).click();
    }

    public void isFirmListingCountChartDisplayed(){
        element(firmListingCountButton).shouldBeVisible();
    }

    public void shouldDaysOnMarketDisplayedWithSwipe() throws Exception {
        setImplicitTimeout(1, ChronoUnit.SECONDS);
        Helper.universalVerticalSwipe(mktShareDaysOnMarketChart);
        resetImplicitTimeout();
        element(mktShareDaysOnMarketChart).shouldBeVisible();
    }

    public void addMKTShareAskingPriceChart() throws Exception {
        Helper.swipeDownUntilElementVisible(askingPriceButton);
        element(askingPriceButton).click();

    }

    public void shouldSeeMKTShareAskingPriceChart() {
        element(mktShareAskingPriceChart).shouldBeVisible();
    }

    public void addAndVerifyDistributionFirmListingCountChart() throws Exception {
        Helper.swipeDownUntilElementVisible(distributionFirmListingCountButton);
        element(distributionFirmListingCountButton).click();
        element(distributionFirmListingCountChart).shouldBeVisible();
    }

    public void addAndVerifyMKTShareBedroomsChart() throws Exception{
        Helper.swipeDownUntilElementVisible(bedroomsButton);
        element(bedroomsButton).click();
        element(mktShareBedroomsChart).shouldBeVisible();
    }

    public void addAndVerifyMKTShareBuildingHeightChart() throws Exception{
        Helper.swipeDownUntilElementVisible(buildingHeightButton);
        element(buildingHeightButton).click();
        element(mktShareBuildingHeightChart).shouldBeVisible();
    }

    public void addAndVerifyMKTShareBuildingTypeChart() throws Exception{
        Helper.swipeDownUntilElementVisible(buildingTypeButton);
        element(buildingTypeButton).click();
        element(mktShareBuildingTypeChart).shouldBeVisible();
    }

    public void addAndVerifyMKTShareDaysOnMarketChart() throws Exception{
        Helper.swipeDownUntilElementVisible(daysOnMarketButton);
        element(daysOnMarketButton).click();
        element(mktShareDaysOnMarketChart).shouldBeVisible();
    }

    public void agentsListingCountButtonClick(){
        element(agentListingCountButton).click();
    }

    public void shouldSeeDistributionAgentsListingCountChart(){
        element(distributionAgentListingCountChart).shouldBeVisible();
    }

    public void addAndVerifyDistributionAgentMedianPriceChart() throws Exception {
        Helper.swipeDownUntilElementVisible(agentMedianPriceButton);
        element(agentMedianPriceButton).click();
        element(distributionAgentMedianPriceChart).shouldBeVisible();
    }

    public void addAndVerifyDistributionFirmDOMChart() throws Exception {
        Helper.swipeDownUntilElementVisible(firmDOMButton);
        element(firmDOMButton).click();
        element(distributionFirmDOMChart).shouldBeVisible();
    }

    public void addAndVerifyDistributionFirmListingVolumeChart() throws Exception {
        Helper.swipeDownUntilElementVisible(firmListingVolumeButton);
        element(firmListingVolumeButton).click();
        element(distributionFirmListingVolumeChart).shouldBeVisible();
    }

    public void addAndVerifyDistributionFirmMedianDollarPerSQFTChart() throws Exception {
        Helper.swipeDownUntilElementVisible(firmMedianDollarPerSQFTButton);
        element(firmMedianDollarPerSQFTButton).click();
        element(distributionFirmMedianDollarPerSQFTChart).shouldBeVisible();
    }

    public void addAndVerifyDistributionFirmMedianPriceChart() throws Exception {
        Helper.swipeDownUntilElementVisible(firmMedianPriceButton);
        element(firmMedianPriceButton).click();
        element(distributionFirmMedianPriceChart).shouldBeVisible();
    }


    public void addMKTShareBuildingTypeChart() throws Exception {
        Helper.swipeDownUntilElementVisible(buildingTypeButton);
        element(buildingTypeButton).click();
    }

    public void addMKTShareBedroomsChart() throws Exception {
        Helper.swipeDownUntilElementVisible(bedroomsButton);
        element(bedroomsButton).click();
    }

}