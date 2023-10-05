package Page;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class Header {
    //nav bar
    public SelenideElement
            filmButton = $("li.MoreCategories:nth-child(1) > a"),
            aestheticsButton = $("li.MoreCategories:nth-child(2) > a"),
            restButton = $("li.MoreCategories:nth-child(3) > a"),
            foodButton = $("li.MoreCategories:nth-child(4) > a"),
            forChildrenButton = $("li.MoreCategories:nth-child(5) > a"),
            haveFunButton = $("li.MoreCategories:nth-child(6) > a"),
            sportButton = $("li.MoreCategories:nth-child(7) > a"),
            moreButton = $("li.MoreCategories:nth-child(8) > a");
    //categories
    public SelenideElement
            categories = $(byText("კატეგორიები")),
            food = $("li.catId-3"),
            sushi = $$("div.mobileSubCategories.subCategory-3.openedMenu li a").findBy(text("სუში")),
            login = $(".HeaderTools.swoop-login");
}
