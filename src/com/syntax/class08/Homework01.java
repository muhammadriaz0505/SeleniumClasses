package com.syntax.class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Homework01 {
    //go to https://the-internet.herokuapp.com/dynamic_controls
    //click on checkbox and click on remove
    //verify the text
    //click on enable verify the textbox is enabled
    //enter text and click disable
    //verify the textbox is disabled
    public static String url = "https://the-internet.herokuapp.com/dynamic_controls";

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        WebElement checkBox=driver.findElement(By.xpath("//*[@type='checkbox']"));
        checkBox.click();
        WebElement removeButton=driver.findElement(By.xpath("//*[@onclick='swapCheckbox()']"));
        removeButton.click();
        WebDriverWait wait=new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//p[@id='message']")));
        WebElement removeText=driver.findElement(By.xpath("//p[@id='message']"));
        boolean text=removeText.isDisplayed();
        System.out.println(text);
        if(text){
            System.out.println("Text is Verified");
        }else{
            System.out.println("Text is not verified");
        }
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//button[text()='Enable']")));
         WebElement enableButton=driver.findElement(By.xpath("//button[text()='Enable']"));
        enableButton.click();
        WebElement enableText=driver.findElement(By.xpath("//p[@id='message']"));
        Boolean buttonEnable=enableButton.isEnabled();
        System.out.println(buttonEnable);
        if(buttonEnable){
            System.out.println("Button is enable");
        }else{
            System.out.println("Button is disable");
        }
        WebElement input=driver.findElement(By.xpath("//input[@type='text']"));
        input.sendKeys("All is well");
        WebElement disableButton=driver.findElement(By.xpath("//button[text()='Disable']"));
        disableButton.click();
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//p[@id='message']")));
        WebElement textDisable=driver.findElement(By.xpath("//p[@id='message']"));
        boolean isTextDisable=textDisable.isDisplayed();
        System.out.println(isTextDisable);
        if(isTextDisable){
            System.out.println("Textbox is disable and it's verified");
        }else{
            System.out.println("Textbox is not disabled");
        }
    }
}