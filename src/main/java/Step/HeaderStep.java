package Step;

import io.qameta.allure.Step;

public class HeaderStep extends StepSetup{
    @Step("click films button")
    public HeaderStep clickFilmButton(){
        header.filmButton.click();
        return this;
    }
    @Step("click aesthetics button")
    public  HeaderStep clickAestheticsButtonButton(){
        header.aestheticsButton.click();
        return this;
    }
    @Step("click rest button")
    public  HeaderStep clickRestButtonButton(){
        header.restButton.click();
        return this;
    }
    @Step("click food button")
    public  HeaderStep clickFoodButtonButton(){
        header.foodButton.click();
        return this;
    }
    @Step("click for children button")
    public  HeaderStep clickForChildrenButtonButton(){
        header.forChildrenButton.click();
        return this;
    }
    @Step("click have fun button")
    public  HeaderStep clickHaveFunButtonButton(){
        header.haveFunButton.click();
        return this;
    }
    @Step("click sports button")
    public  HeaderStep clickSportButtonButton(){
        header.sportButton.click();
        return this;
    }
    @Step("click more button")
    public  HeaderStep clickMoreButtonButton(){
        header.moreButton.click();
        return this;
    }
    @Step("click click on categories button")
    public HeaderStep clickOnCategories(){
        header.categories.click();
        return this;
    }
    @Step("however on food categories")
    public HeaderStep hoverOnFood() {
        header.food.hover();
        return this;
    }
    @Step("click on sushi")
    public HeaderStep clickOnSushi(){
        header.sushi.click();
        return this;
    }
}
