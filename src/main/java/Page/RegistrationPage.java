package Page;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class RegistrationPage {
    public SelenideElement
            register = $(".register"),
            firstName = $("#pFirstName"),
            lastName = $("#pLastName"),
            email = $("#pEmail"),
            phone = $("#pPhone"),
            birthDate = $("#pDateBirth"),
            password = $("#pPassword"),
            confirmPassword = $("#pConfirmPassword"),
            registrationButton = $(".dashbord-registration input[type='button']"),
            errorMessage = $("#physicalInfoMassage");
}
