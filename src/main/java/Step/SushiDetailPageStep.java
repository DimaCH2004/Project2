package Step;

import io.qameta.allure.Step;

public class SushiDetailPageStep extends StepSetup{
    @Step("click on share button")
    public SushiDetailPageStep clickOnShare(){
        sushiDetailPage.share.click();
        return this;
    }
}
