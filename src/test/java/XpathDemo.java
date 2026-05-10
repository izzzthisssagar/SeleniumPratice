import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo {

    public static void main(String[] args)
    {


        WebDriver driver=new ChromeDriver();

        //driver.navigate().to("https://synthbitgroup.com");

        driver.get("http://daraz.com.np");

        driver.manage().window().maximize();


        //xpath with single attribute
        //driver.findElement(By.xpath(" //input[@id='q']")).sendKeys("Headphones");

        //xpath with multiple attribute
       // driver.findElement(By.xpath("//input[@id='q'][@placeholder='Search in Daraz']"));

       // driver.findElement(By.xpath("//input[@id='q']")).sendKeys(Keys.ENTER);

        //xpath with and/or attribute
        //driver.findElement(By.xpath("//input[@id='q' and @placeholder='Search in Daraz']")).sendKeys("Daraz");

        //driver.findElement(By.xpath("//input[@id='q' or @placeholder='Search in Daraz']")).sendKeys("Daraz");

        //xpath with inner text
        //driver.findElement(By.xpath("//*[text()= 'Become a Seller']")).click();
//
//        Boolean isDisplayed =driver.findElement(By.xpath("//div[text()='अब बिक्रीमा']")).isDisplayed();
//        System.out.println(isDisplayed);

        //xpath with contain method
//        driver.findElement(By.xpath("//input[contains(@placeholder,'Search')]")).sendKeys("Headphone");
//        driver.findElement(By.xpath("//input[contains(@placeholder,'Search')]")).sendKeys(Keys.ENTER);

        //xpath with starts-with method
//                driver.findElement(By.xpath("//input[starts-with(@placeholder,'Search')]")).sendKeys("Headphone");
//        driver.findElement(By.xpath("//input[starts-with(@placeholder,'Search')]")).sendKeys(Keys.ENTER);


        //chained xpath

        boolean isDispalyed =driver.findElement(By.xpath("//div[@class='common-img fs-card-img img-w100p']/picture/img")).isDisplayed();
        if(isDispalyed==true)
        {
            System.out.println("Dispalyed");
        }
        else {
            System.out.println("Not Dispalyed");
        }








    }
}
