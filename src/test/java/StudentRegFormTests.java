import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.Arrays;
import java.util.List;


public class StudentRegFormTests extends TestBase {

    String firstName = "Ivan";
    String lastName = "Ivanov";
    String userEmail = "ivan@mail.ru";
    String userNumber = "9009999999";
    String gender = "Male";
    String birthDay = "09";
    String birthMonth = "February";
    String birthYear = "1994";
    String birthDate = "09 February,1994";
    String state = "NCR";
    String city = "Delhi";
    String currentAddress = "Japan, Tokyo, Hokkaido prefecture";

    List<String> subjects = Arrays.asList("Biology", "Maths");
    List<String> hobbies = Arrays.asList("Reading", "Music");

    File avatar = new File("src/test/resources/pictures/ava.jpeg");

    @Test
    void fillRegFormTest() {

        registrationPage.openPage()
                .setFirstName(firstName)
                .setLastName(lastName)
                .setUserEmail(userEmail)
                .setGender(gender)
                .setUserNumber(userNumber)
                .setBirthDate(birthDay, birthMonth, birthYear)
                .setSubjects(subjects)
                .setHobbies(hobbies)
                .setAvatar(avatar)
                .setAddress(currentAddress)
                .setState(state)
                .setCity(city)
                .submitForm();

        registrationPage.verifyTableAppears()
                .verifyTableIsFilledCorrect("Student Name", firstName + " " + lastName)
                .verifyTableIsFilledCorrect("Student Email", userEmail)
                .verifyTableIsFilledCorrect("Gender", gender)
                .verifyTableIsFilledCorrect("Mobile", userNumber)
                .verifyTableIsFilledCorrect("Date of Birth", birthDate)
                .verifyTableIsFilledCorrect("Subjects", subjects.get(0) + ", " + subjects.get(1))
                .verifyTableIsFilledCorrect("Hobbies", hobbies.get(0) + ", " + hobbies.get(1))
                .verifyTableIsFilledCorrect("Address", currentAddress)
                .verifyTableIsFilledCorrect("Picture", avatar.getName())
                .verifyTableIsFilledCorrect("State and City", state + " " + city);

    }
}
