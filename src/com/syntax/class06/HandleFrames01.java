package com.syntax.class06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFrames01 {
    public static String url = "http://www.uitestpractice.com/Students/Switchto";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.switchTo().frame(0);
        WebElement textBox = driver.findElement(By.id("name"));
        textBox.sendKeys("Batch 13 Forever!!!");
        Thread.sleep(3000);
        driver.switchTo().defaultContent();
        Thread.sleep(3000);
        WebElement alertButton = driver.findElement(By.id("alert"));
        Thread.sleep(3000);
        alertButton.click();

        Alert alert = driver.switchTo().alert();
        Thread.sleep(3000);
        alert.accept();
        Thread.sleep(3000);
        driver.switchTo().frame("iframe_a");
        Thread.sleep(3000);
        textBox.clear();
        textBox.sendKeys("we are back to the frame");

        driver.switchTo().defaultContent();
        Thread.sleep(3000);
        WebElement frameElement = driver.findElement(By.xpath("//iframe[@src = '/Demo.html']"));
        Thread.sleep(3000);
        driver.switchTo().frame(frameElement);
        textBox.clear();
        textBox.sendKeys("Hold your Horses!!!");
    }
}

