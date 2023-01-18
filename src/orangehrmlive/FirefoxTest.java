package orangehrmlive;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class FirefoxTest {
    public static void main(String[] args) {
        String baseurl="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"; //Storing base url
        System.setProperty("webdriver.gecko.driver","src/drivers/geckodriver.exe"); //setting webdriver
        WebDriver driver= new FirefoxDriver(); //creating object of  webdriver
        driver.get(baseurl);
        driver.manage().window().maximize(); //maximize window
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); //timeout session
        String title = driver.getTitle(); // storing title
        System.out.println("Title of the page:     "+title); //print title in console
        String url=driver.getCurrentUrl(); //storing url
        System.out.println("Current Url:     "+url); //print url in console
        WebElement username=driver.findElement(By.name("username"));
        username.sendKeys("Admin");
        WebElement password =driver.findElement(By.name("password"));
        password.sendKeys("admin123");

    }
}
