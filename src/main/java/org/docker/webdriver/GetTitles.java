package org.docker.webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GetTitles {

    @Test()
    public void getAmazonTitle(){
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.amazon.com");
        System.out.println(driver.getTitle());
    }

    @Test()
    public void openBackMarketTitle(){
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.backmarket.com");
        System.out.println(driver.getTitle());
    }
}
