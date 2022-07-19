package com.syntax.reviewclass02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {
    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
//        launch the website
        driver.get("https://demo.guru99.com/test/radio.html");
        WebElement option3=driver.findElement(By.xpath("//input[@value='Option 3']"));
        boolean state=option3.isSelected();
        System.out.println("the state of the radio button is :"+state);
        // check if hte radio button desplayed
        boolean displayed=option3.isDisplayed();
        System.out.println("the state of the radio button is :"+displayed);
        boolean enabled=option3.isEnabled();
        System.out.println("the state of the radio button is :"+enabled);
        option3.click();
        state=option3.isSelected();
        System.out.println("the state of the radio button is :"+state);

    }
}