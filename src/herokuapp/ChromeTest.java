package herokuapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class ChromeTest {
    public static void main(String[] args) {
        String baseurl="http://the-internet.herokuapp.com/login"; //Storing base url
        System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver.exe"); //setting webdriver
        WebDriver driver= new ChromeDriver(); //creating object of  webdriver
        driver.get(baseurl);
        driver.manage().window().maximize(); //maximize window
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
        //driver.quit();
    }
}
