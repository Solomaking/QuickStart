package org.example.lesson13.andersenlab;// Generated by Selenium IDE

import org.example.BaseTest;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;

import java.util.List;

public class PageStructureTest extends BaseTest {
    @Test
    public void checkPageStructure() {
        driver.get("https://andersenlab.com/");
        driver.manage().window().setSize(new Dimension(1280, 680));
        {
            List<WebElement> elements = driver.findElements(By.cssSelector(".Header-module--header--NXzL8"));
            assert (elements.size() > 0);
        }
        {
            List<WebElement> elements = driver.findElements(By.xpath("//*[@id=\"gatsby-focus-wrapper\"]/header/div[1]/div[1]"));
            assert (elements.size() > 0);
        }
        {
            List<WebElement> elements = driver.findElements(By.xpath("//*[@id=\"gatsby-focus-wrapper\"]/header/div[1]/div[2]"));
            assert (elements.size() > 0);
        }
        {
            List<WebElement> elements = driver.findElements(By.id("intro"));
            assert (elements.size() > 0);
        }
        {
            List<WebElement> elements = driver.findElements(By.cssSelector(".main-module--content--xxBCN"));
            assert (elements.size() > 0);
        }
        {
            List<WebElement> elements = driver.findElements(By.cssSelector(".Feature-module--column--fYdYo:nth-child(1)"));
            assert (elements.size() > 0);
        }
        {
            List<WebElement> elements = driver.findElements(By.cssSelector(".Feature-module--column--fYdYo:nth-child(2)"));
            assert (elements.size() > 0);
        }
        {
            List<WebElement> elements = driver.findElements(By.cssSelector(".container-module--container--Vz3Mn:nth-child(2)"));
            assert (elements.size() > 0);
        }
        {
            List<WebElement> elements = driver.findElements(By.id("about-us"));
            assert (elements.size() > 0);
        }
        {
            List<WebElement> elements = driver.findElements(By.id("collaboration-models"));
            assert (elements.size() > 0);
        }
        {
            List<WebElement> elements = driver.findElements(By.id("concepts-list"));
            assert (elements.size() > 0);
        }
        {
            List<WebElement> elements = driver.findElements(By.id("testimonials"));
            assert (elements.size() > 0);
        }
        {
            List<WebElement> elements = driver.findElements(By.id("technologies"));
            assert (elements.size() > 0);
        }
        {
            List<WebElement> elements = driver.findElements(By.id("industries"));
            assert (elements.size() > 0);
        }
        {
            List<WebElement> elements = driver.findElements(By.id("experts"));
            assert (elements.size() > 0);
        }
        {
            List<WebElement> elements = driver.findElements(By.id("get-consultation"));
            assert (elements.size() > 0);
        }
        {
            List<WebElement> elements = driver.findElements(By.cssSelector(".Footer-module--footer--LZE0a"));
            assert (elements.size() > 0);
        }
        {
            List<WebElement> elements = driver.findElements(By.cssSelector(".Footer-module--contactUs--6nPqr > .Footer-module--sectionContent--rc-hw"));
            assert (elements.size() > 0);
        }
        {
            List<WebElement> elements = driver.findElements(By.cssSelector(".SocialMediaIcon-module--link--NS\\+WC:nth-child(5) > .SocialMediaIcon-module--icon--xnGyY"));
            assert (elements.size() > 0);
        }
        {
            List<WebElement> elements = driver.findElements(By.cssSelector(".SocialMediaIcon-module--link--NS\\+WC:nth-child(1) path"));
            assert (elements.size() > 0);
        }
        {
            List<WebElement> elements = driver.findElements(By.cssSelector(".SocialMediaIcon-module--link--NS\\+WC:nth-child(3) > .SocialMediaIcon-module--icon--xnGyY"));
            assert (elements.size() > 0);
        }
        {
            List<WebElement> elements = driver.findElements(By.cssSelector(".Copyright-module--copyright--5ugBB"));
            assert (elements.size() > 0);
        }
    }
}
