package v2;

import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import v2.applogic.ApplicationManager;
import v2.model.Users;

public class TestBase {

    public Users users = new Users();

    public ApplicationManager app;

    @BeforeClass
    public void init() {
        app = new ApplicationManager();
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") +"/src/main/resources/chromedriver");
        WebDriverRunner.setWebDriver(new ChromeDriver());
        WebDriverRunner.getWebDriver().manage().window().maximize();
    }


    @AfterClass
    public void stop() {
        WebDriverRunner.closeWebDriver();
    }
}
