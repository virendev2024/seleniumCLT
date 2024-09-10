package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeTest {
    @Test
    public void testChromeDriver() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        System.setProperty("webdriver.chrome.verboseLogging", "true");
        options.addArguments("window-size=1920,1200");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.google.com");
        WebElement searchBox = driver.findElement(By.xpath("//textarea[@class=\"gLFyf\"]")); // also fixed the xpath
        searchBox.sendKeys("Selenium WebDriver");
        searchBox.submit();
        Thread.sleep(2000);
        System.out.println("Chrome Driver worked");
        driver.quit();
    }
}
