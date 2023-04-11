package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeBrowserTest {

    public static void main(String[] args) {
       // String baseUrl = "https://www.saucedemo.com/";
        // Launch the browser
        WebDriver driver = new ChromeDriver();
        //open the URL into browser
        driver.get("https://www.saucedemo.com/");
        // maximise the browser
        driver.manage().window().maximize();
        //give Implicit wait to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        // Get the title of the page
        System.out.println("The Title: " + driver.getTitle());
        // Get the Current URL
        System.out.println("Current URL: " + driver.getCurrentUrl());
        //Get the page source
        System.out.println("Page Source: " + driver.getPageSource());
        // Find the username field and type the username
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        // Find the password field and type the password
        driver.findElement(By.name("password")).sendKeys("secret_sauce");

        // close the driver
        driver.close();







    }

}
