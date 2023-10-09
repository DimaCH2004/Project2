package Page;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class FilterBar {
    public ElementsCollection
            minPrice = $$("#minprice"),
            maxPrice = $$("#maxprice"),
            searchButton = $$(".submit-button");
    public SelenideElement
            newPage = $("#body");
}
