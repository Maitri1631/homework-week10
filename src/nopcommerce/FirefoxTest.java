package nopcommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class FirefoxTest {
    public static void main(String[] args) {
        String baseurl="https://demo.nopcommerce.com/"; //Storing base url
        System.setProperty("webdriver.gecko.driver","src/drivers/geckodriver.exe"); //setting webdriver
        WebDriver driver= new ChromeDriver(); //creating object of  webdriver
        driver.get(baseurl);
        driver.manage().window().maximize(); //maximize window
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); //timeout session
        String title = driver.getTitle(); // storing title
        System.out.println("Title of the page:     "+title); //print title in console
        String url=driver.getCurrentUrl(); //storing url
        System.out.println("Current Url:     "+url); //print url in console
        driver.findElement(By.className("ico-login")).click();
        WebElement emailfield= driver.findElement(By.id("Email"));
        emailfield.sendKeys("maitrypatel168@gmail.com");
        WebElement password = driver.findElement(By.id("Password")); //Storing password
        password.sendKeys("Mona21631"); //sendkeys to password
        driver.quit();
    }
}
