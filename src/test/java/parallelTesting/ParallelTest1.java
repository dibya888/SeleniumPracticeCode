package parallelTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class ParallelTest1 {
    ThreadLocal<WebDriver> driver = new ThreadLocal<>();


    @Test
    public void logoTest() throws InterruptedException {
        driver.set(new EdgeDriver());
        driver.get().get("https://opensource-demo.orangehrmlive.com/");
        Thread.sleep(5000);
        WebElement logo = driver.get().findElement(By.xpath("//div[@class='orangehrm-login-branding']"));
        Assert.assertTrue(logo.isDisplayed(), "Logo not displayed");
    }

    @Test
    public void homePageTitle() throws InterruptedException {
        driver.set(new EdgeDriver());
        driver.get().get("https://opensource-demo.orangehrmlive.com/");
        Thread.sleep(5000);
        String title = driver.get().getTitle();
        Assert.assertEquals(title, "OrangeHRM", "Title not matched");

    }

    @AfterMethod
    public void tearDown(){
        driver.get().quit();
    }
}
