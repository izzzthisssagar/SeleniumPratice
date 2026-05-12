import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Driver;

public class NavigationalCommands {
    public static void main(String[] args) throws MalformedURLException {
        WebDriver driver = new ChromeDriver();

        //driver.get("http://daraz.com.np");
        // driver.navigate().to("http://daraz.com.np");

        driver.navigate().to("http://daraz.com.np");
        driver.navigate().to("https://www.synthbitgroup.com/");
        driver.manage().window().maximize();

        driver.navigate().back(); //back to daraz
        System.out.println(driver.getCurrentUrl());

        driver.navigate().forward();
        System.out.println(driver.getCurrentUrl());//goes to synthbit

        driver.navigate().refresh();

//        URL myUrl = new URL("http://daraz.com.np");
//        driver.navigate().to(myUrl);


    }
}
