package com.learning.selenium.Basics;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

//select any checkbox
//grab the label of the selected checkbox
//select the option in dropdown which is fetched from step2
//enter step 2 text in alert example
//click on alert and verify if text grabbed from steps is present alert popup message
public class Assignment3_RealTimeScenariosSection11 {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:/Users/0016YD744/ChromeDriver/chromedriver-win64/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.findElement(By.id("checkBoxOption2")).click();
       // String CheckboxValue = driver.findElement(By.xpath("//label[@for='benz']")).getText().trim();
        String CheckboxValue = driver.findElement(By.xpath("//div[@id='checkbox-example']/fieldset/label[2]")).getText().trim();
        System.out.println(CheckboxValue);
        WebElement dropdownLocator = driver.findElement(By.id("dropdown-class-example"));
        Select dropdown = new Select(dropdownLocator);
        dropdown.selectByVisibleText(CheckboxValue);
        driver.findElement(By.name("enter-name")).sendKeys(CheckboxValue);
        driver.findElement(By.id("alertbtn")).click();
        String alertMsg = driver.switchTo().alert().getText();
        Assert.assertTrue(alertMsg.contains(CheckboxValue));


    }


}
