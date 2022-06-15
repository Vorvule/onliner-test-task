package pages;

import com.codeborne.selenide.Condition;

import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.Selenide.$$;

public class OnlinerCatalogItems {
    public static void verifyItemsCount(int expectedResultsCount) {
        $$(".schema-product__group").shouldHave(size(expectedResultsCount));
    }

    public static void verifyEachItemContains(String manufacturerName) {
        $$(".schema-product__group").stream().forEach(item -> {
            System.out.println(item);
            item.shouldHave(Condition.text(manufacturerName));
        });
    }
}
