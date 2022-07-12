package com.syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task01 {
    public static void main(String[] args) {
        //Open chrome browser
        //Go to "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login"
        //Enter valid username and password (username - Admin, password - Hum@nhrm123)
        //Click on login button
        //Then verify Syntax Logo is displayed.
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        WebElement userName=driver.findElement(By.xpath("//input[@id='txtUsername']"));
        userName.sendKeys("Admin");
        WebElement password=driver.findElement(By.xpath("//input[@id='txtPassword']"));
        password.sendKeys("Hum@nhrm123");
        WebElement login=driver.findElement(By.xpath("//input[@id='btnLogin']"));
        login.click();

        WebElement logo= driver.findElement(By.xpath("//img[@src='/humanresources/symfony/web/webres_5acde3dbd3adc6.90334155/themes/default/images/syntax.png']"));
        boolean isLogoDisplayed=logo.isDisplayed();
        if(isLogoDisplayed){
            System.out.println("Yes Logo is displayed");
        }else{
            System.out.println("Logo is not displayed");
        }
        }
    }

