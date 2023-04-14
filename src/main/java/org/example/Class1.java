package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize(); // окно расскрывается в полном объеме
        driver.get("https://www.guinnessworldrecords.com/records/apply-to-set-or-break-a-record/");
        ////a[text()='Apply now']/parent::div/../div[2]//a[contains(text()), 'World')]
        driver.findElement(By.id("ez-accept-all")).click();
        Thread.sleep(2000);
        System.out.println(
        driver.findElement
        (By.xpath("//a[text()='Apply now']/parent::div/../div[2]//a[contains(text()), 'World')]")).getText());

    }
}