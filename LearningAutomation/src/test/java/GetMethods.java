import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class GetMethods {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        //open the url onn the browser
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        driver.manage().window().maximize();

        Thread.sleep(5000);

        //returns title of the  page
        System.out.println(driver.getTitle());

        //return the source code of the page
        //System.out.println(driver.getPageSource());

        //returns url of the page
        System.out.println(driver.getCurrentUrl());

        //return the id of the single browser window
        String windowId = driver.getWindowHandle();
        System.out.println("Current Window Id: " + windowId);

        //return id's of multiple browser window
        driver.findElement(By.linkText("OrangeHRM, Inc")).click();
        Set<String> allWindowHandles = driver.getWindowHandles();
        System.out.println("Current Window handles: " + allWindowHandles);


    }
}
