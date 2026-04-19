import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import java.util.Set;

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
        maximize();
//        minimize();
//        setPosition();
//        setDimension();
//        fullscreen();
//        getCurrentURL();
//        getPageTitle();
//        getPageSource();
//        getWindowHandle();
        driver.switchTo().newWindow(WindowType.TAB);
//        getWindowHandle();
        getWindowHandles();
    }

    public void navigation(String url){
        driver.navigate().to(url);
    }
//
//    public void navigateBack(){
//        driver.navigate().back();
//    }
//
//    public void navigateForward(){
//        driver.navigate().forward();
//    }
//
//    public void refresh(){
//        driver.navigate().refresh();
//    }
//
    public void maximize(){
        driver.manage().window().maximize();
    }
//    public void minimize(){
//        driver.manage().window().minimize();
//    }
//    public void setPosition(){
//        driver.manage().window().setPosition(new Point(100,100));
//    }
//    public void setDimension(){
//        Dimension dimension = new Dimension(412,915);
//        driver.manage().window().setSize(dimension);
//    }
//    public void fullscreen(){
//        driver.manage().window().fullscreen();
//    }
//    public void getCurrentURL(){
//        String URL = driver.getCurrentUrl();
//        System.out.println("Current Site is: "+URL);
//    }
//    public void getPageTitle(){
//        String title = driver.getTitle();
//        System.out.println("Current Site's Title is: "+title);
//    }
//    public void getPageSource(){
//        String pageSource = driver.getPageSource();
//        System.out.println("Current Page's Source Code is: "+pageSource);
//    }
//    public void getWindowHandle(){
//        String windowHandle = driver.getWindowHandle();
//        System.out.println("The Window Handle is: "+windowHandle);
//    }
    public void getWindowHandles(){
        Set<String> windowHandles = driver.getWindowHandles();
        System.out.println("The window Handle IDs are: "+windowHandles);
    }
}
