package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class EdgeTest {
    @Test
    public void testEdgeDriver() throws InterruptedException {
        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.google.com");
        WebElement searchBox = driver.findElement(By.xpath("//textarea[@class=\"gLFyf\"]"));
        searchBox.sendKeys("Selenium WebDriver");
        searchBox.submit();
        Thread.sleep(2000);
        System.out.println("Edge Driver worked");
        driver.quit();
    }
}