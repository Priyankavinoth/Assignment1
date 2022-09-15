package seleniumassignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
    WebDriverManager.chromedriver().setup();
    
  //load URL
    ChromeDriver driver=new ChromeDriver();
    driver.get("http://leaftaps.com/opentaps/control/main");
    //username
    driver.findElement(By.id("username")).sendKeys("demosalesmanager");
    
    //password
    driver.findElement(By.id("password")).sendKeys("crmsfa");
    
    //login
    driver.findElement(By.className("decorativeSubmit")).click();
    
    //click CRM
    driver.findElement(By.linkText("CRM/SFA")).click();
    
    //click lead
    driver.findElement(By.linkText("Leads")).click();
    
    //find leads
    driver.findElement(By.linkText("Find Leads")).click();
    
    //Enter first name
    driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("priyanka");
    
    //	Click Find leads button
    driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
    
    Thread.sleep(3000);
    
	//Click on first resulting lead
    driver.findElement(By.linkText("10693")).click();
    
	//Verify title of the page
    String title1=driver.getTitle();
    System.out.println(title1);
    
	 //Click Edit
    driver.findElement(By.linkText("Edit")).click();
    
	 //Change the company name
    driver.findElement(By.id("updateLeadForm_companyName")).clear();
    driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("innova");
    
    
	 //Click Update
    driver.findElement(By.className("smallSubmit")).click();
    
    driver.close();
	}

}
