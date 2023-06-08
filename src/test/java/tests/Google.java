package tests;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {

   @Test
    public void test(){
       WebDriver driver = new ChromeDriver();
       driver.get("https://google.com");
       driver.findElement(By.name("q")).sendKeys("selenium" + Keys.ENTER);
   }
}
