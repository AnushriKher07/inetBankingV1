package com.inetBanking.pageObjects;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage {
    private WebDriver driver;
    private Properties properties;

    private By emailInput = By.id("reg_email");
    private By passwordInput = By.id("reg_password");
    private By registerButton = By.name("register");

    public RegisterPage(WebDriver driver, Properties properties) {
        this.driver = driver;
        this.properties = properties;
    }

    public void navigateToRegisterPage() {
        driver.get(properties.getProperty("registerUrl"));
    }


    public void enterEmail() {
        driver.findElement(emailInput).sendKeys(properties.getProperty("registerEmail"));
    }

    public void enterPassword() {
        driver.findElement(passwordInput).sendKeys(properties.getProperty("registerPassword"));
    }

    public void clickRegisterButton() {
        driver.findElement(registerButton).click();
    }
}



