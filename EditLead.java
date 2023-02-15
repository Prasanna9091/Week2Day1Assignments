package week2.day1.week2day1Assignment1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.partialLinkText("CRM")).click();
		
		driver.findElement(By.linkText("Leads")).click();
		
		driver.findElement(By.linkText("Create Lead")).click();
		
        driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Sibhi");
		
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Prasanna");
		
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Karuppaian");
		
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Saranya");
		
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Dermatalogy");
		
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Skin");
		
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("prasannark1991@gmail.com");
		
		driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId")).sendKeys("NewYork");
		
		driver.findElement(By.className("smallSubmit")).click();
		
        driver.findElement(By.className("subMenuButton")).click();
		
		driver.findElement(By.name("description")).clear();
		
		driver.findElement(By.name("importantNote")).sendKeys("Corona Virus");
		
		driver.findElement(By.name("submitButton")).click();
		
		String title = driver.getTitle();
		System.out.println(title);
		

	}

}
