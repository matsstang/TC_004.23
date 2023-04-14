import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PetroMatsiuraGoogleTest extends PetroMatsiuraBaseTest {
    @Test
    public void testGoogleStore() throws InterruptedException {
        getDriver().get("https://www.google.com/");
        getDriver().findElement(By.linkText("Store")).click();
        getDriver().navigate().refresh();
        Thread.sleep(5000);

        Assert.assertEquals(getDriver().getTitle(), "Google Store for Google Made Devices & Accessories");
    }

    @Test
    public void testGoogleApps() throws InterruptedException {
        getDriver().get("https://www.google.com/");
        String [] result = {
                "Google Account",
                "Google",
                "Google Maps",
                "YouTube",
                "Android Apps on Google Play",
                "Google News",
                "Gmail",
                "Google Meet: Online Video Meetings and Calls | Google Workspace"
        };
        for (int i = 1; i <= result.length; i++) {
            getDriver().navigate().refresh();
            getDriver().findElement(By.cssSelector("a[aria-label='Google apps']")).click();
            getDriver().switchTo().frame("app").findElement(By.xpath("//div[1]/ul/li[" + i + "]")).click();
            Thread.sleep(5000);

            Assert.assertEquals(getDriver().getTitle(), "" + result[i - 1] + "");

            getDriver().navigate().back();
        }
    }
}
