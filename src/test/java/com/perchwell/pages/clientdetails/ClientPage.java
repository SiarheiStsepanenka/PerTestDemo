package com.perchwell.pages.clientdetails;

import com.perchwell.crossPlatform.Config;
import com.perchwell.data.SearchRequests;
import com.perchwell.email.MailTrap;
import com.perchwell.entity.MailTrapResponse;
import com.perchwell.helpers.Helper;
import com.perchwell.helpers.RandomGenerator;
import com.perchwell.helpers.SessionVariables;
import com.perchwell.helpers.TechHelper;
import io.appium.java_client.MobileBy;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

import static java.util.concurrent.TimeUnit.SECONDS;

public class ClientPage extends TechHelper {

	@AndroidFindBy(id = "com.perchwell.re.staging:id/discuss_button")
	@iOSXCUITFindBy(accessibility = "ADD NEW CLIENT")
	private WebElement addNewClientButton;

	@AndroidFindBy(id = "com.perchwell.re.staging:id/discuss_button")
	@iOSXCUITFindBy(accessibility = "ADD NEW AGENT")
	private WebElement addNewAgentButton;

	@iOSXCUITFindBy(accessibility = "INVITE MY CLIENTS")
	private WebElement inviteNewClientButton;

	@AndroidFindBy(id = "com.perchwell.re.staging:id/name_edit_text")
	@iOSXCUITFindBy(accessibility = "client_name_text_field")
	private WebElement clientNameTextBox;

	@AndroidFindBy(id = "com.perchwell.re.staging:id/message_edit_text")
	@iOSXCUITFindBy(accessibility = "ClientMessageTextField")
	private WebElement addMessageField;

	@AndroidFindBy(id = "com.perchwell.re.staging:id/email_edit_text")
	@iOSXCUITFindBy(accessibility = "client_email_text_field")
	private WebElement clientEmailTextBox;

	@AndroidFindBy(id = "com.perchwell.re.staging:id/email_edit_text")
	@iOSXCUITFindBy(accessibility = "agent_email_text_field")
	private WebElement agentEmailTextBox;

	@AndroidFindBy(id = "com.perchwell.re.staging:id/client_group")
	@iOSXCUITFindBy(accessibility = "client_group_button")
	private WebElement groupLabel;

	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeStaticText")
	private WebElement firstClientOrAgent;

	@AndroidFindBy(id = "com.perchwell.re.staging:id/up_button")
	@iOSXCUITFindBy(accessibility = "contactsViewCloseButton")
	private WebElement crossBackButtonFromClients;

	@AndroidFindBy(id = "com.perchwell.re.staging:id/up_button")
	@iOSXCUITFindBy(accessibility = "chevronLeft")
	private WebElement backButtonCreateAgent;

	@AndroidFindBy(id = "com.perchwell.re.staging:id/negative_button")
	@iOSXCUITFindBy(accessibility = "contactsViewCloseButton")
	private WebElement closeButton;

	@AndroidFindBy(id = "com.perchwell.re.staging:id/invite_button")
	@iOSXCUITFindBy(accessibility = "invite_client_label")
	private WebElement inviteButton;

	@AndroidFindBy(id = "com.perchwell.re.staging:id/logout")
	@iOSXCUITFindBy(accessibility = "LOG OUT")
	private WebElement logOutButton;

	@AndroidFindBy(id = "com.perchwell.re.staging:id/positive_button")
	@iOSXCUITFindBy(accessibility = "YES")
	private WebElement yesButtonLogOutWindow;

	@iOSXCUITFindBy(accessibility = "OK")
	private WebElement okButton;

	@AndroidFindBy(xpath = "//*[@text='DELETE']")
	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeCell/XCUIElementTypeButton")
	private WebElement deleteButton;

	@AndroidFindBy(id = "com.perchwell.re.staging:id/search_src_text")
	@iOSXCUITFindBy(accessibility = "ContactsSearchBar")
	private WebElement contactsSearchBar;

	@AndroidFindBy(accessibility = "Clear query")
	@iOSXCUITFindBy(accessibility = "Clear text")
	private WebElement clearTextButton;

	@AndroidFindBy(accessibility = "CLIENT TEST+CLIENT-TH-CHARTS")
	@iOSXCUITFindBy(accessibility = "CLIENT TEST+CLIENT-TH-CHARTS")
	private WebElement testClient;

	@AndroidFindBy(xpath = "//android.widget.RelativeLayout/android.view.ViewGroup/android.widget.TextView[@text != 'DELETE']")
	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeTable[`visible==1`]/XCUIElementTypeCell")
	private List<WebElement> clients;

