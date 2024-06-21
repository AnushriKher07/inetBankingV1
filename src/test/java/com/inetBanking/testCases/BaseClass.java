package com.inetBanking.testCases;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {
    protected WebDriver driver;
    protected Properties properties;

    public void initializeDriver() throws IOException {
        // Load configuration properties
        properties = new Properties();
        try (FileInputStream fis = new FileInputStream("\\Users\\anush\\eclipse-workspace\\inetBankingV1\\Configuration\\config.properties")) {
            properties.load(fis);
        }

        // Force Chrome as the browser
        System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();

        // Set implicit wait and maximize window
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        // Navigate to the specified URL
        driver.get(properties.getProperty("url"));
    }

    public void quitDriver() {
        if (driver != null) {
            driver.quit();
        }
    }
}	
	

