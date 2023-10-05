package Step;

import Data.RetrieveData;
import io.qameta.allure.Step;

import java.sql.SQLException;

public class RegistrationPageStep extends StepSetup{
    @Step("go to registration page")
    public RegistrationPageStep switchToRegistration(){
        header.login.click();
        registrationPage.register.click();
        return this;
    }
    @Step("fill name field")
    public RegistrationPageStep setFirstName() throws SQLException {
        registrationPage.firstName.setValue(RetrieveData.resultSet.getString("firstName"));
        return this;
    }
    @Step("fill last name field")
    public RegistrationPageStep setLastName() throws SQLException {
        registrationPage.lastName.setValue(RetrieveData.resultSet.getString("lastName"));
        return this;
    }
    @Step("fill phone number field")
    public RegistrationPageStep setPhone() throws SQLException {
        registrationPage.phone.setValue(RetrieveData.resultSet.getString("phone"));
        return this;
    }
    @Step("fill email field")
    public RegistrationPageStep setEmail() throws SQLException {
        registrationPage.email.setValue(RetrieveData.resultSet.getString("email"));
        return this;
    }
    @Step("fill date field")
    public RegistrationPageStep setDate() throws SQLException {
        registrationPage.birthDate.setValue(RetrieveData.resultSet.getString("dateOfBirth"));
        return this;
    }
    @Step("fill password field")
    public RegistrationPageStep setPassword() throws SQLException {
        registrationPage.password.setValue(RetrieveData.resultSet.getString("password"));
        return this;
    }
    @Step("fill confirm password field")
    public RegistrationPageStep setPasswordConfirmation() throws SQLException {
        registrationPage.confirmPassword.setValue(RetrieveData.resultSet.getString("password"));
        return this;
    }
    @Step("click on register button")
    public RegistrationPageStep clickOnRegister() throws SQLException {
        registrationPage.registrationButton.click();
        return this;
    }
    @Step("check if error message appears")
    public RegistrationPageStep checkIfErrorMessageAppeared(){
        softAssert.assertTrue(registrationPage.errorMessage.getText().equals(data.errorMessage),"error message did not appear or was wrong");
        return this;
    }

}
