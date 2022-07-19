package com.syntax.class06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework02 {
    //Go to https://syntaxprojects.com/javascript-alert-box-demo.php
    //click on each button and handle the alert accordingly
    public static String url=" https://syntaxprojects.com/javascript-alert-box-demo.php";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        WebElement alertButton1= driver.findElement(By.xpath("//button[@onclick='myAlertFunction()']"));
        alertButton1.click();
        Thread.sleep(2000);
        Alert simpleAlert=driver.switchTo().alert();
        simpleAlert.accept();
        WebElement alertButton2=driver.findElement(By.xpath("//button[@onclick='myConfirmFunction()']"));
        alertButton2.click();
        Thread.sleep(2000);
        Alert alertConfirmation=driver.switchTo().alert();
        String confirmAlertText=alertConfirmation.getText();
        System.out.println(confirmAlertText);
        alertConfirmation.dismiss();
        WebElement alertButton3=driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']"));
        alertButton3.click();

        Thread.sleep(2000);
        Alert alertPrompt=driver.switchTo().alert();
        alertPrompt.sendKeys("I am sending my First Prompt Alert");
        alertPrompt.accept();


    }
}
