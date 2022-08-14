package PageObjects;

import base.WebBaseExecution;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HP_Objects extends WebBaseExecution {

    public HP_Objects(WebDriver driver) {
        super(driver);
    }

    @FindBy(how = How.ID , using = "title")
    public WebElement TitleTxt;

    @FindBy(how = How.XPATH, using = "//*[contains(text(),'Text Input')]")
    public WebElement InputTextLink;

    @FindBy(how = How.XPATH, using = "//*[contains(text(),'Sample App')]" )
    public WebElement SampleAppLinkText;
}
