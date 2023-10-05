package Page;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class CommonPage {
    public ElementsCollection
            offers = $$(".special-offer");

    public By
            price = byClassName("deal-voucher-price"),
            favorite = byClassName("deal-basket-wishlist");

    public SelenideElement
            registration = $(".login-register-outer"),
            voucherLimit = $("div.voucher-limit"),
            sortButton = $("#sort"),
            decreasing = $(byText("ფასით კლებადი"));

}
