import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class DriverFactory {

    private DriverFactory() {
    }

    public static ChromeDriver getDriver() {
        return new ChromeDriver();
    }

}
