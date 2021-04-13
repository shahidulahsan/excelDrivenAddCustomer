package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class AddCustomerPage extends BasePage{
	
	WebDriver driver;
	
	public AddCustomerPage(WebDriver driver) {
		this.driver = driver;
	}
	
	//WebElements Library
	@FindBy(xpath = "//input[@type='text']")
	WebElement Email_Field;
	@FindBy(xpath = "//input[@type='password']")
	WebElement Password_Field;
	@FindBy(xpath = "//button[@name='login']")
	WebElement SignIn_Button;
	
	
	
		
	
	@FindBy(xpath = "//*[@id=\"side-menu\"]/li[3]/a/span[1]")
	WebElement Customers_Button;
	@FindBy(xpath = "//*[@id=\"side-menu\"]/li[3]/ul/li[1]/a")
	WebElement Add_Customers_Button;
	
	
	// Element Lib
		@FindBy(how = How.XPATH, using = "//*[@id=\"account\"]")
		WebElement USERNAME_FIELD_LOCATOR;
		@FindBy(how = How.XPATH, using = "//*[@id=\"cid\"]")
		WebElement COMPANY_FIELD_LOCATOR;
		@FindBy(how = How.XPATH, using = "//*[@id=\"email\"]")
		WebElement EMAIL_FIELD_LOCATOR;
	
	@FindBy(xpath = "//input[@id='account']")
	WebElement FullName_Field;
	@FindBy(xpath = "//input[@id='account']")
	WebElement Company_Field;
	@FindBy(xpath = "//input[@id='email']")
	WebElement Customer_Email_Field;
	@FindBy(xpath = "//input[@id='phone']")
	WebElement Phone_Field;
	@FindBy(xpath = "//input[@id='email']")
	WebElement Address_Field;
	@FindBy(xpath = "//input[@id='city']")
	WebElement City_Field;
	@FindBy(xpath = "//input[@id='state']")
	WebElement State_Field;
	@FindBy(xpath = "//input[@id='zip']")
	WebElement Zip_Field;
	@FindBy(xpath = "//button[@id=\"submit\"]")
	WebElement Save_Button;
	
	
	
	//Interactive methods
	public void emailField(String email) {Email_Field.sendKeys(email);}
	public void passwordField(String password) {Password_Field.sendKeys(password);}
	public void signIn() {SignIn_Button.click();}
	
	
	
	public void fullNameField(String fullName) {FullName_Field.sendKeys(fullName);}
	public void companyField(String company) {Company_Field.sendKeys(company);}
	public void customerEmailField(String email) {Customer_Email_Field.sendKeys(email);}
	public void phoneField(String phone) {Phone_Field.sendKeys(phone);}
	public void addressField(String address) {Address_Field.sendKeys(address);}
	public void cityField(String city) {City_Field.sendKeys(city);}
	public void stateField(String state) {State_Field.sendKeys(state);}
	public void zipField(String zip) {Zip_Field.sendKeys(zip);}
	public void saveButton() {Save_Button.click();}
	
	

}
