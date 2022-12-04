package org.docker.webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LaunchURL {

    WebDriver driver = null;
    @BeforeClass()
    public void launchBrowser(){
        System.setProperty("webdriver.edge.driver",
                "C:\\Users\\uddha\\Downloads\\edgedriver_win64\\msedgedriver.exe");
        driver = new EdgeDriver();
    }

    @Test()
    public void openAmazon(){
        driver.get("http://www.amazon.com");
    }

    @Test()
    public void openBackMarket(){
        driver.get("http://www.backmarket.com");
    }

    @AfterClass()
    public void closeBrowser(){
        driver.close();
    }
}
