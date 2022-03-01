package v2.form;

import com.codeborne.selenide.SelenideElement;
import org.w3c.dom.html.HTMLInputElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class AuthForm {

    public SelenideElement submitBtn = $("[data-locator='Button SigninForm--submit']");

    public AuthForm setLogin(String login) {
        $("[data-locator='SigninForm--email']").shouldBe(visible).setValue(login);
        return this;
    }

    public AuthForm setPassword(String password) {
        $("[data-locator='SigninForm--pwd']").shouldBe(visible).setValue(password);
        return this;
    }

    public AuthForm clickOnSubmitBtn() {
        submitBtn.click();
        return this;
    }
}
