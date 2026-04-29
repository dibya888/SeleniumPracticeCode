import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG {
    WebDriver driver;
    @BeforeTest
    public void prepare(){
        WebDriverManager.edgedriver().setup();
        driver = new EdgeDriver();
        driver.manage().window().maximize();
    }

    @AfterTest
    public void tearDown(){
        driver.quit();
    }


    @Test (priority = 1)
    public void openWebsite() throws InterruptedException {
        System.out.println("Let's open the Website.");
        driver.navigate().to("https://google.com");
        pause();
    }
    @Test (priority = 2)
    public void signUp(){
        System.out.println("Signing Up");
    }
    @Test (priority = 3)
    public void logIn(){
        System.out.println("Logging In");
    }
    @Test (priority = 4)
    public void addToCart(){
        System.out.println("Add items to the cart");
    }
    @Test (priority = 5)
    public void logOut(){
        System.out.println("Logging Out");
    }
    @Test (priority = 6)
    public void closeTheBrowser(){
        System.out.println("Closing Browser");
    }
    public void pause() throws InterruptedException {
        Thread.sleep(2000);
    }
}
