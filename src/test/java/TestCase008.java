import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase008 {
    @Test
    public void findMoreButtonTest_TC_008_23() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://askomdch.com/");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("div.wp-block-button.is-style-fill")).click();
        Thread.sleep(2000);
        Assert.assertEquals(driver.getTitle(), "Contact Us – AskOmDch");
        driver.quit();
    }
}
