import Data.RetrieveData;
import Data.User;
import Step.*;
import io.qameta.allure.*;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import java.sql.SQLException;
import static com.codeborne.selenide.Selenide.switchTo;
@Listeners(Config.class)
@Epic("Test Swoop functionality")
@Feature("Swoop testing")
public class TestSwoop extends TestSetup{
    @BeforeClass(groups = {"Regression1","Regression2"})
    public void beforeClass() throws SQLException {
        headerStep = new HeaderStep();
        restStep = new RestStep();
        filterBarStep = new FilterBarStep();
        sushiPageSteps = new SushiPageSteps();
        sushiDetailPageStep = new SushiDetailPageStep();
        facebookLoginPageSteps = new FacebookLoginPageSteps();
        insertUserStep = new InsertUserStep();
        registrationPageStep = new RegistrationPageStep();
        retrieveData = new RetrieveData();
        user = new User();
    }

    @Story("Testing rest page")
    @Severity(SeverityLevel.NORMAL)
    @Description("Testing if price filter works on rest page")
    @Test(groups = "Regression1")
    public void testRestPage() throws InterruptedException {
        headerStep.clickRestButtonButton();
        filterBarStep.setMinPrice().setMaxPrice().clickSearch();
        restStep.areInBounds();
    }
    @Story("Testing food page favorite")
    @Severity(SeverityLevel.NORMAL)
    @Description("Testing if user can add sushi to favorites and if the registration page appears")
    @Test(groups = "Regression1")
    public void testFoodPage() {
        headerStep.clickOnCategories().hoverOnFood().clickOnSushi();
        sushiPageSteps.addSushiToFavorites().isItSoldOut().registrationAppeared();
    }
    @Story("Testing sushi page sorting")
    @Severity(SeverityLevel.NORMAL)
    @Description("Testing if user can sort items in decreasing order")
    @Test(groups = "Regression2")
    public void testSortSushi() {
        headerStep.clickOnCategories().hoverOnFood().clickOnSushi();
        sushiPageSteps.sortDecreasing().checkSorted();
    }
    @Story("Testing sushi page share")
    @Severity(SeverityLevel.NORMAL)
    @Description("Testing user if can share the item of their liking and if the facebook login form appears")
    @Test(groups = "Regression2")
    public void testShare() {
        headerStep.clickOnCategories().hoverOnFood().clickOnSushi();
        sushiPageSteps.clickOnFirstSushi();
        sushiDetailPageStep.clickOnShare();
        switchTo().window(1);
        facebookLoginPageSteps.didLoginFormAppear();
    }
    @Story("Testing registration page")
    @Severity(SeverityLevel.NORMAL)
    @Description("Testing website registration form from database and checking if appropriate error message appears")
    @Test(groups = "Regression2")
    public void testDataBase() throws SQLException {
        insertUserStep.insertUser(user);
        resultSet = retrieveData.retrieveData();
        resultSet.next();
        registrationPageStep.switchToRegistration().setFirstName().setLastName().setPhone().setEmail().setDate().setPassword()
                        .setPasswordConfirmation().clickOnRegister().checkIfErrorMessageAppeared();
        insertUserStep.clearUsersTable();
    }
}
