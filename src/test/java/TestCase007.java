import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase007 {
    @Test
    public void colourTest_TC_007_23() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://askomdch.com/");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("a[href*='men']")).click();
        Thread.sleep(2000);
        Assert.assertEquals(driver.findElement(By.cssSelector("button[value='Search']")).
                getCssValue("background-color"), "rgba(49, 151, 214, 1)");
        driver.quit();
    }
}
