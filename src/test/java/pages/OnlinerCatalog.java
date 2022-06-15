package pages;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class OnlinerCatalog {

    public static void openCategory(String categoryName) {
        $(byText(categoryName)).click();
    }

    public static void openProduct(String productPath) {
        $("a[href=\"https://catalog.onliner.by/" + productPath + "\"").click();
    }
}
