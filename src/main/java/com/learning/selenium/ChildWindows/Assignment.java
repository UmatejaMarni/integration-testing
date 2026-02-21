package com.learning.selenium.ChildWindows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class Assignment {
    public static void main(String[] args){

        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        driver.findElement(By.linkText("Multiple Windows")).click();
        driver.findElement(By.linkText("Click Here")).click();
        Set<String> windows= driver.getWindowHandles();
        Iterator<String> it = windows.iterator();
        String ParentWindow = it.next();
        String ChildOneWindow = it.next();

        driver.switchTo().window(ChildOneWindow);
        System.out.println(driver.findElement(By.className("example")).getText());
        driver.switchTo().window(ParentWindow);
        System.out.println(driver.findElement(By.cssSelector("[class='example'] h3")).getText());


    }


}
