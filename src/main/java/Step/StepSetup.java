package Step;

import Data.*;
import Page.*;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class StepSetup {
    Header header = new Header();
    CommonPage commonPage = new CommonPage();
    Data data = new Data();
    FilterBar filterBar = new FilterBar();
    SushiDetailPage sushiDetailPage = new SushiDetailPage();
    FacebookLoginPage facebookLoginPage = new FacebookLoginPage();
    SoftAssert softAssert = new SoftAssert();
    RegistrationPage registrationPage = new RegistrationPage();
    RetrieveData retrieveData = new RetrieveData();
}
