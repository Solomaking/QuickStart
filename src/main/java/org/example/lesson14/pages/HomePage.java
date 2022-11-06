package org.example.lesson14.pages;

import org.example.lesson14.BasePage;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    private String baseURL = "https://andersenlab.com/";

    @FindBy(how = How.XPATH, using = "//*[@id=\"gatsby-focus-wrapper\"]/div/section/div/button[2]")
    private WebElement cookiesAgreement;

    @FindBy(how = How.CSS, using = ".Header-module--header--NXzL8")
    private WebElement pageHeader;

    @FindBy(how = How.ID, using = "intro")
    private WebElement intro;

    @FindBy(how = How.CSS, using = ".main-module--content--xxBCN")
    private WebElement pageContent;

    @FindBy(how = How.CSS, using = ".Footer-module--footer--LZE0a")
    private WebElement pageFooter;

    @FindBy(how = How.CSS, using = ".Copyright-module--copyright--5ugBB")
    private WebElement pageCopyright;

    public static class HomePageHeader extends HomePage {

        public HomePageHeader(WebDriver driver) {
            super(driver);
        }

        @FindBy(how = How.XPATH, using = "//*[@id=\"gatsby-focus-wrapper\"]/header/div[1]/div[1]")
        private WebElement headerMenuSection;

        @FindBy(how = How.XPATH, using = "//*[@id=\"gatsby-focus-wrapper\"]/header/div[1]/div[2]")
        private WebElement bookACallSection;

        public HomePageHeader AndCheckHeaderMenuPresent() {
            checkElementPresent(headerMenuSection);
            return this;
        }

        public HomePageHeader AndCheckBookACallPresent() {
            checkElementPresent(bookACallSection);
            return this;
        }
    }

    public static class HomePageContent extends HomePage {

        public HomePageContent(WebDriver driver) {
            super(driver);
        }

        @FindBy(how = How.XPATH, using = "//*[@id=\"feature\"]")
        private WebElement feature;

        @FindBy(how = How.XPATH, using = "//*[@id=\"feature\"]/div[1]")
        private WebElement featureContentLeftSection;

        @FindBy(how = How.XPATH, using = "//*[@id=\"feature\"]/div[2]")
        private WebElement featureContentRightSection;

        @FindBy(how = How.XPATH, using = "//*[@id=\"gatsby-focus-wrapper\"]/main/section[2]")
        private WebElement customers;

        @FindBy(how = How.ID, using = "about-us")
        private WebElement aboutUs;

        @FindBy(how = How.ID, using = "collaboration-models")
        private WebElement collaborationModels;

        @FindBy(how = How.ID, using = "concepts-list")
        private WebElement latestProjects;

        @FindBy(how = How.ID, using = "testimonials")
        private WebElement testimonials;

        @FindBy(how = How.ID, using = "technologies")
        private WebElement technologies;

        @FindBy(how = How.ID, using = "industries")
        private WebElement industries;

        @FindBy(how = How.ID, using = "experts")
        private WebElement experts;

        @FindBy(how = How.ID, using = "get-consultation")
        private WebElement consultation;

        public void checkContentWebElementsPresent() {
            List<WebElement> contentElements = List.of(feature, featureContentLeftSection, featureContentRightSection,
                    customers, aboutUs, collaborationModels, latestProjects, testimonials, technologies, industries,
                    experts, consultation);

            checkWebElementsAmount(contentElements, 12);
            contentElements.forEach(this::checkElementPresent);
        }

        @FindBy(how = How.XPATH, using = "//*[@id=\"gatsby-focus-wrapper\"]/main/section[2]/div/div/div/div/div/div/div[5]")
        private WebElement customerIcon;
        @FindBy(how = How.CSS, using = "\"li:nth-child(1)\"")
        private WebElement firstSliderSwitcherOption;

        public CustomerPage AndOpenCustomerPage() {
            Actions action = new Actions(driver);
            action.moveToElement(customers).perform();
            click(customerIcon);
            new PageFactory();
            return PageFactory.initElements(driver, CustomerPage.class);
        }
    }

    public static class HomePageFooter extends HomePage {

        public HomePageFooter(WebDriver driver) {
            super(driver);
        }

        @FindBy(how = How.XPATH, using = "//div[@id='gatsby-focus-wrapper']/footer/section/div/section[3]/div")
        private WebElement contactUs;

        @FindBy(how = How.CSS, using = ".SocialMediaIcon-module--link--NS\\+WC:nth-child(5) > .SocialMediaIcon-module--icon--xnGyY")
        private WebElement socialMedia;

        @FindBy(how = How.XPATH, using = "//*[@class=\"SocialMediaIcon-module--link--NS+WC\"]")
        private List<WebElement> socialMediaList;

        @FindBy(how = How.XPATH, using = "//*[@id=\"gatsby-focus-wrapper\"]/footer/div/div/div/div[2]/a[1]")
        private WebElement socialMediaLink_1;

        @FindBy(how = How.XPATH, using = "//*[@id=\"gatsby-focus-wrapper\"]/footer/div/div/div/div[2]/a[3]")
        private WebElement socialMediaLink_3;

        public HomePageFooter AndCheckFooterContactUsPresent() {
            checkElementPresent(contactUs);
            return this;
        }

        public HomePageFooter AndCheckSocialMediaPresent() {
            checkElementPresent(socialMedia);
            return this;
        }

        public HomePageFooter AndCheckFaceBookLinkPresent() {
            checkElementPresent(socialMediaLink_1);
            return this;
        }

        public HomePageFooter AndCheckLinkedInLinkPresent() {
            checkElementPresent(socialMediaLink_3);
            return this;
        }

        public HomePageFooter AndCheckSocialMediaSize() {
            checkWebElementsAmount(socialMediaList, 8);
            return this;
        }

    }

    // ****PAGE METHODS****

    //Go to Homepage
    public HomePage GivenIAmAtHomePage() {
        driver.get(baseURL);
        driver.manage().window().setSize(new Dimension(1280, 680));
        handleCookies();
        return this;
    }

    public HomePageFooter AndCheckingFooter() {
        new PageFactory();
        return PageFactory.initElements(driver, HomePageFooter.class);
    }

    public HomePageHeader AndCheckingHeader() {
        new PageFactory();
        return PageFactory.initElements(driver, HomePageHeader.class);
    }

    public HomePageContent AndCheckingContent() {
        new PageFactory();
        return PageFactory.initElements(driver, HomePageContent.class);
    }

    // ***METHODS***
    public HomePage AndCheckHeaderPresent() {
        checkElementPresent(pageHeader);
        return this;
    }

    public HomePage AndCheckIntroPresent() {
        checkElementPresent(intro);
        return this;
    }

    public HomePage AndCheckContentPresent() {
        checkElementPresent(pageContent);
        return this;
    }

    public HomePage AndCheckFooterPresent() {
        checkElementPresent(pageFooter);
        return this;
    }

    public HomePage AndCheckCopyrightPresent() {
        checkElementPresent(pageCopyright);
        return this;
    }

    private void handleCookies() {
        if (cookiesAgreement.isDisplayed())
            click(cookiesAgreement);
    }
}
