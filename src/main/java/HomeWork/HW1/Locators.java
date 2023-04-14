package HomeWork.HW1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
    public static void main (String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //driver.findElement(B) вся работа с локаторами начинается после такого метода
        // (после By. показаны все основыне локатор: id, name, className, tagName )
        driver.get("https://uhomki.com.ua/koshki/1074/\n");
        driver.findElement(By.name("q")).sendKeys("Хомяк");
}
}
