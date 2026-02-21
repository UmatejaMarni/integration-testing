package com.learning.selenium.ChildWindows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class WindowSwitchExample {


    public static void main(String[] args){

        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/loginpagePractise/");
        driver.findElement(By.className("blinkingText")).click();
        Set<String> windows = driver.getWindowHandles();
        Iterator<String> it = windows.iterator();
        String parentWindow = it.next();
        String childWindow = it.next();
        driver.switchTo().window(childWindow);
        System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText());//give . if there is space in class name in css selector
        String email = driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0].split("@")[1].split("\\.")[0];
        System.out.println("email is"+email);
        driver.switchTo().window(parentWindow);
        driver.findElement(By.id("username")).sendKeys(email);
        driver.findElement(By.id("password")).sendKeys("Learning@830$3mK2");
        driver.findElement(By.id("signInBtn")).click();













    }


}
