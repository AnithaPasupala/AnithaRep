package demoqa.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Repository {

	
	WebDriver driver;
	
	Repository(WebDriver driver){
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="first_name")
	WebElement FirstName;
	
	@FindBy(name="last_name")
	WebElement LastName;
	
	@FindBy(xpath="//input[@value='single']")
	WebElement MartialStatus;
	
	@FindBy(xpath="//input[@value='dance']")
	WebElement Hobby;
	
	@FindBy(id="dropdown_7")
	WebElement Country;
	
	@FindBy(id="mm_date_8")
	WebElement Month;
	
	@FindBy(id="dd_date_8")
	WebElement Day;
	
	@FindBy(id="yy_date_8")
	WebElement Year;
	
	@FindBy(id="phone_9")
	WebElement PhoneNum;
	
	@FindBy(id="username")
	WebElement UserName;

	@FindBy(id="email_1")
	WebElement Email;
	
	@FindBy(id="password_2")
	WebElement Password;
	
	@FindBy(id="confirm_password_password_2")
	WebElement ConfirmPassword;
	
	@FindBy(name="pie_submit")
	WebElement Submit;
	
	void firstName(String name) {
		
		FirstName.sendKeys(name);
	}
	
	void lastName(String name) {
		LastName.sendKeys(name);
	}
	
	void martialStatus() {
		MartialStatus.click();
	}
	
	void hobby() {
		Hobby.click();
	}
	
	void country() {
		
		Select sel=new Select(Country);
		sel.selectByIndex(2);
	}
	void month() {
			
			Select sel=new Select(Month);
			sel.selectByIndex(9);
		}
	void day() {
		
		Select sel=new Select(Day);
		sel.selectByIndex(10);
	}
	void Year() {
		
		Select sel=new Select(Year);
		sel.selectByIndex(5);
	}
	void phoneNum(String num) {
		
		PhoneNum.sendKeys(num);
	}
	void userName(String name) {
		UserName.sendKeys(name);
	}
	void email(String email) {
		Email.sendKeys(email);
	}
	void password(String pwd) {
		Password.sendKeys(pwd);
	}
	void confirmPassword(String pwd) {
		ConfirmPassword.sendKeys(pwd);
	}
	
	void submit() {
		Submit.click();
	}
	
}
