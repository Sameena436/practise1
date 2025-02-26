package STEPS10;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepdefination {
	
	WebDriver driver;
	
	@Given("User launch chrome browser")
	public void user_launch_chrome_browser() {
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		//System.out.println("One");

	}

	
	
	@When("User opens URL {string}")
	public void user_opens_url(String TestURL) {
		
		driver.get(TestURL);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}

	
	
	@When("User enters username as {string} and password as {string}")
	public void user_enters_username_as_and_password_as(String username, String password) {
		
		 driver.findElement(By.name("username")).sendKeys(username);
		  driver.findElement(By.name("password")).sendKeys(password);
		  driver.findElement(By.xpath("//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();

	}

	
	
	@Then("Go to Skill Page")
	public void go_to_skill_page() {
		
		  driver.findElement(By.xpath("//*[@id='app']/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a/span")).click();
		  driver.findElement(By.xpath("//*[@id='app']/div[1]/div[1]/header/div[2]/nav/ul/li[4]/span")).click();
		  driver.findElement(By.xpath("//*[@id='app']/div[1]/div[1]/header/div[2]/nav/ul/li[4]/ul/li[1]")).click();
		  driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/div[1]/div/button")).click();

	}

	
	
	@When("Add skills with skillname as {string} and skilldescription as {string}")
	public void add_skills_with_skillname_as_and_skilldescription_as(String skillname, String skillDescr) {
		
		 driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/input")).sendKeys(skillname);

		  driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/textarea")).sendKeys(skillDescr);

		  driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[3]/button[2]")).click();

	}

	
	
	@When("Click on logout button")
	public void click_on_logout_button() {
	}

	
	
	@Then("Close Browser")
	public void close_browser() {
	}

	 //driver.quit();

	
}
