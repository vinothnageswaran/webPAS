package modules;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Properties;
public class SignInModule {
    public static void Execute(WebDriver driver,Properties OR,String username,String password) throws Exception{
        //driver.findElement(By.linkText(OR.getProperty("signin_text"))).click();
    	
    	WebDriverWait wait = new WebDriverWait(driver, 10);
    	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(OR.getProperty("Logonwebpas"))));
       driver.findElement(By.xpath(OR.getProperty("Logonwebpas"))).sendKeys(username);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(OR.getProperty("Passwordwebpas"))));
       driver.findElement(By.xpath(OR.getProperty("Passwordwebpas"))).sendKeys(password);
     // driver.findElement(By.xpath(OR.getProperty("Loginwebpas"))).click();
    }
}