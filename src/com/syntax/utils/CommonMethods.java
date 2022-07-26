package com.syntax.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CommonMethods {
    WebDriver driver=new ChromeDriver();
    public void openBrowser(String url){
      driver.get(url);
    }
    public void closeBrowser(){
        driver.quit();
    }
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        CommonMethods commonMethods=new CommonMethods();
        commonMethods.openBrowser("http://www.google.com");
        Thread.sleep(2000);
        commonMethods.closeBrowser();
    }

    }


