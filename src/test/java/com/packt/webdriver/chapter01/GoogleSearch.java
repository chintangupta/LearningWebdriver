package com.packt.webdriver.chapter01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by chintan on 07/02/2016.
 */
public class GoogleSearch {
    public static void main(String[] args01)
    {
        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.google.com");
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("Learning Selenium at Night");
        searchBox.submit();
    }
}
