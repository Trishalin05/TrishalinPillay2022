package stepdefinitions;

import PageObjects.HP_Objects;
import PageObjects.PlayGroundLandingPageObjects;
import PageObjects.TextInputPageObjects;
import base.WebBaseExecution;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

import java.sql.SQLOutput;


public class AppTesting extends WebBaseExecution{

    private static PlayGroundLandingPageObjects landingPage;

    public AppTesting() {
        landingPage = new PlayGroundLandingPageObjects(driver);
    }
    @Given("^user navigates to home page to test$")
    public void userNavigatesToHomePageToTest() {

        System.out.print("Hello");
    }


    @Then("^url is open successfully launched$")
    public void urlIsOpenSuccessfullyLaunched() {




        //System.out.println("Actual Title is ::" + actualTitle);

        String expectedTitle = "UI Test Automation";

        //Assert.assertEquals(actualTitle == expectedTitle, "You have not navigated to the correct page");
    }

    @Given("^user navigates to home page to test now$")
    public void userNavigatesToHomePageToTestNow() {
        System.out.println("Not");
    }

    @Then("^url is open successfully launched again$")
    public void urlIsOpenSuccessfullyLaunchedAgain() {

        HP_Objects hp_objects = new HP_Objects(driver);

        String actual = hp_objects.TitleTxt.getText();
        System.out.println(actual);
    }

    @When("^user clicks on Text Input after page landing page loads$")
    public void userClicksOnTextInputAfterPageLandingPageLoads() {
        HP_Objects hp_objects = new HP_Objects(driver);

        hp_objects.InputTextLink.click();

    }

    @Then("^user is on Text Input page$")
    public void userIsOnTextInputPage() {

        TextInputPageObjects textInputPageObjects = new TextInputPageObjects(driver);

        assert textInputPageObjects.NewButtonNameInput.isDisplayed();
    }


}
