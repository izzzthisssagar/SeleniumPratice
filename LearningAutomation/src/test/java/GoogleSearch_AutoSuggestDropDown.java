import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;
import java.util.List;

public class GoogleSearch_AutoSuggestDropDown {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.google.com");

        driver.findElement(By.name("q")).sendKeys("selenium");

        Thread.sleep(5000);
        List<WebElement> elements = driver.findElements(By.xpath("//ul[@role=\"listbox\"]//li//span"));

        System.out.println(elements.size());

        for(WebElement element : elements)
            {
                System.out.println(element.getText());
            }



    }
}
