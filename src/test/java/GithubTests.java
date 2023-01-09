import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class GithubTests {
    @Test
    void findJunit5Examples() {
        //Open page with selenide in Github
        open("https://github.com/selenide/selenide");
        //Go to Wiki of the proj.
        $$(".js-sidenav-container-pjax").findBy(text("Wiki")).click();
        //Check that in the list of pages SoftAssertions page is present
        $(".js-wiki-more-pages-link").click();
        $("#wiki-pages-box").shouldHave(text("SoftAssertions"));
        //Open SoftAssertions
        $("#wiki-pages-box").$(byText("SoftAssertions")).click();
        //Check that inside we have JUnit5 code examples
        $(".markdown-body").shouldHave(text("Using JUnit5 extend test class"));
    }

    @Test
    void openSolutions() {
        //Open github.com
        open("https://github.com/");
        //Choose Solutions -> Enterprise
        $(byText("Solutions")).hover();
        $(byText("Enterprise")).click();
        //Check that header is "Build like the best"
        $(".gutter-spacious").shouldHave(text("Build like the best"));
    }
}
