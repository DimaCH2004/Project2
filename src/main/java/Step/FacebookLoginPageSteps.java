package Step;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;

public class FacebookLoginPageSteps extends StepSetup{
    @Step("check if the facebook login window pops up")
    public FacebookLoginPageSteps didLoginFormAppear(){
        facebookLoginPage.facebookLoginForm.shouldBe(Condition.visible);
        return this;
    }
}
