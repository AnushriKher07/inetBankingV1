package com.inetBanking.testCases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.inetBanking.pageObjects.RegisterPage;

public class TC_RegisterTest {
	public class LoginRegisterTest extends BaseClass {

	    private RegisterPage registerPage;

	    @BeforeMethod
	    public void setup() throws IOException {
	        initializeDriver();
	        registerPage = new RegisterPage(driver, properties);
	    }

	   
	    @Test
	    public void registerTest() {
	        registerPage.navigateToRegisterPage();
	        registerPage.enterEmail();
	        registerPage.enterPassword();
	        registerPage.clickRegisterButton();
	        // Add assertions or further actions based on the registration result
	    }

	    @AfterMethod
	    public void tearDown() {
	        quitDriver();
	    }
	}

}
