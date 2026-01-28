package com.learning.selenium.SeleniumWaits;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class ExplicitWait_Assignment {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/loginpagePractise/");
        driver.findElement(By.name("username")).sendKeys("rahulshettyacademy");
        driver.findElement(By.id("password")).sendKeys("Learning@830$3mK2");
        //driver.findElement(By.xpath("//input[@value='user']//following::*[@class='checkmark']")).click();
        driver.findElement(By.cssSelector(".customradio:nth-child(2)")).click();
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
        WebElement okayBtn= wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn")));
        okayBtn.click();
        WebElement drpdownLocator = driver.findElement(By.cssSelector("select[class='form-control']"));
        Select dropdown = new Select(drpdownLocator);
        dropdown.selectByVisibleText("Consultant");
        driver.findElement(By.id("terms")).click();
        driver.findElement(By.id("signInBtn")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button[class*='btn-info']")));
        List<WebElement> buttonLocator = driver.findElements(By.cssSelector("button[class*='btn-info']"));
        for(WebElement a:buttonLocator ){
            a.click();
        }
        driver.findElement(By.partialLinkText("Checkout")).click();
        //driver.quit();

    }
}
