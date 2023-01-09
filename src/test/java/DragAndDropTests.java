import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class DragAndDropTests {
    @Test
    void dragAndDropByActions() {
        //Doesn`t work via actions()

        //Open https://the-internet.herokuapp.com/drag_and_drop
        open("https://the-internet.herokuapp.com/drag_and_drop");
        //Drag A to B`s place
        SelenideElement aRect = $("#column-a");
        SelenideElement bRect = $("#column-b");

        int size = aRect.getSize().width;

        actions().clickAndHold(aRect).moveByOffset(size * 2, 0).perform();
        //Check that rectangles are swapped
        bRect.shouldHave(text("A"));

    }

    @Test
    void dragAndDropBySelenide() {
        Configuration.holdBrowserOpen = true;
        //Open https://the-internet.herokuapp.com/drag_and_drop
        open("https://the-internet.herokuapp.com/drag_and_drop");
        //Drag A to B`s place
        SelenideElement aRect = $("#column-a");
        SelenideElement bRect = $("#column-b");
        $(aRect).dragAndDropTo(bRect);
        //Check that rectangles are swapped
        bRect.shouldHave(text("A"));
        aRect.shouldHave(text("B"));
    }
}
