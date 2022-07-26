package com.syntax.review03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class dropDownreview {

    static String url = "https://www.facebook.com";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
        WebElement createNEwAccButton= driver.findElement(By.xpath("//a[text()='Create new account']"));
        createNEwAccButton.click();
        Thread.sleep(2000);
        //select the birth day from the dropDown on the webPage
        WebElement dayDD= driver.findElement(By.xpath("//select[@id='day']"));
        //select class to deal with drop down
        Select select=new Select(dayDD);
        List<WebElement> availableDays=select.getOptions();
      //  for(WebElement day:availableDays){
          //  System.out.println(day.getText());
       // }
        //select all options one by one a difference of two seconds
       // for(int i=0; i<availableDays.size(); i++){
           // System.out.println( availableDays.get(i).getText());
           // select.selectByIndex(i);
           // Thread.sleep(2000);
      // }
        //select by index the date  3
        select.selectByIndex(2);
        Thread.sleep(200);
        //select by value the date  22
        select.selectByValue("24");
        Thread.sleep(2000
        );
        //select by visible text date 7
        select.selectByVisibleText("7");
    }
}