import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.File;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class StudentRegFormTests {
    String firstName = "Ivan";
    String lastName = "Ivanov";
    String userEmail = "ivan@mail.ru";
    String userNumber = "9009999999";
    String gender = "Male";
    String birthDate = "09 February,1994";
    String subject1 = "Biology";
    String subject2 = "Maths";
    String hobbies = "Reading, Music";
    String state = "NCR";
    String city = "Delhi";

    String currentAddress = "Japan, Tokyo, Hokkaido prefecture";


    File avatar = new File("src/pictures/ava.jpeg");

    @BeforeAll
    static void beforeAll() {
        Configuration.holdBrowserOpen = true;
        Configuration.browserSize = "1980x1000";

    }

    @Test
    void fillRegForm() {
        open("https://demoqa.com/automation-practice-form");
        zoom(0.8);

        $("#firstName").setValue(firstName);
        $("#lastName").setValue(lastName);
        $("#userEmail").setValue(userEmail);
        $(byText(gender)).click();
        $("#userNumber").setValue(userNumber);
        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-select").selectOptionContainingText("February");
        $(".react-datepicker__year-select").selectOptionContainingText("1994");
        $(".react-datepicker__day--009").click();

        $("#subjectsInput").setValue(subject1).pressEnter();
        $("#subjectsInput").setValue(subject2).pressEnter();
        $(byText("Reading")).click();
        $(byText("Music")).click();

        $("#uploadPicture").uploadFile(avatar);
        $("#currentAddress").setValue(currentAddress);

        $("#react-select-3-input").setValue(state).pressEnter();
        $("#react-select-4-input").setValue(city).pressEnter();

        $("#submit").click();

        $(".table-responsive").shouldHave(text(firstName + " " + lastName), text(userEmail),
                text(gender), text(userNumber), text(birthDate), text(subject1 + ", " + subject2),
                text(hobbies), text(currentAddress), text(state + " " + city), text("ava.jpeg"));
    }
}
