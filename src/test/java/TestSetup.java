import Data.RetrieveData;
import Data.User;
import Step.*;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.asserts.SoftAssert;

import java.sql.ResultSet;

import static com.codeborne.selenide.Selenide.*;

public class TestSetup {
    HeaderStep headerStep;
    RestStep restStep;
    FilterBarStep filterBarStep;
    SoftAssert softAssert;
    SushiPageSteps sushiPageSteps;
    SushiDetailPageStep sushiDetailPageStep;
    FacebookLoginPageSteps facebookLoginPageSteps;
    InsertUserStep insertUserStep;
    RetrieveData retrieveData;
    ResultSet resultSet;
    User user;
    RegistrationPageStep registrationPageStep;

    @BeforeMethod (groups = {"Regression1","Regression2"})
    public void setUp() {
        Configuration.browser = "firefox";
        Configuration.pageLoadTimeout = 1000000L;
        Configuration.screenshots = true;
        Configuration.savePageSource = false;
        open("https://www.swoop.ge/");
        WebDriverRunner.getWebDriver().manage().window().maximize();
        softAssert = new SoftAssert();
    }

    public static WebDriver getWebDriver(){
        return WebDriverRunner.getWebDriver();
    }

    @AfterMethod (groups = {"Regression1","Regression2"})
    public void tearDown() {
        softAssert.assertAll();
        Selenide.closeWebDriver();
    }
}
