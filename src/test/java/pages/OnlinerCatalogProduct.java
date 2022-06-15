package pages;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class OnlinerCatalogProduct {

    public static void closeCityChoiceModals() {
        $(byText("Нет, другой")).click();
        $(".auth-popup__close").click();
    }

    public static void chooseManufacturer(String manufacturerName) {
        $(byText(manufacturerName)).scrollIntoView(true).click();
        $(byText("Нет товаров")).scrollIntoView(true).shouldBe(visible);
        $(byText("Нет товаров")).shouldNot(exist);
    }
}
