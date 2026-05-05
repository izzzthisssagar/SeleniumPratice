import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class FirstTry {

    public static void main(String[] args) {

        //1)Launch web browser
        WebDriver driver = new ChromeDriver();

        //2)open url https://deemo.nopcommerce.com/
        driver.get("https://demo.nopcommerce.com/");


        //3) validate tittle should be "nopCommerce demo store. Home page title"

        String getTitle = driver.getTitle();
        System.out.println("Actual title: " + getTitle);
        String expectedTitle = "nopCommerce demo store. Home page title";
        if (expectedTitle.equals(getTitle)) {
            System.out.println("Test Passed");
        }
        else {
            System.out.println("Test Failed");
        }

        driver.quit();
    }


}
