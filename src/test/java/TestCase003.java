import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase003 {
    @Test
    public void discountTest() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://askomdch.com");
        Thread.sleep(2000);
        Assert.assertEquals(driver.findElement(By.
                cssSelector("h3.has-text-align-center.has-white-color.has-text-color.has-medium-font-size")).
                getText(), "25% OFF On all products");
        driver.quit();
    }
}
