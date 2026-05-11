import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalMethods {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

//        driver.get("https://www.saucedemo.com"); //its for isDisplayed and isEnabled method

        driver.get("https://qaplayground.com/practice/forms");
        driver.manage().window().maximize();




        //isDisplayed()
//       WebElement logo = driver.findElement(By.xpath("//div[@class='login_logo']"));
//       System.out.println("Display status of logo:"+logo.isDisplayed());

//        boolean status = driver.findElement(By.xpath("//div[@class='login_logo']")).isDisplayed();
//        System.out.println(status);



        //isEnabled
//         boolean status  = driver.findElement(By.xpath("//input[@placeholder='Name']")).isEnabled();
//         System.out.println(status);



        //isSelected
               WebElement male_rd = driver.findElement(By.xpath("//input[@id='gender-male']"));

               WebElement female_rd = driver.findElement(By.xpath("//input[@id='gender-female']"));

               System.out.println("Before selection .............");
               System.out.println(male_rd.isSelected());
               System.out.println(male_rd.isSelected());

               System.out.println("After selection ...............");

               male_rd.click();

               System.out.println(female_rd.isSelected());
               System.out.println(male_rd.isSelected());





    }
}
