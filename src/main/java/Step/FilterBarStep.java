package Step;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import io.qameta.allure.Step;

public class FilterBarStep extends StepSetup{
    @Step("set minimum price")
    public  FilterBarStep setMinPrice(){
        filterBar.minPrice.get(1).setValue(String.valueOf(data.lowerRange));
        return this;
    }
    @Step("set maximum price")
    public  FilterBarStep setMaxPrice(){
        filterBar.maxPrice.get(1).setValue(String.valueOf(data.higherRange));
        return this;
    }
    @Step("click on search button")
    public FilterBarStep clickSearch() {
        filterBar.searchButton.get(1).scrollTo();
        Selenide.executeJavaScript("window.scrollBy(0, arguments[0]);", data.scrollOffset);
        filterBar.searchButton.get(1).click();
        //waits for the filtered elements to load
        filterBar.newPage.shouldHave(Condition.attribute("style", "overflow: unset;"));
        return this;
    }
}
