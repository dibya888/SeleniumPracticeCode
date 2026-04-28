import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Properties;

public class FindingElementTestNG {
    WebDriver driver;
    String username;
    String password;

    @BeforeMethod
    public void setup() throws Exception {
        Properties prop = new Properties();
        FileInputStream fis = new FileInputStream("config.properties");
        prop.load(fis);

        username = prop.getProperty("username");
        password = prop.getProperty("password");

        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com");
    }

    @Test
    public void findElement() throws InterruptedException {
        aPage();
        pause();
        back();
        table();
        pause();
        back();
        form();
        pause();
    }

    @AfterMethod
    public void exit() {
        driver.quit();
    }


    public  void maximize(){
        driver.manage().window().maximize();
    }


    public void form(){
        driver.findElement(By.linkText("Form Authentication")).click();
        driver.findElement(By.id("username")).sendKeys(username);
        driver.findElement(By.name("password")).sendKeys(password);
        driver.findElement(By.tagName("button")).click();
        driver.findElement(By.className("radius")).click();
    }

    public void aPage() {
        driver.findElement(By.partialLinkText("JavaScript onload")).click();
    }

    public void back(){
        driver.navigate().back();
    }
    public void table(){
        driver.findElement(By.linkText("Sortable Data Tables")).click();
        WebElement table = driver.findElement(By.id("table1"));
        List<WebElement> tableRows = table.findElements(By.tagName("tr"));
        System.out.println("Total Row: "+tableRows.size());
        System.out.println("Headers are: "+tableRows.get(0).getText());
        System.out.println("Contents of 1st Rows are: "+tableRows.get(1).getText());
        System.out.println("Contents of 2nd Rows are: "+tableRows.get(2).getText());
        System.out.println("Contents of 3rd Rows are: "+tableRows.get(3).getText());
        System.out.println("Contents of 4th Rows are: "+tableRows.get(4).getText());
    }

    public void pause() throws InterruptedException {
        Thread.sleep(2000);
    }
}
