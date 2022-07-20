package com.syntax.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class Homework01 {
    public static String url = "https://demoqa.com/browser-windows";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        String mainPageHandle= driver.getWindowHandle();
        WebElement newTabButton=driver.findElement(By.xpath("//button[@id='tabButton']"));
        newTabButton.click();
        Set<String> allWindowHandles=driver.getWindowHandles();
        Iterator<String> it=allWindowHandles.iterator();
        mainPageHandle=it.next();
        String newTabHandle=it.next();
        String newTabText=driver.switchTo().window(newTabHandle).findElement(By.id("sampleHeading")).getText();
        System.out.println(newTabText);
        driver.close();
        driver.switchTo().window(mainPageHandle);
        WebElement newWindowButton=driver.findElement(By.id("windowButton"));
        newWindowButton.click();
        allWindowHandles=driver.getWindowHandles();
        it=allWindowHandles.iterator();
        mainPageHandle= it.next();
        String newWindowHandle=it.next();
        String newWindowText=driver.switchTo().window(newWindowHandle).findElement(By.id("sampleHeading")).getText();
        System.out.println(newWindowText);
        driver.close();
        driver.switchTo().window(mainPageHandle);
        WebElement newWindowMessButton=driver.findElement(By.id("messageWindowButton"));
        newWindowMessButton.click();
        allWindowHandles=driver.getWindowHandles();
        it= allWindowHandles.iterator();
        mainPageHandle=it.next();
        






    }
}