package v2.applogic;

import org.testng.Assert;
import v2.form.HeaderForm;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class HeaderHelper {
    ApplicationManager manager;
    HeaderForm form = new HeaderForm();

    public HeaderHelper(ApplicationManager manager) {
        this.manager = manager;
    }

    public void clickOnLoginBtn() {
        form.loginBtn.click();
    }

    public void checkOnUsername(String expectName) {
        String userName = form.getLoggedUserName();
        Assert.assertEquals(userName, expectName);
    }

    public void checkUserNotLoggedIn() {
        String userName = form.getLoggedUserName();
        Assert.assertEquals(userName, "");
    }
}
