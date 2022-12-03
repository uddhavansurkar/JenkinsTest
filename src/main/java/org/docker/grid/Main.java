package org.docker.grid;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.net.MalformedURLException;
import java.net.URL;

public class Main {
    public static void main(String[] args) throws MalformedURLException {
        System.out.println( "Hello World!" );
        URL url = new URL("http://localhost:4444/wd/hub");
        DesiredCapabilities cap= new DesiredCapabilities();
        cap.setCapability("browserName", "chrome");
        RemoteWebDriver driver = new RemoteWebDriver(url,cap);
        driver.get("http://www.google.com");
        System.out.println(driver.getTitle());
    }
}