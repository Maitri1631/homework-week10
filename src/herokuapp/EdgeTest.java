package herokuapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class EdgeTest {
    public static void main(String[] args) {
        String baseurl="http://the-internet.herokuapp.com/login"; //Storing base url
        System.setProperty("webdriver.edge.driver","src/drivers/msedgedriver.exe"); //setting webdriver
        WebDriver driver= new EdgeDriver(); //creating object of  webdriver
        driver.get(baseurl);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); //timeout session
        String title = driver.getTitle(); // storing title
        System.out.println("Title of the page:     "+title); //print title in console
        String url=driver.getCurrentUrl(); //storing url
        System.out.println("Current Url:     "+url); //print url in console
        WebElement username= driver.findElement(By.id("username"));  // Storing username
        username.sendKeys("maitrypatel@gmail.com"); // sendkeys to username
        WebElement password= driver.findElement(By.id("password"));  // storing password
        password.sendKeys("12455565"); //sendkeys to password
        driver.findElement(By.className("radius")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); //timeout session
    }
}