	@AndroidFindBy(id = "com.perchwell.re.staging:id/action_button")
	@iOSXCUITFindBy(accessibility = "GROUPS")
	private WebElement groupsButton;

	@iOSXCUITFindBy(accessibility = "Transparent Background View")
//	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]")
//	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeTable[1]")
	private WebElement searchFrozenArea;

	@AndroidFindBy(id = "com.perchwell.re.staging:id/action_button")
	@iOSXCUITFindBy(accessibility = "Done")
	private WebElement doneButton;

	@AndroidFindBy(xpath = "*//android.widget.TextView[contains(@text, '11CLIENT')]")
	@iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeStaticText' AND name CONTAINS '11CLIENT'")
	private List<WebElement> clientList;

	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell")
	private List<WebElement> listOfClientsAndListings;

	@AndroidFindBy(xpath = "//*[@text = 'Actively Searching']")
	@iOSXCUITFindBy(accessibility = "Table View Cell: Actively Searching")
	private WebElement activelySearchingGroup;

    @AndroidFindBy(xpath = "//*[@text = 'Inactive']")
	@iOSXCUITFindBy(accessibility = "Table View Cell: Inactive")
	private WebElement inactiveGroup;

    @AndroidFindBy(xpath = "//*[@text = 'New Contacts']")
	@iOSXCUITFindBy(accessibility = "Table View Cell: New Contacts")
	private WebElement newContactsGroup;

    @AndroidFindBy(xpath = "//*[@text = 'Passively Searching']")
	@iOSXCUITFindBy(accessibility = "Table View Cell: Passively Searching")
	private WebElement passivelySearchingGroup;

    @AndroidFindBy(xpath = "//*[@text = 'Not Grouped']")
	@iOSXCUITFindBy(accessibility = "Table View Cell: Not Grouped")
	private WebElement notGroupedGroup;

	@AndroidFindBy(id = "com.perchwell.re.staging:id/negative_button")
	private WebElement cancelButton;

	@iOSXCUITFindBy(accessibility = "AddClientViewControllerBackButton")
	private WebElement backButtonCreateClient;

	@AndroidFindBy(id = "com.perchwell.re.staging:id/search_src_text")
	@iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeSearchField' AND name CONTAINS 'SEARCH'")
	private WebElement searchClientField;

	@AndroidFindBy(id = "com.perchwell.re.staging:id/search_mag_icon")
	private WebElement magnifierIcon;

	@AndroidFindBy(id = "com.perchwell.re.staging:id/client_group_text_view")
	private WebElement groupField;

	@AndroidFindBy(id = "com.perchwell.re.staging:id/invite_button")
	@iOSXCUITFindBy(accessibility = "invite_agent_label")
	private WebElement inviteAgentButton;

	public ClientPage(WebDriver driver) {
		super(driver);
	}

	public WebElement getAddNewClientButton() {
		return addNewClientButton;
	}

	public void clickOnInviteButton() {
		element(inviteButton).click();
	}

	public void clickOnYesButtonLogOutWindow() {
		element(yesButtonLogOutWindow).click();
	}

	public void clickOnAddNewClientButton() {
		element(addNewClientButton).click();
	}

	public void clickOnInviteNewClientButton() {
		element(inviteNewClientButton).click();
	}

	public void setClientName(String clientName) {
		element(clientNameTextBox).sendKeys(clientName);
	}

	public void setClientEmail(String clientEmail) {
		element(clientEmailTextBox).sendKeys(clientEmail);
	}

	public void clickOnGroupLabel() {
		element(groupLabel).click();
	}

	public void clickOnFirstClientOrAgent() {
		element(firstClientOrAgent).click();
	}

	public void selectGroup(String groupName) {
		if (Config.isAndroid()) {
			getDriver().findElement(MobileBy.xpath("//*[@text='" + groupName + "']")).click();
		} else {
			getDriver().findElement(MobileBy.AccessibilityId(groupName)).click();
		}
	}

	private void swipeDownUntilElementVisible(String name){
		WebElement client;

		if (Config.isAndroid()){
			client = element(By.xpath("//*[@text='" + name + "']"));
		} else {
			client = element(MobileBy.AccessibilityId(name));
		}
		setImplicitTimeout(1, SECONDS);
		Helper.universalVerticalSwipe(client);
		resetImplicitTimeout();
	}

