package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
        driver.findElement(By.id("customer.firstName")).sendKeys("jon");
        driver.findElement(By.id("customer.lastName")).sendKeys("Valley");
        driver.findElement(By.id("customer.address.street")).sendKeys("St 12 jone jones parkway");
        driver.findElement(By.id("customer.address.city")).sendKeys("Arlington");
        driver.findElement(By.id("customer.address.state")).sendKeys("Virginia");
        driver.findElement(By.id("customer.address.zipCode")).sendKeys("22191");
        driver.findElement(By.id("customer.phoneNumber")).sendKeys("111-222-3333");
        driver.findElement(By.id("customer.ssn")).sendKeys("000-00-0000");
        driver.findElement(By.id("customer.username")).sendKeys("username123");
        driver.findElement(By.id("customer.password")).sendKeys("password456");
        driver.findElement(By.id("repeatedPassword")).sendKeys("password456");
        driver.findElement(By.className("button")).click();
        driver.quit();



    }
}
