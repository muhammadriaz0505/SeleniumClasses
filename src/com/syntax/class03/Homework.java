package com.syntax.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://syntaxprojects.com/");
        driver.manage().window().maximize();
        Thread.sleep(5000);
        WebElement startPractising=driver.findElement(By.xpath("//a[@id='btn_basic_example']"));
        startPractising.click();
        Thread.sleep(5000);
        WebElement simpleFormDemo=driver.findElement(By.xpath("(//a[text()='Simple Form Demo'])[2]"));
        simpleFormDemo.click();
        Thread.sleep(5000);
        WebElement enterMessage=driver.findElement(By.xpath("//input[@placeholder='Please enter your Message']"));
        enterMessage.sendKeys("This is my first time using Xpath.");
        Thread.sleep(3000);
        WebElement showMessage=driver.findElement(By.xpath("//button[text()='Show Message']"));
        showMessage.click();
        Thread.sleep(5000);
        driver.quit();

    }
}
