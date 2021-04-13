package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import page.AddCustomerPage;
import util.BrowserFactory;
import util.ExcelReader;

public class AddCustomerTest {

	WebDriver driver;
	ExcelReader exc = new ExcelReader("src\\main\\java\\testData\\Book1.xlsx");
	
    String email = exc.getCellData("login", "userName", 2);
    String password = exc.getCellData("login", "password", 2);
    
    String fullName = exc.getCellData("customer", "fullName", 2);
    String company = exc.getCellData("customer", "comapny", 2);
    String customeremail = exc.getCellData("customer", "email", 2);
    String phone = exc.getCellData("customer", "phone", 2);
    String address = exc.getCellData("customer", "address", 2);
    String city = exc.getCellData("customer", "city", 2);
    String state = exc.getCellData("customer", "state", 2);
    String zip = exc.getCellData("customer", "zip", 2);
	
	@Test
	public void addCustomer() {
		
		driver = BrowserFactory.init();
		
		AddCustomerPage customer = PageFactory.initElements(driver, AddCustomerPage.class);
		
		customer.emailField(email);
		customer.passwordField(password);
		customer.signIn();
		
		Assert.assertEquals(driver.getTitle(), "Contacts - iBilling", "Wrong Page");
		
		
		
		//customer.fullNameField("ABCD");
		
	}
	
	
	
	
}
