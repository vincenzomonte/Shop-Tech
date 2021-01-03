package systemtesting;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.Map;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

/**
 * Test di sistema Login Venditore
 * @author angelo
 *
 */
public class LoginVenditoreTest {
	
	
  private WebDriver driver;
  @SuppressWarnings("unused")
private Map<String, Object> vars;
  JavascriptExecutor js;
  
  @Before
  public void setUp() {
  System.setProperty("webdriver.chrome.driver","C:\\Users\\chromedriver.exe");

    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void testLoginVenditore() throws InterruptedException {
    driver.get("http://localhost:8082/techShop/index.jsp");
    driver.manage().window().setSize(new Dimension(1338, 724));
    driver.findElement(By.linkText("Accedi")).click();
    driver.findElement(By.cssSelector("form:nth-child(2) > p")).click();
    driver.findElement(By.cssSelector("form:nth-child(2) span:nth-child(2) > .text-input")).click();
    driver.findElement(By.cssSelector("form:nth-child(2) span:nth-child(2) > .text-input")).sendKeys("Monte97");
    driver.findElement(By.cssSelector("form:nth-child(2) span:nth-child(3) > .text-input")).click();
    driver.findElement(By.cssSelector("form:nth-child(2) span:nth-child(3) > .text-input")).sendKeys("Saprisapri@97");
    driver.findElement(By.cssSelector("form:nth-child(2) span:nth-child(3)")).click();
    driver.findElement(By.cssSelector("form:nth-child(2) .send-button")).click();
    
    assertEquals("http://localhost:8082/techShop/venditore/index-venditore.jsp",driver.getCurrentUrl());
    
    driver.findElement(By.id("#ContentWrapper")).click();
    driver.findElement(By.id("#ContentWrapper")).click();
    {
      WebElement element = driver.findElement(By.id("#ContentWrapper"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).clickAndHold().perform();
    }
    {
      WebElement element = driver.findElement(By.id("#ContentWrapper"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    
    {
      WebElement element = driver.findElement(By.id("#ContentWrapper"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).release().perform();
    }
    driver.findElement(By.id("#ContentWrapper")).click();
    driver.findElement(By.id("#ContentWrapper")).click();
    driver.findElement(By.cssSelector(".fa-sign-out-alt")).click();
  
    
    assertEquals("http://localhost:8082/techShop/index.jsp",driver.getCurrentUrl());
    
    driver.quit();
  }
}