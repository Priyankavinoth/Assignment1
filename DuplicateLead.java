package week2.day2;

        import org.openqa.selenium.By;
        
		import org.openqa.selenium.chrome.ChromeDriver;

		import io.github.bonigarcia.wdm.WebDriverManager;

		public class DuplicateLead {

			public static void main(String[] args) {
				WebDriverManager.chromedriver().setup();
				ChromeDriver driver=new ChromeDriver();
				driver.get("http://leaftaps.com/opentaps/control/login");
				driver.manage().window().maximize();
				//username
				driver.findElement(By.id("username")).sendKeys("demosalesmanager");
				//password
				driver.findElement(By.id("password")).sendKeys("crmsfa");
				//click login
				driver.findElement(By.className("decorativeSubmit")).click();
				//verify by get text
				String text = driver.findElement(By.tagName("h2")).getText(); //cntrl+2+l
				//print text
				System.out.println(text);
				//verify by title
				String title = driver.getTitle(); //cntrl+2+l
				//print title
				System.out.println(title);
				//click crmsfa
				driver.findElement(By.linkText("CRM/SFA")).click();
				//click lead
				driver.findElement(By.linkText("leads")).click();
				//create lead
				driver.findElement(By.linkText("create leads")).click();
				//find company name and enter company name
				driver.findElement(By.id("createLeadForm_companyName")).sendKeys("testleaf");
				//enter first name
				driver.findElement(By.id("createLeadForm_firstName")).sendKeys("priyanka");
				//enter last name
				driver.findElement(By.id("createLeadForm_lastName")).sendKeys("udayasuriyan");
				//enter email address
				driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("haripriyanka1704@gmail.com");
				//click create lead
				driver.findElement(By.className("smallSubmit")).click();
				
				
				
				//click duplicate lead
				driver.findElement(By.className("subMenuButton")).click();
				
				driver.findElement(By.id("createLeadForm_companyName")).clear();
				driver.findElement(By.id("createLeadForm_companyName")).sendKeys("innova");
				
				driver.findElement(By.id("createLeadForm_firstName")).clear();
				driver.findElement(By.id("createLeadForm_firstName")).sendKeys("aadhirai");
				
				driver.findElement(By.id("createLeadForm_lastName")).clear();
				driver.findElement(By.id("createLeadForm_lastName")).sendKeys("vinothkumar");
				
				driver.findElement(By.id("createLeadForm_primaryEmail")).clear();
				driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("aadhirai29@gmail.com");
				//Click on Create Button
		        driver.findElement(By.className("smallSubmit")).click();
		        
		        String title1 = driver.getTitle();
				
				System.out.println(title1);
				
	}

}
