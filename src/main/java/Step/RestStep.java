package Step;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.testng.Assert;


public class RestStep extends StepSetup{
    @Step("check if returned items are in price bounds")
    public RestStep areInBounds(){
        for(SelenideElement element:commonPage.offers){
            element.scrollTo(); //for screenshot
            int price = Integer.parseInt(element.$$(commonPage.price).get(2).getText().replace("₾", "").trim());
            if(price < data.lowerRange || price > data.higherRange) {
                Assert.fail("all returned elements on the first page are not in selected range");
            }
        }
        return this;
    }
}

