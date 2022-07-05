package com.syntax.class02;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Homework3 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver","drivers/geckodriver.exe");
        WebDriver driver=new FirefoxDriver();
        driver.get("https://www.fb.com");
        driver.findElement(By.linkText("Create new account")).click();
        Thread.sleep(3000);
        driver.findElement(By.name("firstname")).sendKeys("Hunza");
        driver.findElement(By.name("lastname")).sendKeys("Valley");
        driver.findElement(By.name("reg_email__")).sendKeys("sahil123@gmail.com");
        driver.findElement(By.name("reg_email_confirmation__")).sendKeys("sahil123@gmail.com");
        driver.findElement(By.name("reg_passwd__")).sendKeys("password123");
        driver.findElement(By.id("month")).sendKeys("may");
        driver.findElement(By.id("day")).sendKeys("20");
        driver.findElement(By.id("year")).sendKeys("1995");
        driver.findElement(By.className("_58mt")).click();
        driver.findElement(By.name("sex")).sendKeys("Male");
        driver.findElement(By.name("websubmit")).click();
        Thread.sleep(5000);
        driver.close();


    }
    }