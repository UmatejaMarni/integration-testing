package com.learning.selenium.Scrolling;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Assignment {

    public static void main(String[] args){
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,650)");
       /* System.out.println("number of rows are " +driver.findElements(By.cssSelector("[name='courses'] tr")).size());
        System.out.println("number of columns are " +driver.findElements(By.cssSelector("[name='courses'] tr th")).size());
        System.out.println(driver.findElement(By.cssSelector("[name='courses'] tr:nth-child(3)")).getText());*/

        WebElement table = driver.findElement(By.name("courses"));
        System.out.println(table.findElements(By.tagName("tr")).size());
        System.out.println(table.findElements(By.tagName("tr")).get(0).findElements(By.tagName("th")).size());
        List<WebElement> secondRow = driver.findElements(By.tagName("tr")).get(2).findElements(By.tagName("td"));
        System.out.println(secondRow.get(0).getText());
        System.out.println(secondRow.get(1).getText());
        System.out.println(secondRow.get(2).getText());









    }
}
