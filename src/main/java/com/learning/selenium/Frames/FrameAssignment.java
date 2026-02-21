package com.learning.selenium.Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameAssignment {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        driver.findElement(By.linkText("Nested Frames")).click();
        // driver.switchTo().frame(driver.findElement(By.cssSelector("frameset [name='frame-top']")));
        // driver.switchTo().frame(driver.findElement(By.cssSelector("frameset [name='frame-middle']")));
        driver.switchTo().frame("frame-top");
        driver.switchTo().frame("frame-middle");
        System.out.println(driver.findElement(By.id("content")).getText());

    }
}
