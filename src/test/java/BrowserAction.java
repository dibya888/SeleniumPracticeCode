import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class BrowserAction {
    WebDriver driver;

    @Test
    public void firstTest(){
        driver = new EdgeDriver();
        driver.get("https://google.com");
        navigation("https://linkedin.com");
        navigateBack();
        navigateForward();
        refresh();
    }

    public void navigation(String url){
        driver.navigate().to(url);
    }

    public void navigateBack(){
        driver.navigate().back();
    }

    public void navigateForward(){
        driver.navigate().forward();
    }

    public void refresh(){
        driver.navigate().refresh();
    }

    public void maximize(){
        driver.manage().window().maximize();
    }
}
