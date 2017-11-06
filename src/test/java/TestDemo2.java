import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestDemo2 {

    private final String url = "http://toolsqa.com/automation-practice-form/";

    @Test
    public void Demo2() {

        ChromeDriver driver = DriverFactory.getDriver();

        driver.get(url);

        WebElement checkbox = driver.findElementById("tool-2");
        checkbox.sendKeys(" ");

        driver.close();
    }
}
