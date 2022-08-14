package stepdefinitions;

import base.WebBaseExecution;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import java.io.IOException;

    public class WebHooks extends WebBaseExecution {

        @Before
        public void BeforeScenarios() throws IOException {

            launchBrowserAndURL();
        }

        @After
        public void AfterScenarios(){
            driver.quit();
        }
    }




