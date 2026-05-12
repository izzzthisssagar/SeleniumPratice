import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class HandleBrowserWindows {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10L));


        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();


        WebElement nextlink = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")));
        driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();

        Set<String> allWindowsIds = driver.getWindowHandles();

        //Approach1
        List<String> allWindowsIdsList = new ArrayList<>(allWindowsIds);

        String parentID = allWindowsIdsList.get(0);
        String childId = allWindowsIdsList.get(1);

        //switch to child window
        driver.switchTo().window(childId);
        System.out.println("Current Window ID: " + driver.getWindowHandle());
        System.out.println(driver.getTitle());

        //switch to parent window
        driver.switchTo().window(parentID);
        System.out.println("Current Window ID: " + driver.getWindowHandle());
        System.out.println(driver.getTitle());









    }
}
