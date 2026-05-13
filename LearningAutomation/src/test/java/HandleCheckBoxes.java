import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;
import java.util.List;

public class HandleCheckBoxes {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10L));


        driver.get("https://testautomationpractice.blogspot.com/");

        driver.manage().window().maximize();
//
//        WebElement checkbox = driver.findElement(By.xpath("//input[@id='sunday']"));
//        System.out.println("Checkbox Value before selection: " + checkbox.isSelected());
//
//        driver.findElement(By.xpath("//input[@id='sunday']")).click();
//
//        System.out.println("Checkbox Value after selection: " + checkbox.isSelected());


        //capturing all the check box

        List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@class='form-check-input' and @type ='checkbox']"));
        System.out.println("Number of checkboxes: " + checkboxes.size());


        //selecting all the checkboxes
    /*
        for (int i =0; i<=checkboxes.size();i++)
        {

            checkboxes.get(i).click();

        }
        */
        /*
     //select first 3 checkboxes

        for (int i = 0; i<3;i++)
        {
            checkboxes.get(i).click();
        }

        //select / unselect checkboxes

        Thread.sleep(5000)
        ;
        for (WebElement chkbox: checkboxes)
        {
            if (chkbox.isSelected())
            {
                chkbox.click(); //unselect
            }
            else
            {
                chkbox.click(); //select
            }
        }


        */



        String weekName ="Sunday";

        switch (weekName)
        {
            case "Sunday": driver.findElement(By.xpath("//input[@id='sunday']")).click();
            break;

            case "Monday": driver.findElement(By.xpath("//input[@id='monday']")).click();
            break;

            case "Tuesday": driver.findElement(By.xpath("//input[@id='tuesday']")).click();
            break;

            case "Wednesday" : driver.findElement(By.xpath("//input[@id='wednesday']")).click();
            break;

            case "Thrusday" : driver.findElement(By.xpath("//input[@id='thursday']")).click();
            break;

            case "Friday" : driver.findElement(By.xpath("//input[@id='friday']")).click();
            break;

            case "Saturday" : driver.findElement(By.xpath("//input[@id='saturday']")).click();
            break;

            default: System.out.println("Something went wrong");

        }





    }

}
