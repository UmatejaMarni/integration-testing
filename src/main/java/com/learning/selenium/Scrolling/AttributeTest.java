package com.learning.selenium.Scrolling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.HashMap;
import java.util.List;

public class AttributeTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        WebElement autoselect = driver.findElement(By.cssSelector("[class*='ui-autocomplete-input']"));
        //create a hashmap
        HashMap<String,String> hm = new HashMap<String,String>();
        hm.put("ind", "India");
        hm.put("bri","British Indian Ocean Territory");
        hm.put("Indo","Indonesia");


        String shorthand = "ind";
        autoselect.sendKeys(shorthand);
        Thread.sleep(8000);
        AttributeTest t = new AttributeTest();
        t.autoSelectDropdown(driver,hm.get(shorthand));
        System.out.println(autoselect.getAttribute("value"));
    }

    public void autoSelectDropdown(WebDriver driver,String country){
        List<WebElement> dropdown = driver.findElements(By.cssSelector(".ui-menu-item-wrapper"));
        for(WebElement a: dropdown)
        {
            if(a.getText().equalsIgnoreCase(country))
                a.click();
        }
    }
}
