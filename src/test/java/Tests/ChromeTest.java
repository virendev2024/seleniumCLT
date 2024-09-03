package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeTest {
    @Test
    public void testChromeDriver() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        WebElement searchBox = driver.findElement(By.xpath("//textarea[@class=\"gLFyf\"]")); // also fixed the xpath
        searchBox.sendKeys("Selenium WebDriver");
        searchBox.submit();
        Thread.sleep(2000);
        System.out.println("Chrome Driver worked");
        driver.quit();
    }
}
