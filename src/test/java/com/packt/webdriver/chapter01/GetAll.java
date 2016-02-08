package com.packt.webdriver.chapter01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by chintan on 08/02/2016.
 */
public class GetAll {
    public static void main (String[] args)
    {
        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.google.com");
        WebElement searchButton = driver.findElement(By.name("btnK"));
        System.out.println(searchButton.getSize());
        System.out.println(searchButton.getText()); //no text available
        System.out.println(searchButton.getTagName());
        System.out.println(searchButton.isDisplayed());
        System.out.println(searchButton.isEnabled());
    }
}
