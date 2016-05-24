package fr.iutnantes.lp.inge.logiciel2.Test_Celenium;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;


public class TestRechercherGoogle {
	private WebDriver driver;
	@Before 
	public void setUp() throws Exception { 
		System.setProperty("webdriver.firefox.bin", "D:/Programmes/Firefox Developer Edition/firefox.exe");
		FirefoxProfile profile = new FirefoxProfile(); 
		profile.setPreference("network.proxy.type",1); 
		profile.setPreference("network.proxy.http", 
		"proxy-etu"); 
		profile.setPreference("network.proxy.http_port", 3128); 
		profile.setPreference("network.proxy.ssl", "proxy-etu"); 
		profile.setPreference("network.proxy.ssl_port", 3128);
		
		driver = new FirefoxDriver(profile); 
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
	}
	
	@Test public final void testGoogle() throws Exception { 
		driver.get("http://www.google.com"); 
		Thread.sleep(5000); 
		WebElement searchBox = driver.findElement(By.name("q")); 
		searchBox.sendKeys("totoro"); WebElement buttonGo = driver.findElement(By.name("btnG")); 
		buttonGo.click(); 
		Thread.sleep(5000); 
	}
	
	@After public void tearDown() throws Exception { 
		driver.quit(); 
	}
}
