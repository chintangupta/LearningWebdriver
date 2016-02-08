package com.packt.webdriver.chapter01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.List;

/**
 * Created by chintan on 07/02/2016.
 */
public class GoogleSearchPageByTagName {
    public static void main(String[] args)
    {
        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.google.com");
        List<WebElement> input = driver.findElements(By.tagName("input"));
        System.out.println(input.size());
    }
}
