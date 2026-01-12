package com.learning.selenium.SelIntroduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class Locators {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.manage().window().maximize();
        driver.findElement(By.id("inputUsername")).sendKeys("rahul");
        driver.findElement(By.name("inputPassword")).sendKeys("hello123");
        driver.findElement(By.className("signInBtn")).click();//it has 2 classes, used one
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
        driver.findElement(By.linkText("Forgot your password?")).click();
        driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("john");
        driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("john@rsp.com");
        driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
        driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("john@gmail.com");
        driver.findElement(By.xpath("//form/input[3]")).sendKeys("123456789");
        driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
        System.out.println(driver.findElement(By.cssSelector("form p")).getText());
        driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
        driver.findElement(By.cssSelector("#inputUsername")).sendKeys("rahul");
        driver.findElement(By.cssSelector("input[type*=pass]")).sendKeys("rahulshettyacademy");
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));//didnt work for ElementClickInterceptedException
        //Thread.sleep(1000);//worked to handle ElementClickInterceptedException i.e., since page is shifting/overlapping
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(15)); //worked for ElementClickInterceptedException
        WebElement chkbox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("chkboxOne")));
        chkbox.click();
        driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
        driver.quit();//driver.close gave WebSocket Connection Reset error since browser process ends before Selenium finishes its communication


    }
}
