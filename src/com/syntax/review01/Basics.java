package com.syntax.review01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basics {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        // go to google.com
       // driver.get("https://google.com"); get wait for the page to be uploaded then do the following tasks
        //go to syntaxprojects.com
      //  driver.get("https://syntaxprojects.com/index.php");
        //click on "start practising"
        //Thread.sleep(2000);
        //WebElement button1=driver.findElement(By.linkText("Start Practising"));
       // button1.click();
       // Thread.sleep(2000);
       // driver.findElement(By.partialLinkText("Proceed")).click();

    }
}
