package com.geekbrains.lesson3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

//КЕЙС: Пользователь из Краснодара хочет посмотреть событие в Новосибирске в четверг 3 февраля.

public class AfishaTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://krd.kudago.com");
        //WebDriverWait webDriverWait = new WebDriverWait(driver, 5); //Selenium3
        WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(5));
        //WebElement loginButton = driver.findElement(By.xpath("//button[.='Войти']"));
        //loginButton.click();
        driver.findElement(By.xpath("//*[@id='userzone']/a[1]/span")).click();
        //driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@src, 'login')]")));
        //Thread.sleep(5000);
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//form[@class='authPopup-form tokenized']/input[@name='username']")));
        //driver.findElement(By.xpath("/html/body/div[13]/div/div/div/form[2]/input[1]")).click();
        driver.findElement(By.xpath("//form[@class='authPopup-form tokenized']/input[@name='username']")).sendKeys("bakexol605@dkb3.com");
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//form[@class='authPopup-form tokenized']/input[@name='password']")));
        driver.findElement(By.xpath("//form[@class='authPopup-form tokenized']/input[@name='password']")).sendKeys("ЕИ*01В");
        /*webDriverWait.until(d -> d.findElement(By.id("login")).getAttribute("value").contains("@rambler"));
        Thread.sleep(1000);//сложно разобраться */
        driver.findElement(By.xpath("//form[@class='authPopup-form tokenized']/button[@class='authPopup-button button']")).click();
        Thread.sleep(2000);
        //driver.switchTo().parentFrame();
        driver.findElement(By.xpath("//div[@class='location-switcher']")).click();
        driver.findElement(By.xpath("//a[@id='location-nsk']/span[.='в Новосибирске']")).click();
        driver.findElement(By.xpath("//a[@title='Мероприятия и события в Новосибирске. Куда сходить 3 февраля 2022']")).click();
        driver.findElement(By.xpath("//a[@title='Бесплатные онлайн-уроки по английскому языку в школах Wall Street English']")).click();
        /* List<WebElement> filmsList = driver.findElements(By.xpath("//a[contains(@href, 'movie')]/ancestor::div[@data-test='ITEM']"));
        filmsList.stream().filter(f -> f.getText().contains("Человек-паук")).findFirst().get().click();
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//section[@data-test='PAGE-SECTION TITLE-SECTION']//button[@data-test='BUTTON FAVORITE']")));
        driver.findElement(By.xpath("//section[@data-test='PAGE-SECTION TITLE-SECTION']//button[@data-test='BUTTON FAVORITE']")).click();*/
        Thread.sleep(5000);
        driver.quit();
    }
}
