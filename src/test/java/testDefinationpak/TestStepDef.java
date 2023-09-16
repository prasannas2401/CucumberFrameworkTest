package testDefinationpak;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class TestStepDef {
	
	public WebDriver driver;
	ChromeOptions  options;
	
	public TestStepDef() {
		// TODO Auto-generated constructor 
		System.setProperty("webdriver.chrome.driver", "G:\\Ganesh\\chromerdriver\\chromedriver.exe");
		options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
	}

	@Given("user is on home page")
	public void user_is_on_home_page()  throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
    	driver= new ChromeDriver(options);
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));		
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
	   
	}
	@When("^user enter username \"(.*)\"$")
	public void user_enter_username(String username)  throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("please enter usenamr");
		driver.findElement(By.id("email")).sendKeys(username);
	    
	}
	@When("^user enter password \"(.*)\"$")
	public void user_enter_password(String password)  throws Throwable{
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("pass")).sendKeys(password);
	   
	}
	@Then("user should enter to application.")
	public void user_should_enter_to_application()  throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//button[@name='login']")).click();
		System.out.println("Login Successfully");		
		System.out.println("LogOut Successfully");		
		driver.quit();
	    
	}
	
	

	@When("user click on Logout button")
	public void user_click_on_logout_button() throws Throwable {
	   
	}
	@Then("user should sucessfuly logout from Application.")
	public void user_should_sucessfuly_logout_from_application() throws Throwable {
	    
	}






	
}
