package Step;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import java.util.Objects;


public class SushiPageSteps extends StepSetup{
    @Step("add sushi to favorites")
    public SushiPageSteps addSushiToFavorites(){
        commonPage.offers.get(0).$(commonPage.favorite).click();
        return this;
    }
    @Step("click on first sushi on the page")
    public SushiPageSteps clickOnFirstSushi(){
        commonPage.offers.get(0).click();
        return this;
    }
    @Step("check if registration bar appeared")
    public SushiPageSteps registrationAppeared(){
        softAssert.assertTrue(commonPage.registration.isDisplayed());
        softAssert.assertAll();
        return this;
    }
    @Step("check if the item is sold out")
    public SushiPageSteps isItSoldOut(){
        softAssert.assertTrue(!Objects.equals(commonPage.voucherLimit.getAttribute(data.voucherLimitAttribute), "100"),"voucher is sold out");
        softAssert.assertAll();
        return this;
    }
    @Step("sort the items in decreasing order")
    public SushiPageSteps sortDecreasing(){
        commonPage.sortButton.click();
        commonPage.decreasing.click();
        //wait for the new page to load
        filterBar.newPage.shouldHave(Condition.attribute("style", "overflow: unset;"));
        return this;
    }
    @Step("check if items are sorted")
    public SushiPageSteps checkSorted(){
        ElementsCollection sushi = commonPage.offers;
        int first, second;
        for(int i = 0; i < sushi.size()-1; i++){
            sushi.get(i).scrollTo(); //for screenshot
            first = Integer.parseInt(sushi.get(i).$$(commonPage.price).get(2).getText().replace("₾", "").trim());
            second = Integer.parseInt(sushi.get(i+1).$$(commonPage.price).get(2).getText().replace("₾", "").trim());
            if(first < second) {
                softAssert.fail("elements are not sorted correctly");
            }
        }
        softAssert.assertAll();
        return this;
    }

}
