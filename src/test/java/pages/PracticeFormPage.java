package pages;

import com.codeborne.selenide.SelenideElement;
import pages.components.CalendarComponent;
import ru.glonassmobile.PracticeForm;

import java.io.File;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static org.openqa.selenium.remote.tracing.EventAttribute.setValue;


public class PracticeFormPage {

 SelenideElement
         firstNameInput = $("#firstName"),
         lastNameInput = $("#lastName"),
         userEmail = $("#userEmail"),
         chooseGender = $("[for='gender-radio-2']"),
         userNumber = $("#userNumber"),
         subjectsInput = $("#subjectsInput"),
         uploadPicture = $("#uploadPicture"),
         currentAddress = $("#currentAddress"),
         state =  $("#state"),
         stateCityWrapper = $("#stateCity-wrapper"),
         city = $("#city"),
         submit = $("#submit");





    public CalendarComponent calendarComponent = new CalendarComponent();
    public File someFile = new File("src/test/resources/img/1.png");

    public PracticeFormPage OpenPage() {
        open("https://demoqa.com/automation-practice-form");

        return this;
    }
    public PracticeFormPage firstNameInput(String value) {

        firstNameInput.setValue(value);

        return this;
    }

   public PracticeFormPage typeLastName(String value) {

        lastNameInput.setValue(value);

        return this;
   }
   public  PracticeFormPage userEmail(String value) {
        userEmail.setValue(value);
       return this;
   }


    public PracticeFormPage clickOn(String value) {
        chooseGender.click();
        return this;
    }

    public PracticeFormPage number(String value) {
        userNumber.setValue(value);
        return this;
    }

    public PracticeFormPage subjectsInput(String value) {
        subjectsInput.setValue(value).pressEnter();
        return this;
    }
    public  PracticeFormPage downloadFile(File value) {
        uploadPicture.uploadFile(someFile);
        return this;
    }

    public PracticeFormPage currentAddress(String value) {
        currentAddress.setValue(value);
        return this;

    }

    public PracticeFormPage stateAndCity() {
        state.scrollTo().click();
        stateCityWrapper.$(byText("NCR")).click();
        city.click();
        stateCityWrapper.$(byText("Noida")).click();
        return this;

    }

    public PracticeFormPage submit() {
        submit.click();
        return this;
    }

}
