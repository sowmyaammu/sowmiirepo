package case4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class program3 {
WebDriver driver;
@Given("user enters home page using the credentials")
public void user_enters_home_page_using_the_credentials() {
	System.setProperty("webdriver.chrome.driver","C:\\Sowmya\\Drivers\\chromedriver.exe");
	 driver=new ChromeDriver();
	driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
}

@When("he search for an item as {string} and find the details")
public void he_search_for_an_item_as_and_find_the_details(String string) {
	driver.findElement(By.xpath("//*[@id=\"myInput\"]")).sendKeys(string);
	driver.findElement(By.xpath("/html/body/div[1]/form/input")).click();
}

@Then("he tries to add to cart")
public void he_tries_to_add_to_cart() {
	driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[1]/div/div/div[2]/center/a")).click();
	
}

@Then("he will be asked for login details")
public void he_will_be_asked_for_login_details() {
Assert.assertEquals(driver.getTitle(),"Login");	
}
}
