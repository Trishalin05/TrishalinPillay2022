package stepdefinitions;

import PageObjects.PlayGroundLandingPageObjects;
import base.WebBaseExecution;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePageSteps extends WebBaseExecution {

    public HomePageSteps(WebDriver driver) {
        super(driver);
        PlayGroundLandingPageObjects playGroundLandingPageObjects = new PlayGroundLandingPageObjects(driver);
    }






}
