import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CssLocators {

    public static void main(String[] args)
    {

        WebDriver driver = new ChromeDriver();
        driver.get("https://daraz.com.np");
        driver.manage().window().maximize();

        //tag and id
        //driver.findElement(By.cssSelector("input#q")).sendKeys("earbuds");

        //tag and classname
        //driver.findElement(By.cssSelector(".search-box__input--O34g")).sendKeys("Daraz");

        //tag and attribute
        //driver.findElement(By.cssSelector("[placeholder='Search in Daraz']")).sendKeys("Daraz");

        //tag class and attribuute
        //driver.findElement(By.cssSelector(".search-box__input--O34g[placeholder='Search in Daraz']")).sendKeys("Daraz");





    }
}
