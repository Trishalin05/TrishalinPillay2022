package PageObjects;

import base.WebBaseExecution;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class TextInputPageObjects extends WebBaseExecution {

    public TextInputPageObjects(WebDriver driver) {
        super(driver);
    }

    @FindBy(how = How.ID , using = "newButtonName")
    public WebElement NewButtonNameInput;

    @FindBy (how = How.ID, using = "updatingButton")
    public WebElement UpdateButtonNameBtn;
}
