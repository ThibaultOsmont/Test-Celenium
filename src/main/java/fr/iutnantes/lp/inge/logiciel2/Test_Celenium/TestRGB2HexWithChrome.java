package fr.iutnantes.lp.inge.logiciel2.Test_Celenium;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class TestRGB2HexWithChrome {

	 private WebDriver driver; 
	 private String baseUrl = "http://yellowpipe.com"; 
	 private StringBuffer verificationErrors = new StringBuffer();
	
	@Before 
	public void setUp() throws Exception { 

		System.setProperty("webdriver.chrome.driver", "D:/Travail/Eclipse/workspaces/java/Test-Celenium/WebDrivers/chromedriver.exe");
		DesiredCapabilities capabilities = DesiredCapabilities.chrome(); Proxy proxy = new Proxy(); proxy.setHttpProxy("proxy-etu:3128"); capabilities.setCapability("proxy", proxy);

		driver = new ChromeDriver(capabilities);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
	}
	
	@Test
	  public void testBlanc() throws Exception {
	    driver.get(baseUrl + "/yis/tools/hex-to-rgb/color-converter.php");
	    driver.findElement(By.name("HexIn")).clear();
	    driver.findElement(By.name("HexIn")).sendKeys("FFFFFF");
	    driver.findElement(By.name("Button")).click();
	    assertEquals("255", driver.findElement(By.name("RedOut")).getAttribute("value"));
	    assertEquals("255", driver.findElement(By.name("GreenOut")).getAttribute("value"));
	    assertEquals("255", driver.findElement(By.name("BlueOut")).getAttribute("value"));
	  }
	  
	  @Test
	  public void testBleu() throws Exception {
		    driver.get(baseUrl + "/yis/tools/hex-to-rgb/color-converter.php");
		    driver.findElement(By.name("HexIn")).clear();
		    driver.findElement(By.name("HexIn")).sendKeys("0000FF");
		    driver.findElement(By.name("Button")).click();
		    assertEquals("0", driver.findElement(By.name("RedOut")).getAttribute("value"));
		    assertEquals("0", driver.findElement(By.name("GreenOut")).getAttribute("value"));
		    assertEquals("255", driver.findElement(By.name("BlueOut")).getAttribute("value"));
	  }
	  
	  @Test
	  public void testVert() throws Exception {
		    driver.get(baseUrl + "/yis/tools/hex-to-rgb/color-converter.php");
		    driver.findElement(By.name("HexIn")).clear();
		    driver.findElement(By.name("HexIn")).sendKeys("00FF00");
		    driver.findElement(By.name("Button")).click();
		    assertEquals("0", driver.findElement(By.name("RedOut")).getAttribute("value"));
		    assertEquals("255", driver.findElement(By.name("GreenOut")).getAttribute("value"));
		    assertEquals("0", driver.findElement(By.name("BlueOut")).getAttribute("value"));
	  }
	  
	  @Test
	  public void testRouge() throws Exception {
		    driver.get(baseUrl + "/yis/tools/hex-to-rgb/color-converter.php");
		    driver.findElement(By.name("HexIn")).clear();
		    driver.findElement(By.name("HexIn")).sendKeys("FF0000");
		    driver.findElement(By.name("Button")).click();
		    assertEquals("255", driver.findElement(By.name("RedOut")).getAttribute("value"));
		    assertEquals("0", driver.findElement(By.name("GreenOut")).getAttribute("value"));
		    assertEquals("0", driver.findElement(By.name("BlueOut")).getAttribute("value"));
	  }
	  
	  @Test
	  public void testAutre1() throws Exception {
		    driver.get(baseUrl + "/yis/tools/hex-to-rgb/color-converter.php");
		    driver.findElement(By.name("HexIn")).clear();
		    driver.findElement(By.name("HexIn")).sendKeys("9933CC");
		    driver.findElement(By.name("Button")).click();
		    assertEquals("153", driver.findElement(By.name("RedOut")).getAttribute("value"));
		    assertEquals("51", driver.findElement(By.name("GreenOut")).getAttribute("value"));
		    assertEquals("204", driver.findElement(By.name("BlueOut")).getAttribute("value"));
	  }
	  
	  @Test
	  public void testAutre2() throws Exception {
		    driver.get(baseUrl + "/yis/tools/hex-to-rgb/color-converter.php");
		    driver.findElement(By.name("HexIn")).clear();
		    driver.findElement(By.name("HexIn")).sendKeys("FF3300");
		    driver.findElement(By.name("Button")).click();
		    assertEquals("255", driver.findElement(By.name("RedOut")).getAttribute("value"));
		    assertEquals("51", driver.findElement(By.name("GreenOut")).getAttribute("value"));
		    assertEquals("0", driver.findElement(By.name("BlueOut")).getAttribute("value"));
	  }
	  
	  @Test
	  public void testAutre3() throws Exception {
		    driver.get(baseUrl + "/yis/tools/hex-to-rgb/color-converter.php");
		    driver.findElement(By.name("HexIn")).clear();
		    driver.findElement(By.name("HexIn")).sendKeys("AAAABB");
		    driver.findElement(By.name("Button")).click();
		    assertEquals("170", driver.findElement(By.name("RedOut")).getAttribute("value"));
		    assertEquals("170", driver.findElement(By.name("GreenOut")).getAttribute("value"));
		    assertEquals("187", driver.findElement(By.name("BlueOut")).getAttribute("value"));
	  }
	  
	  @Test
	  public void testNoir() throws Exception {
		    driver.get(baseUrl + "/yis/tools/hex-to-rgb/color-converter.php");
		    driver.findElement(By.name("HexIn")).clear();
		    driver.findElement(By.name("HexIn")).sendKeys("000000");
		    driver.findElement(By.name("Button")).click();
		    assertEquals("0", driver.findElement(By.name("RedOut")).getAttribute("value"));
		    assertEquals("0", driver.findElement(By.name("GreenOut")).getAttribute("value"));
		    assertEquals("0", driver.findElement(By.name("BlueOut")).getAttribute("value"));
	  }
	  
	  @Test
	  public void testVide() throws Exception {
		    driver.get(baseUrl + "/yis/tools/hex-to-rgb/color-converter.php");
		    driver.findElement(By.name("HexIn")).clear();
		    driver.findElement(By.name("Button")).click();
		    assertEquals("NaN", driver.findElement(By.name("RedOut")).getAttribute("value"));
		    assertEquals("NaN", driver.findElement(By.name("GreenOut")).getAttribute("value"));
		    assertEquals("NaN", driver.findElement(By.name("BlueOut")).getAttribute("value"));
	  }
	  
	  @Test
	  public void testErreur1() throws Exception {
		    driver.get(baseUrl + "/yis/tools/hex-to-rgb/color-converter.php");
		    driver.findElement(By.name("HexIn")).clear();
		    driver.findElement(By.name("HexIn")).sendKeys("OOFF");
		    driver.findElement(By.name("Button")).click();
		    assertEquals("", driver.findElement(By.name("RedOut")).getAttribute("value"));
		    assertEquals("", driver.findElement(By.name("GreenOut")).getAttribute("value"));
		    assertEquals("", driver.findElement(By.name("BlueOut")).getAttribute("value"));
	  }
	  
	  @Test
	  public void testErreur2() throws Exception {
		    driver.get(baseUrl + "/yis/tools/hex-to-rgb/color-converter.php");
		    driver.findElement(By.name("HexIn")).clear();
		    driver.findElement(By.name("HexIn")).sendKeys("AZERTY");
		    driver.findElement(By.name("Button")).click();
		    assertEquals("", driver.findElement(By.name("RedOut")).getAttribute("value"));
		    assertEquals("", driver.findElement(By.name("GreenOut")).getAttribute("value"));
		    assertEquals("", driver.findElement(By.name("BlueOut")).getAttribute("value"));
	  }
	
	@Test public final void testGoogle() throws Exception { 
		driver.get("http://www.google.com"); 
		Thread.sleep(5000); 
		WebElement searchBox = driver.findElement(By.name("q")); 
		searchBox.sendKeys("totoro"); WebElement buttonGo = driver.findElement(By.name("btnG")); 
		buttonGo.click(); 
		Thread.sleep(5000); 
	}
	
	 @After
	  public void tearDown() throws Exception {
	    driver.quit();
	    String verificationErrorString = verificationErrors.toString();
	    if (!"".equals(verificationErrorString)) {
	      fail(verificationErrorString);
	    }
	 }
}
