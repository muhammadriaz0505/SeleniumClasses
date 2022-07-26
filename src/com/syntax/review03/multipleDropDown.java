package com.syntax.review03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class multipleDropDown {
    static String url = "https://demoqa.com/select-menu";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
        //to check whether the dropdown is  multiselect or not
        WebElement mulDD=driver.findElement(By.xpath("//select[@id='cars']"));
        Select select=new Select(mulDD);
        boolean isMultiselect=select.isMultiple();
        System.out.println("Is dropDown is multiselect "+isMultiselect);
        select.selectByIndex(0);
        select.selectByVisibleText("Opel");
        select.selectByValue("saab");
        //Deselect
        Thread.sleep(2000);
        select.deselectByVisibleText("Opel");
        Thread.sleep(2000);
        select.deselectAll();

    }
}