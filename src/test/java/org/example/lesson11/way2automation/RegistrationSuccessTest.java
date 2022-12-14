package org.example.lesson11.way2automation;// Generated by Selenium IDE

import org.example.BaseTest;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;

public class RegistrationSuccessTest extends BaseTest {

    @Test
    public void registrationsuccess() {
        driver.get("https://www.way2automation.com/way2auto_jquery/registration.php");
        driver.manage().window().setSize(new Dimension(1264, 662));
        driver.findElement(By.name("name")).click();
        driver.findElement(By.name("name")).sendKeys("Oleksii");
        driver.findElement(By.cssSelector("p:nth-child(2) > input")).sendKeys("Bailo");
        driver.findElement(By.cssSelector("fieldset:nth-child(2) > .radio_wrap > label:nth-child(1)")).click();
        driver.findElement(By.name("hobby")).click();
        driver.findElement(By.cssSelector("fieldset:nth-child(4) > select")).click();
        driver.findElement(By.cssSelector(".time_feild:nth-child(2) > select")).click();
        {
            WebElement dropdown = driver.findElement(By.cssSelector(".time_feild:nth-child(2) > select"));
            dropdown.findElement(By.xpath("//option[. = '1']")).click();
        }
        driver.findElement(By.cssSelector(".time_feild:nth-child(3) > select")).click();
        {
            WebElement dropdown = driver.findElement(By.cssSelector(".time_feild:nth-child(3) > select"));
            dropdown.findElement(By.xpath("//option[. = '1']")).click();
        }
        driver.findElement(By.cssSelector(".time_feild:nth-child(4) > select")).click();
        {
            WebElement dropdown = driver.findElement(By.cssSelector(".time_feild:nth-child(4) > select"));
            dropdown.findElement(By.xpath("//option[. = '2014']")).click();
        }
        driver.findElement(By.name("phone")).click();
        driver.findElement(By.name("phone")).sendKeys("12345");
        driver.findElement(By.name("username")).click();
        driver.findElement(By.name("username")).sendKeys("solomaking");
        driver.findElement(By.name("email")).sendKeys("solomaking@gmail.com");
        driver.findElement(By.cssSelector("textarea")).click();
        driver.findElement(By.cssSelector("textarea")).sendKeys("me");
        driver.findElement(By.name("password")).click();
        driver.findElement(By.name("password")).sendKeys("213");
        driver.findElement(By.name("c_password")).click();
        driver.findElement(By.name("c_password")).sendKeys("123");
        driver.findElement(By.cssSelector("fieldset:nth-child(13) > input")).click();
    }
}
