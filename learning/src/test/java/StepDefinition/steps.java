package StepDefinition;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class steps {
	WebDriver driver;
	
	@Before
	public void beforetest()
	{
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\ShrutikaAdina\\eclipse-workspace\\Automationday01\\Lib\\geckodriver-v0.26.0.exe");
		
		 driver = new FirefoxDriver ();
		driver.manage().window().maximize();
	}
	
	@After
	public void aftertest()
	{
		driver.close();
	}
	
	
	
	
	@Given("I am able to naviagte onto the Signup page")
	public void i_am_able_to_naviagte_onto_the_Signup_page() {
		
		
		driver.get("http://elearningm1.upskills.in/");
	   
	}

	@When("I click on the Signuplink")
	public void i_click_on_the_Signuplink() throws InterruptedException {
		 driver.findElement(By.linkText("Sign up!")).click();
		 Thread.sleep(2000);		 
		 
		 
		 
	}
	@When("I Enter the First name  as {string}")
	public void i_enter_the_first_name_as(String string) {
		driver.findElement(By.id("registration_firstname")).sendKeys("Shruti");
	    
	}




	@When("I Enter the Last name  as {string}")
	public void i_enter_the_last_name_as(String string) {
		driver.findElement(By.id("registration_lastname")).sendKeys("a");

	    
	}
	@When("I enter the  email as {string}")
	public void i_enter_the_email_as(String string) {
		driver.findElement(By.id("registration_email")).sendKeys("shradina@in.ibm.com");
		
	    
	}
	@When("I enter Username as {string}")
	public void i_enter_username_as(String string) {
		driver.findElement(By.id("username")).sendKeys("admin1699");
	    
	}
	@When("I enter Pass as {string}")
	public void i_enter_pass_as(String string) {
		driver.findElement(By.id("pass1")).sendKeys("admin@1234");
	   
	}
	@When("I enter Confirm password as {string}")
	public void i_enter_confirm_password_as(String string) {
		driver.findElement(By.id("pass2")).sendKeys("admin@1234");
	    
	}
	@When("I press {string}")
	public void i_press(String string) {
		driver.findElement(By.id("registration_submit")).click();
	   
	}
	@Then("I should see the message {string}")
	public void i_should_see_the_message(String string) {
		if(driver.getPageSource().contains("Dear shruti a,\r\n" + 
				"\r\n" + 
				"Your personal settings have been registered.\r\n" + 
				"\r\n" + 
				"An e-mail has been sent to remind you of your login and password.\r\n" + 
				"\r\n" + 
				"You can now select, in the list, the course you want access to.")){
			System.out.println("Text is present");
			}else{
			System.out.println("Text is absent");
			}
	}


	@When("I Enter the username as {string}")
	public void i_enter_the_username_as(String string) {
		driver.findElement(By.id("login")).sendKeys("admin1691");
	}

	@When("I Enter the password as {string}")
	public void i_enter_the_password_as(String string) {
		driver.findElement(By.id("password")).sendKeys("admin@1234");
	}
	@When("I click on the login button")
	public void i_click_on_the_login_button() {
		driver.findElement(By.id("form-login_submitAuth")).click();
	}
	@When("I Click on the link {string}")
	public void i_click_on_the_link(String string) {
		
		driver.findElement(By.className("dropdown-toggle")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@When("I click on the {string}")
	public void i_click_on_the(String string) {
	    driver.findElement(By.xpath("/html/body/main/header/nav/div/div[2]/ul[2]/li[2]/ul/li[3]/a/em")).click();
	    
	}
	@When("I click on the message {string}")
	public void i_click_on_the_message(String string) {
	    driver.findElement(By.xpath("/html/body/main/section/div/div[2]/div/div/div[2]/div[1]/div/div[1]/a[1]/img")).click();
	    
	    
	}
	@When("I enter the send to as {string}")
	public void i_enter_the_send_to_as(String string) {
		driver.findElement(By.xpath("/html/body/main/section/div/div[2]/div/div/div[2]/div/div[2]/form/fieldset/div[1]/div[1]/span/span[1]/span/ul/li/input")).sendKeys("naveen1@naveen1.com");
	//   Select  dropdown = new Select(driver.findElement(By.xpath("/html/body/main/section/div/div[2]/div/div/div[2]/div/div[2]/form/fieldset/div[1]/div[1]/span/span[1]/span/ul/li/input")));
	//  
	//	dropdown.selectByVisibleText("naveen1 naveen1 (naveen1) ");
	}
	
	@When("I enter Subject as {string}")
	public void i_enter_subject_as(String string) {
		driver.findElement(By.id("compose_message_title")).sendKeys("this is for testing");

	}
	    
	@When("I enter message as {string}")
public void i_enter_message_as(String string) {
		WebElement element = driver.findElement(By.xpath("//iframe[@title='Rich Text Editor, content']"));
		driver.switchTo().frame(element);
		WebElement compose = driver.findElement((By.xpath("//body[@class= 'cke_editable cke_editable_themed cke_contents_ltr cke_show_borders']")));
		compose.sendKeys("This is for testing");
	}
	   
	@Then("I click on send message button.")
	public void i_click_on_send_message_button() {
	  driver.findElement(By.id("compose_message_compose")).click();
	}

}
