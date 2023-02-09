package pages.components;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class CalendarComponent {
    private SelenideElement monthSelector = $(".react-datepicker__month-select");
    private SelenideElement yearSelector = $(".react-datepicker__year-select");

    public void setDate(String day, String month, String year) {
        monthSelector.selectOptionContainingText(month);
        yearSelector.selectOptionContainingText(year);
        $(".react-datepicker__day--0" + day +
                ":not(.react-datepicker__day-outside-month)").click();
    }
}
