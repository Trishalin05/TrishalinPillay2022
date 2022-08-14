package stepdefinitions;

import PageObjects.HP_Objects;
import PageObjects.PlayGroundLandingPageObjects;
import PageObjects.TextInputPageObjects;
import base.WebBaseExecution;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

import java.util.concurrent.TimeUnit;

public class TextInputPageSteps extends WebBaseExecution {

    private static TextInputPageObjects textInputPageObjects;
    private static HP_Objects homePageObjects;

    public TextInputPageSteps() {
        textInputPageObjects = new TextInputPageObjects(driver);
        homePageObjects = new HP_Objects(driver);

    }

    @Given("^the user is on Text Input field page$")
    public void theUserIsOnTextInputFieldPage() {

        homePageObjects.InputTextLink.click();

    }

    @And("^user enters \"([^\"]*)\" for new button name$")
    public void userEntersForNewButtonName(String TestButton) throws Throwable {

        textInputPageObjects.NewButtonNameInput.sendKeys(TestButton);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @When("^user clicks new button to change name of button$")
    public void userClicksNewButtonToChangeNameOfButton() {

        textInputPageObjects.UpdateButtonNameBtn.click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @Then("^button name is changed to new button name$")
    public void buttonNameIsChangedToNewButtonName() {

        String expectedName =  "Test Button";
        String actualName = textInputPageObjects.UpdateButtonNameBtn.getText();
        System.out.println("The button actual name is " + actualName);
        Assert.assertEquals("",expectedName,actualName);


    }
}
