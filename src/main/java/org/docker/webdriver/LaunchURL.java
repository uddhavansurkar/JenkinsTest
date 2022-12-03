package org.docker.webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LaunchURL {

    @Test()
    public void openAmazon(){
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.amazon.com");
    }

    @Test()
    public void openBackMarket(){
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.backmarket.com");
    }
}
