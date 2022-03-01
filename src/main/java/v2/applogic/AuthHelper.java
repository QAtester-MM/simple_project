package v2.applogic;

import v2.form.AuthForm;
import v2.model.User;

public class AuthHelper {

    ApplicationManager manager;
    AuthForm form = new AuthForm();

    public AuthHelper(ApplicationManager manager) {
        this.manager = manager;
    }

    public void loginAs(User user) {
        manager.header.clickOnLoginBtn();
        form.setLogin(user.login)
                .setPassword(user.password)
                .clickOnSubmitBtn();
    }

    public void brokenLogin() {

    }
}
