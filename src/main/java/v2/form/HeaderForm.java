package v2.form;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class HeaderForm {

    public SelenideElement loginBtn = $("[data-locator*='profileLogin']");

    public String getLoggedUserName() {

        return  $("[data-locator='profile-name']").shouldBe(visible).getText();
    }
}
