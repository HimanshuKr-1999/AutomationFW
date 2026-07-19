package com.automation.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.automation.driver.BrowserFactory;
import com.automation.driver.DriverFactory;

public class googleTest {

    @Test
    public void launchGoogle() {

        WebDriverManager.chromedriver().setup();

  BrowserFactory.launchBrowser();

        DriverFactory.getDriver().get("https://the-internet.herokuapp.com");

        String title = DriverFactory.getDriver().getTitle();

        System.out.println(title);
        System.out.println("11111111111111111111111111111111111111111111111111111111");

        Assert.assertTrue(title.contains("The Internet"));

        DriverFactory.quitDriver();
    }
}