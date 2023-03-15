package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class FaceBook {
	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.linkText("Create new account")).click();
		driver.findElement(By.name("firstname")).sendKeys("sri");
		driver.findElement(By.name("lastname")).sendKeys("Arunaa");
		driver.findElement(By.name("email")).sendKeys("arunaa41195@gmail.com");
		driver.findElement(By.id("password_step_input")).sendKeys("Aru1234");
		
		WebElement wb=driver.findElement(By.id("day"));
		Select se = new Select (wb);
		se.selectByValue("4");
		
		WebElement wb1 = driver.findElement(By.id("month"));
		Select se1 = new Select (wb1);
		se.selectByValue("11");
		
		
		WebElement wb2 = driver.findElement(By.id("year"));
		Select se2 = new Select (wb2);
		se.selectByValue("1995");
		
		driver.findElement(By.xpath("//input[@class='_8esa']")).click();
		
		
		
	}



		
			
	}


