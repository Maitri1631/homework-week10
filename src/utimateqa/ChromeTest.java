package utimateqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeTest {
    public static void main(String[] args) {
        String baseurl="https://courses.ultimateqa.com/users/sign_in"; //Storing base url
        System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver.exe"); //setting webdriver
        WebDriver driver= new ChromeDriver(); //creating object of  webdriver
        driver.get(baseurl);
        driver.manage().window().maximize(); //maximize window
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); //timeout session
        String title = driver.getTitle(); // storing title
        System.out.println("Title of the page:     "+title); //print title in console
        String url=driver.getCurrentUrl(); //storing url
        System.out.println("Current Url:     "+url); //print url in console
        driver.findElement(By.id("user[email]")).click();
        WebElement email=driver.findElement(By.id("user[email]")); //stroing emailfield
        email.sendKeys("maitrypatel168@gmail.com");//sendkeys to emailfield
        driver.findElement(By.id("user[password]")).click();
        WebElement password=driver.findElement(By.id("user[password]")); //Storing password
        password.sendKeys("Mona21631"); //sendkeys to password
        driver.close(); //closing  browser
    }
}
