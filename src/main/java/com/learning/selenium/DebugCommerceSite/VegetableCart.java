package com.learning.selenium.DebugCommerceSite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Arrays;
import java.util.List;

public class VegetableCart {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/");
        driver.manage().window().maximize();
        String[] veggies = {"Brocolli", "Cucumber", "Brinjal"};
        List<String> listNeeded = Arrays.asList(veggies);
        addItems(driver, listNeeded);

    }

    public static void addItems(WebDriver driver, List<String> listNeeded) {

        List<WebElement> productName = driver.findElements(By.cssSelector("[class='product-name']"));
        int count = 0;
        for (int i = 0; i < productName.size(); i++) {

            String[] name =productName.get(i).getText().split("-");
            String formattedProduct = name[0].trim();

            if (listNeeded.contains(formattedProduct)) {
                driver.findElements(By.cssSelector("[class='product-action']")).get(i).click();
                count++;

            }

            if (count==listNeeded.size())
                break;

        }


    }


}
