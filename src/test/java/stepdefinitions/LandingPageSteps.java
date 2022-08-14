package stepdefinitions;

import PageObjects.PlayGroundLandingPageObjects;
import base.WebBaseExecution;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.WebDriver;

public class LandingPageSteps extends WebBaseExecution {
   /* public LandingPageSteps(WebDriver driver) {
        super(driver);
    }*/
   private static PlayGroundLandingPageObjects landingpage;

    public LandingPageSteps() {
        landingpage = new PlayGroundLandingPageObjects(driver);
    }


   /* @Given("^user navigates to home page$")
    public void userNavigatesToHomePage() {

        //driver.navigate().to(getConfigPropertyValue("src/test/java/resources/execution.properties", "baseURL"));

        System.out.print("Hello");

    }

    @Then("^url is open successfully$")
    public void urlIsOpenSuccessfully() {

        //PlayGroundLandingPageObjects playGroundLandingPageObjects = new PlayGroundLandingPageObjects(driver);
        String actualTitle;
        actualTitle = String.valueOf(landingpage.getTitleOfPage());
        System.out.println(actualTitle);

        String expectedTitle = "UI Test Automation";

        Assert.isTrue(actualTitle == expectedTitle, "You have not navigated to the correct page");

    }*/
}
