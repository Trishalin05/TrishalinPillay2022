package PageObjects;

import base.WebBaseExecution;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SampleAppPageObjects extends WebBaseExecution {

    public SampleAppPageObjects(WebDriver driver) {
        super(driver);
    }

    @FindBy(how = How.NAME, using = "UserName")
    public WebElement userNameInput;

    @FindBy(how = How.NAME, using = "Password")
    public WebElement passwordInput;

    @FindBy(how = How.ID, using = "login")
    public WebElement loginButton;

    @FindBy(how = How.ID, using = "loginstatus")
    public WebElement loginStatus;


}
