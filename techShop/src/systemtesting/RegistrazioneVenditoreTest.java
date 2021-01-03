package systemtesting;
import org.junit.Test;

import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import manageraccouting.Venditore;
import managernegozio.Negozio;
import model.NegozioDAO;
import model.VenditoreDAO;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.SQLException;

/**
 * Test di sistema Registrazione Venditore
 * @author monte
 *
 */
public class RegistrazioneVenditoreTest {
  private WebDriver driver;
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
  public void tearDown() throws SQLException {
    driver.quit();
    model.deleteVenditore("Luca");
    
  }
  @Test
  public void registrazioneVenditore() throws SQLException, InterruptedException {
    driver.get("http://localhost:8082/techShop/index.jsp");
    
    driver.manage().window().setSize(new Dimension(1338, 724));
    driver.findElement(By.cssSelector("ul:nth-child(1) > li:nth-child(4)")).click();
    driver.findElement(By.name("fname")).click();
    driver.findElement(By.name("fname")).sendKeys("Vincenzo");
    driver.findElement(By.name("lname")).click();
    driver.findElement(By.name("lname")).sendKeys("Montesano");
    driver.findElement(By.id("nextBtn1")).click();
    driver.findElement(By.name("email")).click();
    driver.findElement(By.name("email")).sendKeys("vincenzomontesano@gmail.com");
    driver.findElement(By.name("phone")).click();
    driver.findElement(By.name("phone")).sendKeys("3482914912");
    driver.findElement(By.id("nextBtn1")).click();
    driver.findElement(By.name("street")).click();
    driver.findElement(By.name("street")).sendKeys("Via santa domenica");
    driver.findElement(By.name("city")).click();
    driver.findElement(By.name("city")).sendKeys("Sapri");
    driver.findElement(By.name("CAP")).click();
    driver.findElement(By.name("CAP")).sendKeys("84073");
    driver.findElement(By.id("nextBtn1")).click();
    driver.findElement(By.name("username")).click();
    driver.findElement(By.name("username")).sendKeys("Monte97");
    driver.findElement(By.name("password")).click();
    driver.findElement(By.name("password")).sendKeys("Saprisapri@97");
    driver.findElement(By.id("nextBtn1")).click();
  
   
   try {
		Venditore ret=(Venditore) model.checkLoginSeller("Monte97","Saprisapri@97");
		assertEquals(ret.getUsername(), "Monte97");
   }finally {
	   model.deleteVenditore("Monte97");
   }
    
    driver.quit();
  }
    
    private static VenditoreDAO model=new VenditoreDAO();
    private static NegozioDAO modeln=new NegozioDAO();
}