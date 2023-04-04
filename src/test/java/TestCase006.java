import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.List;

public class TestCase006 {
    @Test
    public void productsNumberTest() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://askomdch.com/");
        Thread.sleep(2000);
        WebElement element = driver.findElement(By.cssSelector("ul.products.columns-5"));
        Thread.sleep(2000);
        List<WebElement> products = element.findElements(By.tagName("li"));
        Assert.assertEquals(products.size(), 5);
        driver.quit();
    }
}
