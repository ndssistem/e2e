package com.reloadbet.base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.safari.SafariDriver;


public class BaseClass {
    WebDriver driver;

    @Before
    public void setUp() {
        String currentBrowser = System.getProperty("selenide.browser", "chrome");
        if ("chrome".equals(currentBrowser)) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        } else if ("firefox".equals(currentBrowser)) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        } else if ("phantomjs".equals(currentBrowser)) {
            WebDriverManager.phantomjs().setup();
            driver = new PhantomJSDriver();
        } else if ("safari".equals(currentBrowser)) {
            driver = new SafariDriver();
        } else if ("edge".equals(currentBrowser)) {
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
        } else if ("ie".equals(currentBrowser)) {
            WebDriverManager.iedriver().setup();
            driver = new InternetExplorerDriver();
        } else if ("htmlunit".equals(currentBrowser)) {
            driver = new HtmlUnitDriver();
        }
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}