import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;


import org.junit.Test;
import org.junit.BeforeClass;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;


public class TestCalculator {
	private static WebDriver driver = new FirefoxDriver();
	@BeforeClass
	public static void openSelenium() {
	      //Puts an Implicit wait, Will wait for 10 seconds before throwing exception
	      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	      
	      //Launch website
	      driver.navigate().to("http://www.calculator.net/");
	      
	      //Maximize the browser
	      driver.manage().window().maximize();
	      
	      // Click on Percent Calculators
	      driver.findElement(By.xpath(".//*[@id = 'hl3']/li[3]/a")).click();
	}
    @Test
    public void testPositivePositive() {
    	
    	// Enter value 10 in the first number of the percent Calculator
	      driver.findElement(By.id("cpar1")).sendKeys("10");
	      
	      // Enter value 50 in the second number of the percent Calculator
	      driver.findElement(By.id("cpar2")).sendKeys("50");
	      
	      // Click Calculate Button
	      driver.findElement(By.xpath(".//*[@id = 'content']/table/tbody/tr[2]/td/input[2]")).click();
	      
	      //Click on Clear Button
	      driver.findElement(By.xpath(".//*[@id = 'content']/table/tbody/tr[2]/td/img")).click();
	      
	      // Get the Result Text based on its xpath
	      String result =
	         driver.findElement(By.xpath(".//*[@id = 'content']/p[2]/font/b")).getText();
	      
	      assertEquals("5", result);
    }
    @Test
    public void testNegativeNegative() {
    	
    	// Enter value 10 in the first number of the percent Calculator
	      driver.findElement(By.id("cpar1")).sendKeys("-10");
	      
	      // Enter value -50 in the second number of the percent Calculator
	      driver.findElement(By.id("cpar2")).sendKeys("-50");
	      
	      // Click Calculate Button
	      driver.findElement(By.xpath(".//*[@id = 'content']/table/tbody/tr[2]/td/input[2]")).click();
	      
	      //Click on Clear Button
	      driver.findElement(By.xpath(".//*[@id = 'content']/table/tbody/tr[2]/td/img")).click();
	      
	      // Get the Result Text based on its xpath
	      String result =
	         driver.findElement(By.xpath(".//*[@id = 'content']/p[2]/font/b")).getText();
	      
	      assertEquals("5", result);
    }
    @Test
    public void testPositiveZero() {
    	
    	// Enter value -10 in the first number of the percent Calculator
	      driver.findElement(By.id("cpar1")).sendKeys("10");
	      
	      // Enter value 50 in the second number of the percent Calculator
	      driver.findElement(By.id("cpar2")).sendKeys("0");
	      
	      // Click Calculate Button
	      driver.findElement(By.xpath(".//*[@id = 'content']/table/tbody/tr[2]/td/input[2]")).click();
	      
	      //Click on Clear Button
	      driver.findElement(By.xpath(".//*[@id = 'content']/table/tbody/tr[2]/td/img")).click();
	      
	      // Get the Result Text based on its xpath
	      String result =
	         driver.findElement(By.xpath(".//*[@id = 'content']/p[2]/font/b")).getText();
	      
	      assertEquals("0", result);
    }
    @Test
    public void testZeroPositive() {
    	
    	// Enter value -10 in the first number of the percent Calculator
	      driver.findElement(By.id("cpar1")).sendKeys("0");
	      
	      // Enter value -50 in the second number of the percent Calculator
	      driver.findElement(By.id("cpar2")).sendKeys("10");
	      
	      // Click Calculate Button
	      driver.findElement(By.xpath(".//*[@id = 'content']/table/tbody/tr[2]/td/input[2]")).click();
	      
	      //Click on Clear Button
	      driver.findElement(By.xpath(".//*[@id = 'content']/table/tbody/tr[2]/td/img")).click();
	      
	      // Get the Result Text based on its xpath
	      String result =
	         driver.findElement(By.xpath(".//*[@id = 'content']/p[2]/font/b")).getText();
	      
	      assertEquals("0", result);
    }
    @Test
    public void testZeroZero() {
    	
    	// Enter value test in the first number of the percent Calculator
	      driver.findElement(By.id("cpar1")).sendKeys("0");
	      
	      // Enter value test in the second number of the percent Calculator
	      driver.findElement(By.id("cpar2")).sendKeys("0");
	      
	      // Click Calculate Button
	      driver.findElement(By.xpath(".//*[@id = 'content']/table/tbody/tr[2]/td/input[2]")).click();
	      
	      //Click on Clear Button
	      driver.findElement(By.xpath(".//*[@id = 'content']/table/tbody/tr[2]/td/img")).click();
	      
	      // Get the Result Text based on its xpath
	      String result =
	         driver.findElement(By.xpath(".//*[@id = 'content']/p[2]/font")).getText();
	      
	      assertEquals("0", result);
    }
    
    @Test
    public void testWordNumber() {
    	
    	// Enter value test in the first number of the percent Calculator
	      driver.findElement(By.id("cpar1")).sendKeys("word");
	      
	      // Enter value 15 in the second number of the percent Calculator
	      driver.findElement(By.id("cpar2")).sendKeys("10");
	      
	      // Click Calculate Button
	      driver.findElement(By.xpath(".//*[@id = 'content']/table/tbody/tr[2]/td/input[2]")).click();
	      
	      //Click on Clear Button
	      driver.findElement(By.xpath(".//*[@id = 'content']/table/tbody/tr[2]/td/img")).click();
	      
	      // Get the Result Text based on its xpath
	      String result =
	         driver.findElement(By.xpath(".//*[@id = 'content']/p[2]/font")).getText();
	      
	      assertEquals("Please provide two numeric values in any fields below.", result);
    }
    
    @AfterClass
    public static void closeSelenium() {
    	driver.close();
    }
}