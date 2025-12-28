package com.learning.selenium.SelIntroduction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Introduction {

public static void main(String[] args){

    WebDriver driver = new ChromeDriver();
    driver.get("https://rahulshettyacademy.com/");
    driver.manage().window().maximize();
    System.out.println(driver.getTitle());
    System.out.println(driver.getCurrentUrl());
    //driver.close();
    driver.quit();









}







}
