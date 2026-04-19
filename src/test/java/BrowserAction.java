import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
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
//        navigateBack();
//        navigateForward();
//        refresh();
//        maximize();
//        minimize();
        setPosition();
        setDimension();
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
    public void minimize(){
        driver.manage().window().minimize();
    }
    public void setPosition(){
        driver.manage().window().setPosition(new Point(100,100));
    }
    public void setDimension(){
        Dimension dimension = new Dimension(412,915);
        driver.manage().window().setSize(dimension);
    }
}