	private void swipeDownUntilElementVisibleAndroid(String name) {
		setImplicitTimeout(1, SECONDS);
		Helper.androidSwipeDownUntilElementVisible(name);
		resetImplicitTimeout();
	}

	public void isClientDisplayed(String name){
//		this.swipeDownUntilElementVisible(name);

		if (Config.isAndroid()) {
			element(searchClientField).sendKeys(name);
			element(MobileBy.AccessibilityId(name)).shouldBeVisible();
		} else {
			element(searchClientField).sendKeys(name);
			element(searchFrozenArea).click();
			element(MobileBy.AccessibilityId(name)).shouldBeVisible();
		}
	}

	public void isAgentDisplayed(String name){
		this.swipeDownUntilElementVisible(name);
		if (Config.isAndroid()){
			element(By.xpath("//*[contains(@text,'" + name + "')]")).shouldBeVisible();
		} else {
			element(MobileBy.AccessibilityId(name)).shouldBeVisible();
		}
	}

	public void isClientOrAgentDisplayedAndroid(String name) {
//		this.swipeDownUntilElementVisibleAndroid(name);
		waitABit(3000);
		element(MobileBy.xpath("//*[contains(@text, '" + name + "')]")).shouldBeVisible();
	}

	public void checkInvitationEmailSent(String email) {
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		MailTrapResponse[] mailTrapResponse = MailTrap.getEmail(SessionVariables.getValueFromSessionVariable(email));
		Assert.assertEquals(1, mailTrapResponse.length);
//		Boolean invitationWasFound = false;
//
//		MailTrapResponse[] mailTrapResponse = MailTrap.getEmail(SessionVariables.getValueFromSessionVariable(email));
//		if (mailTrapResponse.length > 0) {
//			invitationWasFound = true;
//		}
//		return invitationWasFound;
	}

	public String getFirstClientOrAgentName() {
		return firstClientOrAgent.getAttribute("name");
	}

	public void clickOnCrossBackButtonFromClients() {
		element(crossBackButtonFromClients).click();
	}

	public void clickOnCancelButtonInDiscussWithClient() {
		element(closeButton).click();
	}

	public void clickOnDesiredClientOrAgent(String name) {
//		if (Config.isAndroid()) {
//			element(MobileBy.xpath("//*[contains(@text, '" + name + "')]")).click();
//		} else {
			element(MobileBy.AccessibilityId(name)).click();
//		}
	}

	public void logOut() {
		element(logOutButton).click();
	}

	public String generateClientName() {
		return RandomGenerator.getRandomString("11CLIENTNAME");
	}

	public String generateClientEmail() {
		return RandomGenerator.getRandomString("11CLIENTEMAIL") + "@EMAIL.COM";
	}

	public void clickOnAddNewAgentButton() {
		element(addNewAgentButton).click();
	}

	public void setAgentEmail(String email) {
		element(agentEmailTextBox).sendKeys(email);
	}

	public void setMessageField(String message) {
		element(addMessageField).sendKeys(message);
	}

	public void clickOnBackButtonCreateAgent() {
		element(backButtonCreateAgent).click();
	}

	public void clickOnClientSuccessfullyAddedOkButton() {
		if(!Config.isAndroid()) {
			element(okButton).click();
		}
	}

	public void swipeCreatedClientName(String name) throws Exception {
		WebElement client;
		waitABit(3000);
		if (Config.isAndroid()) {
			client = element(MobileBy.xpath("//*[@content-desc = '" + name + " ']"));
		} else {
			client = element(MobileBy.AccessibilityId(name));
		}
		int y = client.getLocation().getY();
		universalHorizontalSwipe(client, y+1);
	}

	public void clickOnDeleteButton() {
		element(deleteButton).click();
	}

	public void enterValueInSearchField(String text) {
		element(contactsSearchBar).sendKeys(text);
		if (Config.isAndroid()) {
			element(contactsSearchBar).click();
		}
	}

	public void clickOutsideSearchField() {
		if (!Config.isAndroid()) {
			element(searchFrozenArea).click();
		}
	}

	public void clickOnClearTextButton() {
		if(!Config.isAndroid()) {
			element(clearTextButton).click();
		}
	}

	public void isSearchFieldCleared() {
		Assert.assertTrue(String.valueOf(clients.size())
				.equals(SessionVariables.getValueFromSessionVariable("clients_before_search")));
	}

	public void noteNumberClientsBeforeSearch() {
		SessionVariables.addValueInSessionVariable("clients_before_search", String.valueOf(clients.size()));
	}

