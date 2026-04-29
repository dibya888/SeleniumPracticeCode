package parallelTesting;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import java.io.FileInputStream;
import java.util.Properties;

public class ParallelTest2 {
    WebDriver driver;
    String username;
    String password;
    @BeforeMethod
    public void setup() throws Exception {
        Properties prop = new Properties();
        FileInputStream fis = new FileInputStream("config.properties");
        prop.load(fis);

        username = prop.getProperty("un");
        password = prop.getProperty("pwd");
    }

    @Test
    public void LoginTest() throws InterruptedException {
        driver = new EdgeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/");
        Thread.sleep(5000);
        driver.findElement(By.name("username")).sendKeys(username);
        driver.findElement(By.name("password")).sendKeys(password);
        driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
        Thread.sleep(5000);
        Assert.assertEquals(driver.getTitle(),"OrangeHRM","Title Mismatch");
    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
