import java.io.FileInputStream;
import java.util.Properties;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.List;

public class FindingElements {
    static void main(String[] args) throws Exception {
        Properties prop = new Properties();
        FileInputStream fis = new FileInputStream("config.properties");
        prop.load(fis);

        String username = prop.getProperty("username");
        String password = prop.getProperty("password");

        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();

        driver.get("https://the-internet.herokuapp.com");
//        driver.findElement(By.partialLinkText("JavaScript onload")).click();
//        Thread.sleep(1000);
//        driver.navigate().back();
        driver.findElement(By.linkText("Form Authentication")).click();
//        driver.findElement(By.id("username")).sendKeys(username);
//        driver.findElement(By.id("password")).sendKeys(password);
//        driver.findElement(By.name("username")).sendKeys(username);
//        driver.findElement(By.name("password")).sendKeys(password);
//        driver.findElement(By.tagName("button")).click();
//        driver.findElement(By.className("radius")).click();
//        driver.findElement(By.linkText("Sortable Data Tables")).click();
//        WebElement table = driver.findElement(By.id("table1"));             //Select Table and put it in a variable.
//        List<WebElement> tableRows = table.findElements(By.tagName("tr"));  //Select all the data which has tagName 'tr'
//        System.out.println("Total Row: "+tableRows.size());                 //Print how many data/row are there.
//        System.out.println("Headers are: "+tableRows.get(0).getText());     //Print what's written in Header.
//        System.out.println("Headers are: "+tableRows.get(1).getText());
//        System.out.println("Headers are: "+tableRows.get(2).getText());
//        System.out.println("Headers are: "+tableRows.get(3).getText());
//        System.out.println("Headers are: "+tableRows.get(4).getText());
//        driver.findElement(By.xpath("//a[@href='/login']")).click();
//        driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
//        driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
//        driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[1]/form/button")).click();
//        driver.findElement(By.xpath("//*[@id=\"content\"]/div/a")).click(); //Copied xpath from browser
        driver.findElement(By.cssSelector("input#username")).sendKeys(username);
        driver.findElement(By.cssSelector("input#password")).sendKeys(password);
        driver.findElement(By.cssSelector("button.radius")).click();

        Thread.sleep(2000);
        driver.quit();
    }
}
