package com.syntax.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class HW01 {
    public static String url="https://demoqa.com/browser-windows";

    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver","drivers/geckodriver.exe");
        WebDriver driver=new FirefoxDriver();
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        String mainPageHandle=driver.getWindowHandle();
        WebElement tabButton= driver.findElement(By.xpath("//button[@id='tabButton']"));
        tabButton.click();
        WebElement windowButton= driver.findElement(By.xpath("//button[@id='windowButton']"));
        windowButton.click();
        WebElement windowMessageButton= driver.findElement(By.xpath("//button[@id='messageWindowButton']"));
        windowMessageButton.click();
        Set<String> allWindowHandles=driver.getWindowHandles();
        Iterator<String> it=allWindowHandles.iterator();
        while (it.hasNext()){
            String handle= it.next();
            if(!mainPageHandle.equals(handle)){
                driver.switchTo().window(handle);
                WebElement text= driver.findElement(By.xpath("//body"));
                String pageText=text.getText();
                System.out.println(pageText);
                System.out.println(text);
                String title=driver.getTitle();
                if(title.isEmpty()){
                    System.out.println("There is no title");
                }else{
                    System.out.println(title);
                }

            }
        }

    }
}
