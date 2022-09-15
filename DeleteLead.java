package seleniumassignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/login");
		
	    //Enter the username
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		
		//	Enter the password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		//	Click Login
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//Click crm/sfa link
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		//Click Leads link
		driver.findElement(By.linkText("Leads")).click();
		
		//Click Find leads
		 driver.findElement(By.linkText("Find Leads")).click();
		
		//Click on Phone
		 driver.findElement(By.linkText("Phone")).click();
		driver.findElement(By.name("phoneCountryCode")).clear();
		
		//Enter phone number
		driver.findElement(By.name("phoneCountryCode")).sendKeys("91");
		driver.findElement(By.name("phoneNumber")).sendKeys("9003880073");
		
		
		//Click find leads button
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		
		//Capture lead ID of First Resulting lead
		driver.findElement(By.xpath("//a[text()='10853']"));
		
		//Click First Resulting lead
		driver.findElement(By.xpath("//a[text()='10853']")).click();
		
		//Click Delete
		driver.findElement(By.xpath("//a[text()='Delete']")).click();
		
		//Click Find leads
		driver.findElement(By.linkText("Find Leads")).click();
		
		//Enter captured lead ID
		driver.findElement(By.name("id")).sendKeys("10853");
		
		//Click find leads button
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		
		//Verify message "No records to display" in the Lead List. This message confirms the successful deletion
		driver.findElement(By.xpath("//table[text()='No records to display']"));
		
		//close the browser (Do not log out)
		driver.close();
	}
	
	

}
