package com.learning.selenium.Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.List;
//Handling static dropdowns  - selectbyindex,selectbyvisibletext,selectbyvalue,We can deselect when dropdown has option to select multiple values - done
//Handling Dynamic dropdowns - by.xpath("//a[@value='BLR']) - done
//parent child relationship xpath - if there are 2 xpaths with same value the use this - done
//Auto suggestive xpath - for each loop - done
//Handling checkboxes  - isSelected and checkbox size - done
//handling calendar - use class which is active for current date - done
//verify Enabled/Disabled - isenabled is not working properly for calendar or something, so identify something diff from html
//Handling Radio buttons - just click them - done
//Handling text buttons - xpath using text - cant be done with css - not inlcuded in below program

public class FlightAutomationE2E {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise");
        driver.manage().window().maximize();
        //auto suggestive dropdown
        driver.findElement(By.cssSelector("input#autosuggest")).sendKeys("ind");
        Thread.sleep(5000);
        List<WebElement> autoselectDropdownLocator = driver.findElements(By.className("ui-corner-all"));
        for(WebElement a:autoselectDropdownLocator){
            if((a.getText()).equalsIgnoreCase("INDIA"))
                a.click();
        }
        //radio button
        driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();
        //dynamic dropdown and parent child relationship xpath
        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
        driver.findElement(By.cssSelector("#ctl00_mainContent_ddl_originStation1_CTNR [value='BLR']")).click();
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("#ctl00_mainContent_ddl_destinationStation1_CTNR [value='MAA']")).click();
        //active date selection in calendar
        Thread.sleep(5000);
        driver.findElement(By.className("ui-datepicker-current-day")).click();
        //Assert.assertFalse(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled()); - not working
        Assert.assertTrue(driver.findElement(By.id("Div1")).getDomAttribute("Style").contains("0.5"));
        //just normal dropdown click and do some other actions like increasing count
        driver.findElement(By.id("divpaxinfo")).click();
        Thread.sleep(5000);
        for(int i=1;i<5;i++){
            driver.findElement(By.id("hrefIncAdt")).click();
        }
        driver.findElement(By.id("btnclosepaxoption")).click();
        System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
        //static dropdown
        WebElement dropdownSelector = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
        Select dropdown = new Select(dropdownSelector);
        dropdown.selectByVisibleText("INR");
        dropdown.selectByIndex(2);
        dropdown.selectByValue("USD");
        System.out.println(dropdown.getFirstSelectedOption().getText());
        //checkbox
        System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
        driver.findElement(By.name("ctl00$mainContent$chk_friendsandfamily")).click();
        Assert.assertTrue(driver.findElement(By.name("ctl00$mainContent$chk_friendsandfamily")).isSelected());
        driver.findElement(By.xpath("//input[@value='Search']")).click();
        driver.quit();
    }
}
