import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase002 {
    @Test
    public void currencyTest() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://askomdch.com");
        Thread.sleep(2000);
        Assert.assertEquals(driver.findElement(By.cssSelector("span.woocommerce-Price-currencySymbol")).getText(), "$");
        driver.quit();
    }
}
