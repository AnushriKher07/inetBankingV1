package com.inetBanking.testCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.inetBanking.pageObjects.LoginPage;

public class TC_LoginTest_001 extends BaseClass
{
    private LoginPage loginPage;
    private By usernameInput = By.id("username");
    private By passwordInput = By.id("password");
    private By loginButton = By.id("loginBtn");

    @BeforeMethod
    public void setup() throws IOException {
        initializeDriver();
        loginPage = new LoginPage(driver, properties);
    }

    @Test
    public void loginTest() {
        loginPage.navigateTologinPage();
        loginPage.enterUsername();
        loginPage.enterPassword();
        loginPage.clickLoginButton();

        // Add assertions or further actions based on the login result
        // For example, you can add an assertion to check if the login is successful.
        // Assert.assertTrue(someCondition, "Login failed message");
    }

    @AfterMethod
    public void tearDown() {
        quitDriver();
    }

    }


	