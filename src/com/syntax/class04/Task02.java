package com.syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Task02 {
    //TC 1: Amazon link count:
    //Open chrome browser
    //Go to "https://www.amazon.com/"
    //Get all links
    //Get number of links that has text
    //Print to console only the links that has text
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.com");
        Thread.sleep(2000);
        List<WebElement> allLinks=driver.findElements(By.tagName("a"));
        int count=0;
        for(int i=0; i<allLinks.size(); i++){
            String linkText=allLinks.get(i).getText();
            String fullText=allLinks.get(i).getAttribute("href");
            System.out.println(fullText);
            count++;
        }
        System.out.println("Number of links has Text are "+count);
    }
}
