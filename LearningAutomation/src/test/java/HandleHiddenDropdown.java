import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;
import java.util.List;

public class HandleHiddenDropdown {
    public static void main(String[] args)
    {
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php");

        driver.manage().window().maximize();


        driver.findElement(By.name("username")).sendKeys("Admin");
        driver.findElement(By.name("password")).sendKeys("admin123");
        driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();

        driver.findElement(By.xpath("//a[normalize-space()='PIM']")).click();

        driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[6]/div[1]/div[2]/div[1]/div[1]")).click();


        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

     List <WebElement> options =driver.findElements(By.xpath("//div[@role='listbox']//span"));
     System.out.println(options.size());
     for (WebElement option : options)
        {
            System.out.println(option.getText());
        }

     driver.findElement(By.xpath("//span[normalize-space()='Automaton Tester']")).click();



    }
}
