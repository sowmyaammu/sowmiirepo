package maven;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
public class codeedit {
	WebDriver driver;
	@Given("user opens the application")
	public void user_opens_the_application() {
		System.setProperty("webdriver.chrome.driver","C:\\Sowmya\\Drivers\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.get("http://10.232.237.143:443/TestMeApp/");
		 driver.manage().window().maximize();
	}
	

	@Given("user clicks on signup button")
			public void user_clicks_on_signup_button() {
			 // driver.get("http://10.232.237.143:443/TestMeApp/RegisterUser.htm");
				driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/li[2]/a")).click();   
	}

	@When("user enters username as {string}")
		public void user_enters_username_as(String string) {
			//driver.findElement(By.xpath("//*[@id=\\\"userName\\\"]")).sendKeys(string);
		driver.findElement(By.xpath("//*[@id=\"userName\"]")).sendKeys(string);
	}

	@When("user enters firstname as {string}")
	public void user_enters_firstname_as(String string) {
		driver.findElement(By.xpath("//*[@id=\"firstName\"]")).sendKeys(string);
	}

	@When("user enter lastname as {string}")
	public void user_enter_lastname_as(String string) {
		driver.findElement(By.xpath("//*[@id=\"lastName\"]")).sendKeys(string);    
	}

	@When("user type password as {string}")
	public void user_type_password_as(String string) {
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(string); 
	}

	@When("user type confirm password as {string}")
	public void user_type_confirm_password_as(String string) {
		 driver.findElement(By.xpath("//*[@id=\"pass_confirmation\"]")).sendKeys(string);

	    	}

	@When("user click gender")
	public void user_click_gender() {
		 driver.findElement(By.xpath("//input[@value='Female']")).click();
	    
	}

	@When("user gives email as {string}")
	public void user_gives_email_as(String string) {
		  driver.findElement(By.xpath("//*[@id=\"emailAddress\"]")).sendKeys(string);
	}
	@When("user give mobile number as {string}")
	public void user_give_mobile_number_as(String string) {
		driver.findElement(By.xpath("//*[@id=\"mobileNumber\"]")).sendKeys(string);
	}

	@When("user passes dob")
	public void user_passes_dob() {
		driver.findElement(By.xpath("/html/body/main/div/div/form/fieldset/div/div[9]/div/div/img")).click();
		   WebElement selmonth=driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/select[1]"));
		   Select month=new Select(selmonth);
		   month.selectByValue("10");
		   
		   WebElement selyear= driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/select[2]"));
		   Select year=new Select(selyear);
		   year.selectByValue("1997");
		   
		   WebElement seldate= driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table"));
		   seldate.findElement(By.linkText("24"));
	}
	@When("user enters address as {string}")
	public void user_enters_address_as(String string) {
		driver.findElement(By.xpath("//*[@id=\"address\"]")).sendKeys(string);
	}

	@When("user enters security question")
	public void user_enters_security_question() {
		WebElement security= driver.findElement(By.xpath("//*[@id=\"securityQuestion\"]"));
	    Select secque=new Select(security);
	    secque.selectByIndex(2);
	}

	@When("user enters answer as {string}")
	public void user_enters_answer_as(String string) {
		 driver.findElement(By.xpath("//*[@id=\"answer\"]")).sendKeys(string);
	}
	

	@When("click on register")
	public void click_on_register() {
		  driver.findElement(By.xpath("/html/body/main/div/div/form/fieldset/div/div[13]/div/input[1]"));
	}

	@Then("registration should be successful")
	public void registration_should_be_successful() {
		driver.get("http://10.232.237.143:443/TestMeApp/login.htm");
	    
	}
}