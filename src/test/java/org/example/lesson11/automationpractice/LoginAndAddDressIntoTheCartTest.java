package org.example.lesson11.automationpractice;// Generated by Selenium IDE

import org.example.BaseTest;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoginAndAddDressIntoTheCartTest extends BaseTest {

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
        assertEquals(driver.findElement(By.cssSelector(".account > span")).getText(), "Oleksii Bailo");
        driver.findElement(By.linkText("Women")).click();
        driver.findElement(By.cssSelector(".ajax_block_product:nth-child(1) .button:nth-child(1) > span")).click();
        driver.findElement(By.cssSelector(".button-medium:nth-child(2) > span")).click();
        driver.findElement(By.cssSelector(".standard-checkout > span")).click();
        driver.findElement(By.cssSelector(".button:nth-child(4) > span")).click();
    }
}
