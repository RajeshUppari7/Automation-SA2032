package com.crm.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

import com.crm.pages.HomePage;
import com.crm.pages.LoginPage;

public class BaseClass {

	public WebDriver driver;
	public HomePage hp;
	public LoginPage lp;

	@BeforeTest
	public void setup() {
		driver = new ChromeDriver();
		driver.get("https://automationplayground.com/crm/");

		hp = new HomePage(driver);
		lp = new LoginPage(driver);

	}

}
