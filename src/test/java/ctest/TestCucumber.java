package ctest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestCucumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "G:\\Ganesh\\chromerdriver\\chromedriver.exe");
		ChromeOptions  options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		WebDriver driver = new ChromeDriver(options);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		
		//driver.findElement(By.xpath(".//*[@id='account']/a")).click();
		
		driver.findElement(By.id("email")).sendKeys("Prasanna"); 
		
		driver.findElement(By.id("pass")).sendKeys("Test@123");
		
		driver.findElement(By.xpath("//button[@name='login']")).click();
		
		System.out.println("Login Successfully");
		
		//driver.findElement (By.xpath(".//*[@id='account_logout']/a")).click();
		
		System.out.println("LogOut Successfully");
		
		driver.quit();
		
		
		
		//driver.get("https://www.facebook.com");
		

	}

}
