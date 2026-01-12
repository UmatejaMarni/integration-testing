package com.learning.selenium.SelIntroduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2 {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/angularpractice/");
        driver.findElement(By.cssSelector("div[class='form-group'] input[name='name']")).sendKeys("Rahul");
        driver.findElement(By.cssSelector("input[name='email']")).sendKeys("Rahul.Shetty@gmail.com");
        driver.findElement(By.id("exampleInputPassword1")).sendKeys("rahulshetty@123");
        driver.findElement(By.id("exampleCheck1")).click();
        WebElement dropdownLocator = driver.findElement(By.id("exampleFormControlSelect1"));
        Select dropdown = new Select(dropdownLocator);
        dropdown.selectByVisibleText("Female");
        driver.findElement(By.id("inlineRadio1")).click();
        driver.findElement(By.cssSelector("[name='bday']")).sendKeys("20-10-1996");
        driver.findElement(By.cssSelector("[value='Submit']")).click();
        System.out.println(driver.findElement(By.cssSelector("div.alert")).getText());


    }

}
