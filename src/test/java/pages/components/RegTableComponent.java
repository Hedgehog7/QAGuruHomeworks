package pages.components;


import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selectors.byText;

public class RegTableComponent {

    private SelenideElement table = $(".modal-content");
    private SelenideElement tableHeader = $("#example-modal-sizes-title-lg");

    public void verifyTableAppears() {
        table.shouldBe(visible);
        tableHeader.shouldHave(text(("Thanks for submitting the form")));
    }

    public void checkTableIsFilledCorrect(String key, String value) {
        $(".table-responsive").$(byText(key)).parent().shouldHave(text(value));
    }
}
