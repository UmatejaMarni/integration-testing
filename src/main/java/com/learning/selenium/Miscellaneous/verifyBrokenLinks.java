package com.learning.selenium.Miscellaneous;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

public class verifyBrokenLinks {

    public static void main(String[] args) throws IOException, URISyntaxException, InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        //Step 1 - IS to get all urls tied up to the links using Selenium

        //  Java methods will call URL's and gets you the status code

        //if status code >400 then that url is not working-> link which tied to url is broken
        Thread.sleep(5000);

        List<WebElement> links = driver.findElements(By.cssSelector("[class='gf-li'] a"));
        SoftAssert a = new SoftAssert();
        for(WebElement link :links){

            String url = link.getAttribute("href");
            //System.out.print(url);
            HttpURLConnection conn = (HttpURLConnection)new URI(url).toURL().openConnection();
            conn.setRequestMethod("HEAD");
            conn.connect();
            int responsecode = conn.getResponseCode();
            System.out.println(responsecode);
            a.assertTrue(responsecode<400, "the link with text"+link.getText()+"is broken with response code"+responsecode);

        }
         a.assertAll();



    }
    }
