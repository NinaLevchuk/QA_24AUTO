package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practiklocator {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize(); // окно расскрывается в полном объеме
        //driver.findElement(B) вся работа с локаторами начинается после такого метода
        // (после By. показаны все основыне локатор: id, name, className, tagName )
        driver.get("https://www.guinnessworldrecords.com/records/apply-to-set-or-break-a-record/");
        //driver.findElement()

                //Поиск элемента по ID
        driver.get("https://www.guinnessworldrecords.com/records/apply-to-set-or-break-a-record/");
        driver.findElement(By.id("globe")).click();

        //Поиск элемента по Name
        driver.get("https://uhomki.com.ua/koshki/1074/\n");
        driver.findElement(By.name("q")).sendKeys("Хомяк");

        //Поиск элемента по Link Text
        driver.get("https://www.guinnessworldrecords.com/records/apply-to-set-or-break-a-record/");
        driver.findElement(By.id("ez-accept-all")).click();
        Thread.sleep(2000);
        driver.findElement(By.linkText("APPLICATION PROCESS")).click();
        Thread.sleep(3000);
        driver.quit();

        //Поиск элемента по Partial Text
        driver.get("https://www.guinnessworldrecords.com/records/apply-to-set-or-break-a-record/");
        driver.findElement(By.id("ez-accept-all")).click();
        Thread.sleep(2000);
        driver.findElement(By.partialLinkText("APPLICATION")).click();
        Thread.sleep(3000);
        driver.quit();
    }
}