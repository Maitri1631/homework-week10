package saucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Multibrowersing {

    static String browser = "Chrome";
    static String baseurl = "https://www.saucedemo.com/";
    static WebDriver driver;

    public static void main(String[] args) {
        if (browser.equalsIgnoreCase("Chrome")) {
            System.setProperty("webdriver.chrome.driver", "src/drivers/chromedriver.exe");
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("Firefox")) {
            System.setProperty("webdriver.chrome.driver", "src/drivers/geckodriver.exe");
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("edge")) {
            System.setProperty("webdriver.chrome.driver", "src/drivers/msedgedriver.exe");
            driver = new ChromeDriver();
        } else {
            System.out.println("not browser");
        }

        driver.get(baseurl);
        driver.manage().window().maximize(); //maximize window
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); //timeout session
        String title = driver.getTitle(); // storing title
        System.out.println("Title of the page:     " + title); //print title in console
        String url = driver.getCurrentUrl(); //storing url
        System.out.println("Current Url:     " + url); //print url in console

        String source=driver.getPageSource();
        System.out.println("Page source:  "+source);
        WebElement username=driver.findElement(By.id("user-name")); //stroing emailfield
        username.sendKeys("maitrypatel168@gmail.com");//sendkeys to emailfield
        WebElement password=driver.findElement(By.id("password")); //Storing password
        password.sendKeys("Mona21631"); //sendkeys to password
        driver.close(); //closing  browser


        //xpath login = //div[@class='header-links-wrapper']//a[@class='ico-login']
    }
}
