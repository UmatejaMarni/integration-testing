package com.learning.selenium.Calendar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.List;

public class CalendarExample {
    public static void main(String[] args) throws InterruptedException {

        String date = "17";
        String month = "6";
        String Year = "2027";
        String[] ExpectedList = {month,date,Year};

        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
        driver.findElement(By.cssSelector(".react-date-picker__inputGroup__year")).click();
        driver.findElement(By.cssSelector(".react-calendar__navigation__label")).click();
        driver.findElement(By.cssSelector(".react-calendar__navigation__label")).click();
        driver.findElement(By.xpath("//button[text()='"+Year+"']")).click();
        Thread.sleep(2000);
        driver.findElements(By.cssSelector(".react-calendar__year-view__months__month")).get(Integer.parseInt(month)-1).click();
        driver.findElement(By.xpath("//abbr[text()='"+date+"']")).click();
        List<WebElement> deliveryDateList = driver.findElements(By.cssSelector("input[class*='react-date-picker__inputGroup__input']"));
        for(int i=0;i<deliveryDateList.size();i++){

            System.out.println(deliveryDateList.get(i).getDomAttribute("value"));
            Assert.assertEquals(deliveryDateList.get(i).getDomAttribute("value"),ExpectedList[i]);


        }




    }




}
