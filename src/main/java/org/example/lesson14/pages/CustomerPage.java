package org.example.lesson14.pages;

import org.example.lesson14.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class CustomerPage extends BasePage {

    public CustomerPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(how = How.CSS, using = ".Header-module--topLine--1L6Tq")
    private WebElement header;

    @FindBy(how = How.ID, using = "intro")
    private WebElement intro;

    @FindBy(how = How.CSS, using = ".main-module--content--xxBCN")
    private WebElement content;

    @FindBy(how = How.CSS, using = ".Footer-module--footer--LZE0a")
    private WebElement footer;

    @FindBy(how = How.CSS, using = ".Copyright-module--wrapper--W6PG8")
    private WebElement copyright;

    public CustomerPage AndCheckIntroText() {
        checkText(intro, "Software Development Company\n" +
                "Take the software path to your digital future\n" +
                "Let’s discuss your project");
        return this;
    }

    public void checkCustomerPageWebElementsPresent() {
        List<WebElement> contentElements = List.of(header, intro, content, footer, copyright);

        checkWebElementsAmount(contentElements, 5);
        contentElements.forEach(this::checkElementPresent);
    }
}
