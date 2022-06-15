import static com.codeborne.selenide.Selenide.*;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.Test;
import pages.OnlinerCatalog;
import pages.OnlinerCatalogItems;
import pages.OnlinerCatalogProduct;
import pages.OnlinerRoot;

public class OnlinerTest {
    @Test
    public void searchOnlinerCatalog() {
        Configuration.browserSize = "1920x1080";
        open("https://onliner.by/");

        OnlinerRoot.openCatalog();
        OnlinerRoot.openElectronics();

        OnlinerCatalog.openCategory("Телевидение и видео");
        OnlinerCatalog.openProduct("tv");

        OnlinerCatalogProduct.closeCityChoiceModals();
        OnlinerCatalogProduct.chooseManufacturer("Samsung");

        OnlinerCatalogItems.verifyItemsCount(30);
        OnlinerCatalogItems.verifyEachItemContains("Samsung");
    }
}
