package com.syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task03 {
    //HRMS Application Negative Login:
    //Open chrome browser
    //Go to "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login"
    //Enter valid username
    //Leave password field empty
    //Click on login button
    //Verify error message with text "Password cannot be empty" is displayed.
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        WebElement userName=driver.findElement(By.xpath("//input[@id='txtUsername']"));
        userName.sendKeys("Admin");
        WebElement login=driver.findElement(By.xpath("//input[@type='submit']"));
        login.click();
        WebElement errorMessage=driver.findElement(By.xpath("//span[@id='spanMessage']"));
        String actualErrorMessage=errorMessage.getText();
        if(errorMessage.isDisplayed()){
            if(actualErrorMessage.equals("Password cannot be empty")){
                System.out.println("Error Message is correct");
            }
        }
    }
}
