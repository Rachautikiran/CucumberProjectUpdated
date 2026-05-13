package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.devtools.v142.input.model.DragData;
import utils.DriverFactory;

public class Hooks {

    @Before
    public void setUp(){
        DriverFactory.initDriver();
        DriverFactory.getDriver().get("https://automationexercise.com/");
    }
    @After
    public void tearDown(){
        DriverFactory.getDriver().quit();
    }
}
