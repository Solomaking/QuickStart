package org.example.lesson11.way2automation;// Generated by Selenium IDE

import org.example.BaseTest;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;

public class RegistrationFailedTest extends BaseTest {

    @Test
    public void registrationfailed() {
        driver.get("https://www.way2automation.com/way2auto_jquery/registration.php");
        driver.manage().window().setSize(new Dimension(1264, 662));
        driver.findElement(By.cssSelector("fieldset:nth-child(13) > input")).click();
        {
            List<WebElement> elements = driver.findElements(By.cssSelector("p > .error_p:nth-child(3)"));
            assert (elements.size() > 0);
        }
        assertFalse(driver.findElement(By.name("m_status")).isSelected());
        assertFalse(driver.findElement(By.name("hobby")).isSelected());
        {
            List<WebElement> elements = driver.findElements(By.cssSelector(".fieldset:nth-child(6) > .error_p:nth-child(3)"));
            assert (elements.size() > 0);
        }
        {
            List<WebElement> elements = driver.findElements(By.cssSelector(".fieldset:nth-child(7) > .error_p:nth-child(3)"));
            assert (elements.size() > 0);
        }
        {
            List<WebElement> elements = driver.findElements(By.cssSelector(".fieldset:nth-child(8) > .error_p:nth-child(3)"));
            assert (elements.size() > 0);
        }
        {
            List<WebElement> elements = driver.findElements(By.cssSelector(".fieldset:nth-child(11) > .error_p:nth-child(3)"));
            assert (elements.size() > 0);
        }
        {
            List<WebElement> elements = driver.findElements(By.cssSelector(".fieldset:nth-child(12) > .error_p:nth-child(3)"));
            assert (elements.size() > 0);
        }
    }
}
