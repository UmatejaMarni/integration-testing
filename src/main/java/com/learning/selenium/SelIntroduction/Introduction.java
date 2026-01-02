package com.learning.selenium.SelIntroduction;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;

public class Introduction {

public static void main(String[] args){


    WebDriver driver = new ChromeDriver();
    driver.manage().window().setSize(new Dimension(1920,1080)); // worked in asus also
    driver.get("https://rahulshettyacademy.com/");


    //chromeoptions worked in my asus laptop also to maximize chrome
    /*ChromeOptions options = new ChromeOptions();
    options.addArguments("start-maximized");
    WebDriver driver = new ChromeDriver(options);
    driver.get("https://rahulshettyacademy.com/");*/

    //driver.manage().window().maximize(); //this didnt work in asus laptop
    //driver.manage().window().fullscreen(); //this didnt work in asus laptop



    System.out.println(driver.getTitle());
    System.out.println(driver.getCurrentUrl());
    //driver.close(); //closed the current windows
    driver.quit(); //closed all windows









}







}
