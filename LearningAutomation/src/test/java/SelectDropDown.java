import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class SelectDropDown {

    public static void main(String[] args)
    {

        WebDriver driver=new ChromeDriver();

        driver.get("https://testautomationpractice.blogspot.com/");

        driver.manage().window().maximize();
        WebElement drpCountryEle =driver.findElement(By.xpath("//select[@id='country']"));
        Select drpCountry = new Select(drpCountryEle);

        //select option from the drop down

        //drpCountry.selectByVisibleText("Canada");

        //drpCountry.selectByValue("japan");

        //drpCountry.selectByIndex(1);

        //CAPTURE THE OPTION FROM TTHE DROPDOWN
        List <WebElement> options =drpCountry.getOptions();
        System.out.println("Number of options in Select : " + options.size());

        //printing the option
        for (WebElement option : options)
        {
            System.out.println(option.getText());
        }


        for(int i=0;i<options.size();i++)
        {
            System.out.println(options.get(i).getText()); //we cannot print web element directly so we used these

        }



    }
}
