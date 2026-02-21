package com.learning.selenium.MultipleTabs;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class MultipleTabs {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        System.out.println(driver.findElements(By.tagName("a")).size());
        WebElement footerdriver = driver.findElement(By.cssSelector("div[id*='gf-BIG']"));
        System.out.println(footerdriver.findElements(By.tagName("a")).size());
        WebElement firstColFooter = driver.findElement(By.cssSelector("div[id*='gf-BIG'] ul"));
        System.out.println((firstColFooter.findElements(By.tagName("a")).size()));

        for(int i=1;i<firstColFooter.findElements(By.tagName("a")).size();i++){
            String OpenNewTabClick = Keys.chord(Keys.CONTROL,Keys.ENTER);
            firstColFooter.findElements(By.tagName("a")).get(i).sendKeys(OpenNewTabClick);
            Thread.sleep(3000);
        }

        Set<String> windows = driver.getWindowHandles();
        Iterator<String> it = windows.iterator();

        while(it.hasNext()){
            driver.switchTo().window(it.next());
            System.out.println(driver.getTitle());
        }









    }
}
