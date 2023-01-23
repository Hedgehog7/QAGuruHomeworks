package lessons;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class TextBoxTests {
   @BeforeAll
   static void beforeAll(){
       Configuration.browserSize = "1029x1080";
   }

    @Test
    void nameFieldTest()
    {
        String name = "John Watson";
        String email = "JohnWatson@gmail.com";
        String currentAddress = "Japan, Tokyo, Hokkaido prefecture";
        String permanentAddress = "Russia, Irkutsk";


        open("https://demoqa.com/text-box");
        $(".main-header").shouldHave(text("Text Box"));

        $("#userName").setValue(name);
        $("#userEmail").setValue(email);
        $("#currentAddress").setValue(currentAddress);
        $("#permanentAddress").setValue(permanentAddress);
        $("#submit").click();

        $("#output").shouldBe(visible);

        $("#output").$("#name").shouldHave(text(name));
        $("#output").$("#email").shouldHave(text(email));
        $("#output").$("#currentAddress").shouldHave(text(currentAddress));
        $("#output").$("#permanentAddress").shouldHave(text(permanentAddress));

    }
}
