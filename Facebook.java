package seleniumassignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	public static void main(String[] args) {
		// set path
		WebDriverManager.chromedriver().setup();
		
		//load URL
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//Maximize the window
        driver.manage().window().maximize();
        
        //create account
        driver.findElement(By.linkText("Create New Account")).click();
        //enter first name
        driver.findElement(By.name("firstname")).sendKeys("priyanka");
        //enter last name
        driver.findElement(By.name("lastname")).sendKeys("vinothkumar");
        //mobile number
        driver.findElement(By.name("reg_email__")).sendKeys("9443987969");
        //password
        driver.findElement(By.id("password_step_input")).sendKeys("Priyanka");
        
       //select DOB
        WebElement Day = driver.findElement(By.id("day"));
        Select tool =new Select(Day);
        tool.selectByVisibleText("3");
        
        WebElement Month = driver.findElement(By.id("month"));
        Select tool1=new Select(Month);
        tool1.selectByIndex(5);
        
        WebElement Year = driver.findElement(By.id("year"));
        Select tool3=new Select(Year);
        tool3.selectByValue("1995");
        
        driver.findElement(By.name("sex")).click();
        
          
        
        
        
	}

}
