import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import v2.TestBase;

import static com.codeborne.selenide.Selenide.*;

public class SimpleTest extends TestBase {

    @BeforeClass
    public void start() {
        open("https://www.onetwotrip.com/ru/");
    }


    @Test(description = "Авторизация")
    public void authTest() {
        app.auth.loginAs(users.SIMPLE);
        app.header.checkOnUsername(users.SIMPLE.name);
    }

}
