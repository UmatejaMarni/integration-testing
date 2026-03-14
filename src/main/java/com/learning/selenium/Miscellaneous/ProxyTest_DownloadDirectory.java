package com.learning.selenium.Miscellaneous;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.HashMap;
import java.util.Map;

public class ProxyTest_DownloadDirectory {

    public static void main(String[] args){

        ChromeOptions options = new ChromeOptions();

        //to set proxy
        Proxy proxy = new Proxy();
        proxy.setHttpProxy("localhost:8080");
        options.setCapability("proxy",proxy);
        //to set the download path for file download
        Map<String,Object> prefs = new HashMap<String, Object>() ;
        prefs.put("download.default_directory","/c/Users/0016YD744/Downloads");
        options.setExperimentalOption("prefs",prefs);

        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://expired.badssl.com/");






    }
}
