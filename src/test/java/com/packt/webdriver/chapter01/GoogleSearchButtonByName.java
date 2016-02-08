package com.packt.webdriver.chapter01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;

/**
 * Created by chintan on 07/02/2016.
 */
public class GoogleSearchButtonByName {
    public static void main (String[] args01)
    {
        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.google.com");
        WebElement searchBox = driver.findElement(By.name("btnK"));
        searchBox.submit();
    }
}
