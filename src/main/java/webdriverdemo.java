import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class webdriverdemo {
   public static void main(String[] args) {
   
      WebDriver driver = new FirefoxDriver();
      //Puts an Implicit wait, Will wait for 10 seconds before throwing exception
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      
      //Launch website
      driver.navigate().to("http://www.calculator.net/");
      
      //Maximize the browser
      driver.manage().window().maximize();
      
      // Click on Percent Calculators
      driver.findElement(By.xpath(".//*[@id = 'hl3']/li[3]/a")).click();
      
      // TEST 1
      ///////////////////////////////////////////////////////////////////////////////
      
      // Enter value 10 in the first number of the percent Calculator
      driver.findElement(By.id("cpar1")).sendKeys("10");
      
      // Enter value 50 in the second number of the percent Calculator
      driver.findElement(By.id("cpar2")).sendKeys("50");
      
      // Click Calculate Button
      driver.findElement(By.xpath(".//*[@id = 'content']/table/tbody/tr[2]/td/input[2]")).click();
      
      // Get the Result Text based on its xpath
      String result = driver.findElement(By.xpath(".//*[@id = 'content']/p[2]/font/b")).getText();
      
      // Print a Log In message to the screen
      System.out.println(" The Result is " + result);
      
      // Click on Clear Button
      driver.findElement(By.xpath(".//*[@id = 'content']/table/tbody/tr[2]/td/img")).click();

      // TEST 2
      ///////////////////////////////////////////////////////////////////////////////
      
      // Enter value 10 in the first number of the percent Calculator
      driver.findElement(By.id("cpar1")).sendKeys("-10");
      
      // Enter value 50 in the second number of the percent Calculator
      driver.findElement(By.id("cpar2")).sendKeys("-50");
      
      // Click Calculate Button
      driver.findElement(By.xpath(".//*[@id = 'content']/table/tbody/tr[2]/td/input[2]")).click();
      
      // Get the Result Text based on its xpath
      result = driver.findElement(By.xpath(".//*[@id = 'content']/p[2]/font/b")).getText();
      
      // Print a Log In message to the screen
      System.out.println(" The Result is " + result);
      
      // Click on Clear Button
      driver.findElement(By.xpath(".//*[@id = 'content']/table/tbody/tr[2]/td/img")).click();
      
      // TEST 3
      ///////////////////////////////////////////////////////////////////////////////
      
      // Enter value 10 in the first number of the percent Calculator
      driver.findElement(By.id("cpar1")).sendKeys("10");
      
      // Enter value 50 in the second number of the percent Calculator
      driver.findElement(By.id("cpar2")).sendKeys("0");
      
      // Click Calculate Button
      driver.findElement(By.xpath(".//*[@id = 'content']/table/tbody/tr[2]/td/input[2]")).click();
      
      // Get the Result Text based on its xpath
      result = driver.findElement(By.xpath(".//*[@id = 'content']/p[2]/font/b")).getText();
      
      // Print a Log In message to the screen
      System.out.println(" The Result is " + result);
      
      // Click on Clear Button
      driver.findElement(By.xpath(".//*[@id = 'content']/table/tbody/tr[2]/td/img")).click();
      
      // TEST 4
      ///////////////////////////////////////////////////////////////////////////////
      
      // Enter value 10 in the first number of the percent Calculator
      driver.findElement(By.id("cpar1")).sendKeys("0");
      
      // Enter value 50 in the second number of the percent Calculator
      driver.findElement(By.id("cpar2")).sendKeys("10");
      
      // Click Calculate Button
      driver.findElement(By.xpath(".//*[@id = 'content']/table/tbody/tr[2]/td/input[2]")).click();
      
      // Get the Result Text based on its xpath
      result = driver.findElement(By.xpath(".//*[@id = 'content']/p[2]/font/b")).getText();
      
      // Print a Log In message to the screen
      System.out.println(" The Result is " + result);
      
      // Click on Clear Button
      driver.findElement(By.xpath(".//*[@id = 'content']/table/tbody/tr[2]/td/img")).click();
      
      // TEST 5
      ///////////////////////////////////////////////////////////////////////////////
      
      // Enter value 10 in the first number of the percent Calculator
      driver.findElement(By.id("cpar1")).sendKeys("0");
      
      // Enter value 50 in the second number of the percent Calculator
      driver.findElement(By.id("cpar2")).sendKeys("0");
      
      // Click Calculate Button
      driver.findElement(By.xpath(".//*[@id = 'content']/table/tbody/tr[2]/td/input[2]")).click();
      
      // Get the Result Text based on its xpath
      result = driver.findElement(By.xpath(".//*[@id = 'content']/p[2]/font/b")).getText();
      
      // Print a Log In message to the screen
      System.out.println(" The Result is " + result);
      
      // Click on Clear Button
      driver.findElement(By.xpath(".//*[@id = 'content']/table/tbody/tr[2]/td/img")).click();
      
      // TEST 6
      ///////////////////////////////////////////////////////////////////////////////
      
      // Enter value 10 in the first number of the percent Calculator
      driver.findElement(By.id("cpar1")).sendKeys("word");
      
      // Enter value 50 in the second number of the percent Calculator
      driver.findElement(By.id("cpar2")).sendKeys("10");
      
      // Click Calculate Button
      driver.findElement(By.xpath(".//*[@id = 'content']/table/tbody/tr[2]/td/input[2]")).click();
      
      // Get the Result Text based on its xpath
      result = driver.findElement(By.xpath(".//*[@id = 'content']/p[2]/font/b")).getText();
      
      // Print a Log In message to the screen
      System.out.println(" The Result is " + result);
      
      // Click on Clear Button
      driver.findElement(By.xpath(".//*[@id = 'content']/table/tbody/tr[2]/td/img")).click();
      
     
      //Close the Browser.
      driver.close();
   }
}