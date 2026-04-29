import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AssertionsExample {
    WebDriver driver;

    @BeforeClass
    public void setup() {
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/");
    }

    @Test (priority = 1)
    public void logoTest() throws InterruptedException {
        Thread.sleep(2000);
        WebElement logo = driver.findElement(By.xpath("//img[@alt='company-branding']"));
        Assert.assertTrue(logo.isDisplayed(), "Logo not displayed on the page");
        Assert.assertFalse(logo.isDisplayed(), "Logo should not be displayed");

    }

    @Test (priority = 2)
    public void homePageTitle() {
        String title = driver.getTitle();
        Assert.assertEquals(title,"OrangeHRM123", "Title is not matched");
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }


}
