import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class BootstrapDropdownDemo {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Navigate to W3Schools Bootstrap dropdown demo
        driver.get("https://www.w3schools.com/bootstrap4/bootstrap_dropdowns.asp");

        // Locate dropdown toggle (first example on page)
        WebElement dropdownToggle = driver.findElement(By.xpath("//button[contains(text(),'Dropdown button')]"));

        // Click to open dropdown
        dropdownToggle.click();

        // Capture all dropdown options
        List<WebElement> options = driver.findElements(By.xpath("//div[@class='dropdown-menu show']//a"));

        // Print all options
        System.out.println("Available options:");
        for (WebElement option : options) {
            System.out.println(option.getText());
        }

        // Select a specific option (e.g., "Link 1")
        for (WebElement option : options) {
            if (option.getText().equalsIgnoreCase("Link 1")) {
                option.click();
                break;
            }
        }

        driver.quit();
    }
}
