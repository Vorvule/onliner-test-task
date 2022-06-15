package pages;

import static com.codeborne.selenide.Selenide.$;

public class OnlinerRoot {

    public static void openCatalog() {
        final String catalogSelector = ".b-main-navigation__item";
        $(catalogSelector).click();
    }

    public static void openElectronics() {
        final String electronicsSelector = "li[data-id=\"1\"]";
        $(electronicsSelector).click();
    }
}
