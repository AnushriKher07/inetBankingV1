package com.inetBanking.pageObjects;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    private WebDriver driver;
    private Properties properties;

    // Locators
    private By usernameInput = By.id("username");
    private By passwordInput = By.id("password");
    private By loginButton = By.xpath(" //input[contains(@class, 'woocommerce-Button') and @name='login']");

    // Constructor
    public LoginPage(WebDriver driver, Properties properties) {
        this.driver = driver;
        this.properties = properties;
    }

    // Methods
	public void navigateTologinPage() {
		// TODO Auto-generated method stub
        driver.get(properties.getProperty("loginUrl"));
	}

    public void enterUsername() {
        driver.findElement(usernameInput).sendKeys(properties.getProperty("loginUsername"));
    }

    public void enterPassword() {
        driver.findElement(passwordInput).sendKeys(properties.getProperty("loginPassword"));
    }

    public void clickLoginButton() {
        driver.findElement(loginButton).click();
    }


	
}


