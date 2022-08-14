package PageObjects;


import base.WebBaseExecution;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PlayGroundLandingPageObjects extends WebBaseExecution {


    public WebElement getTitleOfPageTxt() {
        return TitleOfPageTxt;
    }

 /*   @FindBy(id = "title")
    private WebElement TitleOfPageTxt;*/

    @FindBy(how = How.ID , using="title")
    private WebElement TitleOfPageTxt;


   // By titleText = By.id("title");

    public PlayGroundLandingPageObjects(WebDriver driver) {
        super(driver);
    }


    public WebElement getTitleOfPage() {
        return TitleOfPageTxt;
    }


    //Methods

    public void getTitleText() {

      TitleOfPageTxt.getText();



    }










}
