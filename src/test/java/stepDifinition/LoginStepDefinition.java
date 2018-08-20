/*package stepDifinition;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefinition {
	WebDriver driver;

	@Given("^user is already on login page$")
	public void user_already_on_login_page() {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium drivers\\Chrome\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://www.freecrm.com/index.html");
	}

	@When("^title of the login page is Free CRM$")
	public void title_of_the_login_page_is_Free_CRM() {
		String title = driver.getTitle();
		System.out.println(title);
		// Assert.assertEquals("Free CRM software in the cloud powers sales and
		// customer servic", title);
	}

	@Then("^user enters \"(.*)\" and \"(.*)\"$")
	public void user_enters_username_and_password(String username, String password) {
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
	}

	@Then("^user click on Login button$")
	public void user_click_on_Login_button() {
		WebElement loginBtn = driver.findElement(By.xpath("//input[@type='submit']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", loginBtn);
	}

	@Then("^user is on home page$")
	public void user_is_on_hopme_page() {
		String title = driver.getTitle();
		System.out.println("Home Page title ::" + title);
		Assert.assertEquals("CRMPRO", title);
	}

	@Then("^user moves to new contact pages$")
	public void user_moves_to_new_contact_pages() throws Throwable {
		driver.switchTo().frame("mainpanel");
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Contacts')]"))).build().perform();
		driver.findElement(By.xpath("//a[contains(text(),'New Contact')]")).click();
		Thread.sleep(3000);
	}

    @Then("^user enters contact details \"(.*)\" and \"(.*)\" and \"(.*)\"$")
    public void user_enters_contacts_details(String firstname, String lastname, String position){
	driver.findElement(By.xpath("//*[@id='first_name']")).sendKeys(firstname);
	driver.findElement(By.xpath("//*[@id='surname']")).sendKeys(lastname);
	driver.findElement(By.xpath("//*[@id='company_position']")).sendKeys(position);
	driver.findElement(By.xpath("//*[@id='contactForm']/table/tbody/tr[1]/td/input[2]")).click();
    }

	@Then("^user close the browser$")
	public void user_close_the_browser() {
    driver.quit();
	}
}

*/