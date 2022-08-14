package stepdefinitions;

import PageObjects.HP_Objects;
import PageObjects.SampleAppPageObjects;
import PageObjects.TextInputPageObjects;
import base.WebBaseExecution;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.concurrent.TimeUnit;

public class SampleAppPageSteps extends WebBaseExecution {

    private static TextInputPageObjects textInputPageObjects;
    private static HP_Objects homePageObjects;
    private static SampleAppPageObjects sampleAppPageObjects;

    public SampleAppPageSteps() {
        textInputPageObjects = new TextInputPageObjects(driver);
        homePageObjects = new HP_Objects(driver);
        sampleAppPageObjects = new SampleAppPageObjects(driver);

    }

    @Given("^the user is on Sample App field page$")
    public void theUserIsOnSampleAppFieldPage() {

        homePageObjects.SampleAppLinkText.click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @And("^user enters \"([^\"]*)\" for username and \"([^\"]*)\" for password$")
    public void userEntersForUsernameAndForPassword(String userName, String password) throws Throwable {

        sampleAppPageObjects.userNameInput.sendKeys(userName);
        sampleAppPageObjects.passwordInput.sendKeys(password);
    }

    @When("^user clicks login button$")
    public void userClicksLoginButton() {

        sampleAppPageObjects.loginButton.click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

    }

    @Then("^user is logged into Sample App$")
    public void userIsLoggedIntoSampleApp() {

        String actualLoginStatus = sampleAppPageObjects.loginStatus.getText();

        System.out.println(actualLoginStatus);

        if (actualLoginStatus.contains("Welcome")) {

            System.out.println("You have logged in Successfully");
        } else {

            System.out.println("Please check username and Password");
        }
    }
}
