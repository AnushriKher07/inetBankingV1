package com.inetBanking.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MultipleuserLogin {
    private WebDriver driver;

    // Locators
    private By usernameInput = By.name("username");
    private By passwordInput = By.name("password");
    private By loginButton = By.name("login");

    // Constructor
    public void LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    // Page methods
    public void navigateToLoginPage(String url) {
        driver.get(url);
    }

    public void enterUsername(String username) {
        driver.findElement(usernameInput).sendKeys(username);
    }

    public void enterPassword(String password) {
        driver.findElement(passwordInput).sendKeys(password);
    }

    public void clickLoginButton() {
        driver.findElement(loginButton).click();
    }
}