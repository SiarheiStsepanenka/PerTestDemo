package com.perchwell.tests;

import com.perchwell.SampleTest;
import org.junit.Test;

public class LoginAsBrokerTest extends SampleTest {

@Test
public void logInAsBroker() throws Exception {

	loginSteps.loginAsBroker();
	perchwellSteps.skipAllHints();
	perchPopupSteps.clickNotNowButton();
	perchwellSteps.clickOpenAccountButton();
	accountSteps.shouldSeeOptionClient();
	accountSteps.shouldSeeOptionDisscussions();
	accountSteps.shouldSeeOptionTags();
	accountSteps.shouldSeeOptionCompare();
}
}