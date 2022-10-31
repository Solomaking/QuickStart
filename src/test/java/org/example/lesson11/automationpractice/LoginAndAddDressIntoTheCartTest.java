package org.example.lesson11.automationpractice;// Generated by Selenium IDE

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.HashMap;
import java.util.Map;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class LoginAndAddDressIntoTheCartTest {
    private WebDriver driver;
    private Map<String, Object> vars;
    JavascriptExecutor js;

    @Before
    public void setUp() {
        System.setProperty(
                "webdriver.chrome.driver", "src/main/resources/chromedriver.exe"
        );
        driver = new ChromeDriver();
        js = (JavascriptExecutor) driver;
        vars = new HashMap<String, Object>();
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void loginandadddressintothecart() {
        driver.get("http://automationpractice.com/index.php");
        driver.manage().window().setSize(new Dimension(1264, 662));
        driver.findElement(By.linkText("Sign out")).click();
        driver.findElement(By.linkText("Sign in")).click();
        driver.findElement(By.id("email")).click();
        driver.findElement(By.id("email")).sendKeys("obailodv13@gmail.com");
        driver.findElement(By.id("passwd")).sendKeys("54564217");
        driver.findElement(By.cssSelector("#SubmitLogin > span")).click();
        assertThat(driver.findElement(By.cssSelector(".account > span")).getText(), is("Oleksii Bailo"));
        driver.findElement(By.linkText("Women")).click();
        driver.findElement(By.cssSelector(".ajax_block_product:nth-child(1) .button:nth-child(1) > span")).click();
        driver.findElement(By.cssSelector(".button-medium:nth-child(2) > span")).click();
        driver.findElement(By.cssSelector(".standard-checkout > span")).click();
        driver.findElement(By.cssSelector(".button:nth-child(4) > span")).click();
    }
}
