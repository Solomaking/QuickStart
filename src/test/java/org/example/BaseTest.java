package org.example;

import org.example.lesson14.PageGenerator;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class BaseTest {
    public WebDriver driver;
    public PageGenerator page;

    @BeforeEach
    public void setUp() {
        System.setProperty(
                "webdriver.chrome.driver", "src/main/resources/chromedriver.exe"
        );
        driver = new ChromeDriver();
        page = new PageGenerator(driver);
        driver.manage().window().maximize();
    }

    @AfterEach
    public void tearDown() {
        driver.manage().deleteAllCookies();
        driver.quit();
    }
}
