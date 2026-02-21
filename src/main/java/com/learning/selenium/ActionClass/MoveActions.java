package com.learning.selenium.ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MoveActions {

    public static void main(String[] args)  {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[data-action-type='DISMISS']")));
        driver.findElement(By.cssSelector("[data-action-type='DISMISS']")).click();
        Actions a = new Actions(driver);
        WebElement searchLocator = driver.findElement(By.id("twotabsearchtextbox"));
        a.moveToElement(searchLocator).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
        a.moveToElement(driver.findElement(By.cssSelector("a[data-nav-ref='nav_ya_signin']"))).contextClick().build().perform();




    }
}
