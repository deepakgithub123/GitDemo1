package com.shop.qa.testcases;

//import com.shop.qa.pages.PageLogin;

import com.shop.qa.base.TestBase;
import com.shop.qa.pages.HomePage;
import com.shop.qa.pages.LoginPage;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import 	org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginPageTest extends TestBase{

	LoginPage loginPage;
	HomePage homePage;
	String logTitle;
	
	public LoginPageTest() throws IOException{
		super(); 
	}

	@BeforeMethod
	public void setUp() throws IOException
	{
		initialize();	
 		loginPage = new LoginPage();
 		
// 		logTitle= loginPage.validateLoginPageTitle();
	}
	
	
	@Test(priority=1)
	public void loginPageTitleTest()
	{
		logTitle= loginPage.validateLoginPageTitle();
		
//		loginPage.validateLoginPageTitle();
	
		Assert.assertEquals(logTitle, "Login");
		
		System.out.println("LoginTitle:"+logTitle);
		System.out.println("LoginTitle1:"+logTitle);
		System.out.println("LoginTitle2:"+logTitle);
		System.out.println("LoginTitle3:"+logTitle);
		System.out.println("LoginTitle4:"+logTitle);
		
	}
	
	
	//	@Test(priority=2)
//	public void loginPageLlogo()
//	{
		
		
//	}
	
	
	@Test(priority=2)
	public void loginTest()
	{
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password")); 
	}
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
}
