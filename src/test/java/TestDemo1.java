import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestDemo1 {


    @Test
    public void Demo1() {

        ChromeDriver driver = DriverFactory.getDriver();

        driver.get("https://news.ycombinator.com/");

        String pageTitle = driver.getCurrentUrl();
        pageTitle.equalsIgnoreCase("Hacker News");

        driver.close();
    }

    @Test
    public void Exercise1_1() {

        ChromeDriver driver = DriverFactory.getDriver();

        driver.get("http://automationpractice.com/index.php");

        String pageTitle = driver.getTitle();
        pageTitle.equalsIgnoreCase("");

        driver.findElementByLinkText("T-shirts");

        String pageTitle2 = driver.getTitle();
        pageTitle2.equalsIgnoreCase("");

        driver.close();
    }

    @Test
    public void Exercise1_2() {

        ChromeDriver driver = DriverFactory.getDriver();

        driver.get("http://automationpractice.com/index.php");

        WebElement element = driver.findElementById("search_query_top");
        element.sendKeys("summer");

        driver.findElementByName("submit_search").click();

        WebElement result = driver.findElementByClassName("heading-counter");
        String message = result.getText();

        message.equalsIgnoreCase("");
    }
}
