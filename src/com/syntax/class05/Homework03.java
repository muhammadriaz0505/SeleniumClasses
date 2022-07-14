package com.syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.Iterator;
import java.util.List;

public class Homework03 {
    public static String url="https://ebay.com";

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get(url);
        WebElement categoryDD=driver.findElement(By.xpath("//select[@id='gh-cat']"));
        Select select=new Select(categoryDD);
        List<WebElement> options=select.getOptions();
        Iterator<WebElement> it=options.iterator();
        while (it.hasNext()){
            WebElement ddOption=it.next();
            String optionsText=ddOption.getText();
            System.out.println(optionsText);
            select.selectByValue("58058");
        }

    }
}
