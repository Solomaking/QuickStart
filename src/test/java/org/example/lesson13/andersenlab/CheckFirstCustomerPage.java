package org.example.lesson13.andersenlab;// Generated by Selenium IDE

import org.example.BaseTest;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CheckFirstCustomerPage extends BaseTest {

    @Test
    public void checkCustomerPage() {
        // Open customer page
        driver.get("https://andersenlab.com/");
        driver.manage().window().setSize(new Dimension(1280, 680));
        //cookies
        acceptCookies();
        // Navigate to customers
        Actions action = new Actions(driver);
        var customersElement = driver.findElement(By.xpath("//*[@id=\"gatsby-focus-wrapper\"]/main/section[2]/div/div"));
        action.moveToElement(customersElement).perform();
        // Switch all over the customers
        clickOnElement(driver.findElement(By.cssSelector("li:nth-child(1)")));
        clickOnElement(driver.findElement(By.cssSelector("li:nth-child(2)")));
        clickOnElement(driver.findElement(By.cssSelector("li:nth-child(3)")));
        //Customer window opened
        vars.put("window_handles", driver.getWindowHandles());
        driver.findElement(By.cssSelector(".slick-current .LogosSlider-module--icon--Ejmgt")).click();
        vars.put("win8596", waitForWindow(20000));
        driver.switchTo().window(vars.get("win8596").toString());
        // Header
        {
            List<WebElement> elements = driver.findElements(By.cssSelector(".Header-module--topLine--1L6Tq"));
            assert (elements.size() > 0);
        }
        // Intro
        {
            List<WebElement> elements = driver.findElements(By.id("intro"));
            assert (elements.size() > 0);
        }
        assertEquals(driver.findElement(By.cssSelector(".CaseIntro-module--title--1QRaI")).getText(), "Internal Workflow Tools for a Global Tourism Company");
        // Content
        {
            List<WebElement> elements = driver.findElements(By.cssSelector(".main-module--content--xxBCN"));
            assert (elements.size() > 0);
        }
        // Footer
        {
            List<WebElement> elements = driver.findElements(By.cssSelector(".Footer-module--footer--LZE0a"));
            assert (elements.size() > 0);
        }
        // Copyright
        {
            List<WebElement> elements = driver.findElements(By.cssSelector(".Copyright-module--wrapper--W6PG8"));
            assert (elements.size() > 0);
        }
    }

    private void clickOnElement(WebElement element) {
        new Actions(driver)
                .moveToElement(element)
                .click(element)
                .build()
                .perform();
    }
}
