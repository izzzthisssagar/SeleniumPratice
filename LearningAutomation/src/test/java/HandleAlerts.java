import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlerts {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver=new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        driver.manage().window().maximize();
        /*
        //Normal alert box with ok button
        driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();

        Thread.sleep(5000);
        Alert myAlert=driver.switchTo().alert();

        myAlert.accept();
        */

        /*
        //Confirmation alert box with ok and cancel button

        driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();

        driver.switchTo().alert().accept(); //close alert window using ok button

      //  driver.switchTo().alert().dismiss(); //close alert window using cancel button

    */

        //prompt alert

        driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();

        Thread.sleep(2000);
        Alert myAlert =driver.switchTo().alert();

        myAlert.getText();
        System.out.println("Alert text: " + myAlert.getText());
        myAlert.sendKeys("Hello");
        myAlert.accept();


        String result = driver.findElement(By.xpath("//p[@id='result']")).getText();

        if(result.contains("Sagar"))
        {
            System.out.println("Test Passed");
        }
        else
        {
            System.out.println("Test Failed");
        }
        








    }
}
