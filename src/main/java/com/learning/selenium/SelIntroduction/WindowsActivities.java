package com.learning.selenium.SelIntroduction;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsActivities {

    public static void main(String[] args){

        WebDriver driver = new ChromeDriver();
        driver.manage().window().setSize(new Dimension(1920,1080));
        driver.get("https://www.google.com");//waits untill page is completely loaded
        driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");//it doesnt wait until entire page is loaded, selenium just moves to next command
        driver.navigate().back();
        driver.navigate().forward();
        driver.quit();










    }








}
