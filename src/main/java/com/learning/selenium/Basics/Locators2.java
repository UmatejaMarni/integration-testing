package com.learning.selenium.Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class Locators2 {
    public static void main(String[] args) {
        String name = "rahul";

        WebDriver driver = new ChromeDriver();
        String Password = getPassword(driver);
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.manage().window().maximize();
        driver.manage().window().maximize();
        driver.findElement(By.id("inputUsername")).sendKeys(name);
        driver.findElement(By.name("inputPassword")).sendKeys(Password);
        driver.findElement(By.className("signInBtn")).click();//it has 2 classes, used one
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("h2")));
        System.out.println(driver.findElement(By.tagName("h2")).getText());
        Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(), "Hello " + name + ",");
        Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
        driver.findElement(By.xpath("//button[text()='Log Out']"));
        driver.quit();

    }

    public static String getPassword(WebDriver driver) {

        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.findElement(By.linkText("Forgot your password?")).click();
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".reset-pwd-btn")));
        driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
        String PasswordText = driver.findElement(By.cssSelector("form p")).getText();
        String[] PasswordTextArray = PasswordText.split("'");
        return PasswordTextArray[1].split("'")[0];


    }

}
