package com.syntax.class06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlerts {
    public static String url = "http://www.uitestpractice.com/Students/Switchto";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        Thread.sleep(2000);
        WebElement simpleAlertButton=driver.findElement(By.id("alert"));
        simpleAlertButton.click();
        Thread.sleep(2000);
        Alert simpleAlert=driver.switchTo().alert();
        simpleAlert.accept();
        WebElement confirmAlertButton=driver.findElement(By.id("confirm"));
                confirmAlertButton.click();
        Alert confirmAlert=driver.switchTo().alert();
        String confirmAlertText=confirmAlert.getText();
        confirmAlert.dismiss();
        WebElement promptAlertButton=driver.findElement(By.id("prompt"));
        promptAlertButton.click();
        Alert promptAlert=driver.switchTo().alert();
        promptAlert.sendKeys("Dont replace my Chromedriver!!!");
        promptAlert.accept();

    }
}
