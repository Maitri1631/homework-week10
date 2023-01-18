package orangehrmlive;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ChromeTest {
    public static void main(String[] args) {
        String baseurl="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"; //Storing base url
        System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver.exe"); //setting webdriver
        WebDriver driver= new ChromeDriver(); //creating object of  webdriver
        driver.get(baseurl);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.titleContains("OrangeHRM"));
        driver.manage().window().maximize(); //maximize window
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); //timeout session
        String title = driver.getTitle(); // storing title
        System.out.println("Title of the page:     "+title); //print title in console
        String url=driver.getCurrentUrl(); //storing url
        System.out.println("Current Url:     "+url); //print url in console
        wait.until(ExpectedConditions.elementToBeClickable(By.name("username")));
        driver.findElement(By.name("username")).click();
        WebElement username=driver.findElement(By.name("username"));
        username.sendKeys("Admin");
        wait.until(ExpectedConditions.elementToBeClickable(By.name("password")));
        driver.findElement(By.name("password")).click();
        WebElement password =driver.findElement(By.name("password"));
        password.sendKeys("admin123");
        driver.quit(); //closing  browser
    }
}
