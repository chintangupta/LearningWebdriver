package com.packt.webdriver.chapter01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by chintan on 08/02/2016.
 */
public class GoogleSearchByPartialLinkText {
    public static void main (String[] args)
    {
        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.google.com");
        WebElement aboutLink = driver.findElement(By.partialLinkText("About"));
        aboutLink.click();
    }
}
