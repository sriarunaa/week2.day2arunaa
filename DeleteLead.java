package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DeleteLead {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
		
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		

		 driver.findElement(By.xpath("//span[text()='Phone']")).click();
		 driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("1234567891");
		 driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		 driver.findElement(By.xpath("//a[text()='10000']")).click();
			driver.findElement(By.xpath("//a[text()='Delete']")).click();
			driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
			driver.findElement(By.xpath("//input[@name='id']")).sendKeys("10000");
			driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
			driver.close();
		}
	

	}


