package com.syntax.class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework01 {
    //Navigate to https://syntaxprojects.com/bootstrap-iframe.php
    //verify the header text Sorry, We Couldn't Find Anything For "Asksn" is displayed
    //verify enroll today button is enabled
    public static String url = "https://syntaxprojects.com/bootstrap-iframe.php";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.switchTo().frame(0);
        driver.manage().window().maximize();
        Thread.sleep(2000);
        WebElement header = driver.findElement(By.xpath("//h1[@class='heading-13']"));
        boolean headerText=header.isDisplayed();
        if(header.equals("Sorry, We Couldn't Find Anything for Asksn")){
            System.out.println("Header is displayed");
        }else{
            System.out.println("Header is not displayed");
        }
        driver.switchTo().defaultContent();
        driver.switchTo().frame("FrameTwo");
        WebElement enableButton=driver.findElement(By.xpath("//div[text()='Enroll today'][1]"));
        boolean enabled=enableButton.isEnabled();
        System.out.println(enabled);
        if(enabled){
            System.out.println("The button is enabled");
        }else{
            System.out.println("button is not enabled");
        }
    }
}
