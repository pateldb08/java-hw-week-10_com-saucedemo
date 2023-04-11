package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class MultiBrowserTest {
    static String baseUrl = "https://www.saucedemo.com/";
    static WebDriver driver;
    static String browser = "Chrome";

    public static void main(String[] args) {
        if (browser.equalsIgnoreCase("Chrome")){
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("Firefox")) {
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();
        }else{
            System.out.println("Wrong Browser name");
        }
        // Open the URL into browser
        driver.get("https://www.saucedemo.com/");
        // Maximise the browser
        driver.manage().window().maximize();
        // Give Implicit wait to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        // Get the Title of the browser
        System.out.println("The Title : " + driver.getTitle());
        // Get the Current URL
        System.out.println("Current URL: " + driver.getCurrentUrl());
        //Get the Page Source
        System.out.println("Page Source: " + driver.getPageSource());
        //Find the Username field and tupe the username
        driver.findElement(By.id("user-name")).sendKeys("abc123");
        // Find the Password Field and type the password
        driver.findElement(By.id("password")).sendKeys("xyz");

        // close the driver
        driver.close();




    }


}