	public void isTestClientPresent() {
		boolean onlyTestClientDisplayed = false;

		if (Config.isAndroid()) {
			if (clients.size() == 1 && element(testClient).isDisplayed()) {
				onlyTestClientDisplayed = true;
			}
		} else {
			if (((listOfClientsAndListings.size() - 20 == 1) && element(testClient).isDisplayed())) {
				onlyTestClientDisplayed = true;
			}
		}
		Assert.assertTrue(onlyTestClientDisplayed);
	}

	public void clickOnTestClient(String clientName) throws Exception {
//		Helper.swipeDownUntilElementVisible(testClient);
//		Helper.universalVerticalSwipe(testClient);
		if(Config.isAndroid()) {
			element(searchClientField).sendKeys(clientName);
			element(testClient).click();
		} else {
			element(searchClientField).sendKeys(clientName);
			element(searchFrozenArea).click();
			element(testClient).click();
		}

	}

	public void clickOnGroupsButton() {
		element(groupsButton).click();
	}

	public void isClientNotPresented(String name) {
		if (Config.isAndroid()) {
			element(MobileBy.xpath("//*[@text = '" + name + " ']")).shouldNotBeVisible();
		} else {
			element(MobileBy.iOSNsPredicateString("type == 'XCUIElementTypeStaticText' AND name CONTAINS '" + name  + "'")).shouldNotBeVisible();
		}
	}

	public void clickOnDoneButton() {
		element(doneButton).click();
	}

	public void clickOnActivelySearchingGroup() {
		element(activelySearchingGroup).click();
	}

	public void clickOnInactiveGroup() {
		element(inactiveGroup).click();
	}

	public void clickOnNewContactsGroup() {
		element(newContactsGroup).click();
	}

	public void clickOnPassivelySearchingGroup() {
		element(passivelySearchingGroup).click();
	}

	public void clickOnNotGroupedGroup() {
		element(notGroupedGroup).click();
	}

	public void checkFilteredClients(String clientGroup) {
		boolean clientsFilteredCorrectly = true;
        List<WebElement> clientGroups;
		int clientsCount;

		if (clientList.size()<3) {
			clientsCount = clientList.size();
		} else {
			clientsCount = 3;
		}

		for (int i = 0; i<clientsCount; i++) {
			element(clientList.get(i)).click();
			if (Config.isAndroid()) {
                clientGroups = getDriver().findElements(MobileBy.xpath("//*[@text = '" + clientGroup + "']"));
            } else {
                clientGroups = getDriver().findElements(MobileBy.AccessibilityId("Text Field: " + clientGroup + " Group"));
            }

			if (clientGroups.isEmpty()) {
				clientsFilteredCorrectly = false;
				break;
			}
			this.clickOnBackButtonCreateAgent();
		}
		Assert.assertTrue(clientsFilteredCorrectly);
	}

	public void shouldSeeClientGroup(String clientGroup) {
		if (Config.isAndroid()) {
			Assert.assertEquals(element(groupField).getAttribute("text"), clientGroup);
		} else {
			element(MobileBy.AccessibilityId("Text Field: " + clientGroup + " Group")).shouldBeVisible();
		}
	}

	public void clickOnCancelButton() { ///////
		element(cancelButton).click();
	}

	public void clickOnBackButtonCreateClientOnlyIOS() {
		element(backButtonCreateClient).click();
	}

	public void shouldSeeJustCreatedClientWithoutActions(String clientName) {
		if(Config.isAndroid()) {
			waitFor(ExpectedConditions.visibilityOfElementLocated(MobileBy.xpath("//*[contains(@text, '" + clientName + "')]")));
			element(MobileBy.xpath("//*[contains(@text, '" + clientName + "')]")).shouldBeVisible();
		} else {
			waitFor(ExpectedConditions.visibilityOfElementLocated(MobileBy.AccessibilityId(clientName)));
			element(MobileBy.AccessibilityId(clientName)).shouldBeVisible();
		}

	}

	public void clickOnInviteAgentButton() {
		element(inviteAgentButton).click();
	}

	public void shouldSeeSpecificClient(String clientName) {
		if(Config.isAndroid()) {
			element(MobileBy.xpath("//*[contains(@text, '" + clientName + "')]")).shouldBeVisible();
		} else {
			element(MobileBy.AccessibilityId(clientName)).shouldBePresent();
		}
	}

	public void clearSearchFieldForAndroid() {
		element(clearTextButton).click();
		hideKeyboard();
	}
}
