package saucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class EdgeTest {
    public static void main(String[] args) {
        String baseurl="https://www.saucedemo.com/"; //Storing base url
        System.setProperty("webdriver.edge.driver","src/drivers/msedgedriver.exe"); //setting webdriver
        WebDriver driver= new EdgeDriver(); //creating object of  webdriver
        driver.get(baseurl);
        driver.manage().window().maximize(); //maximize window
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); //timeout session
        String title = driver.getTitle(); // storing title
        System.out.println("Title of the page:     "+title); //print title in console
        String url=driver.getCurrentUrl(); //storing url
        System.out.println("Current Url:     "+url); //print url in console
        WebElement username=driver.findElement(By.id("user-name")); //stroing emailfield
        username.sendKeys("maitrypatel168@gmail.com");//sendkeys to emailfield
        WebElement password=driver.findElement(By.id("password")); //Storing password
        password.sendKeys("Mona21631"); //sendkeys to password
        //driver.close(); //closing  browser
    }
}
