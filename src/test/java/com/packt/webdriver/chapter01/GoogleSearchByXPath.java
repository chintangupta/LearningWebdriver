package com.packt.webdriver.chapter01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by chintan on 08/02/2016.
 */
public class GoogleSearchByXPath {
    public static void main (String[] args)
    {
        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.google.com");
        WebElement searchBox = driver.findElement(By.xpath("//*[@id='lst-ib']"));
        searchBox.sendKeys("Searching the internet at midnight");
        searchBox.submit();


    }

}
