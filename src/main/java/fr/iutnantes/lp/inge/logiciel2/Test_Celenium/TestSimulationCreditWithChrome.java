package fr.iutnantes.lp.inge.logiciel2.Test_Celenium;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class TestSimulationCreditWithChrome {

	private WebDriver driver;
	private String baseUrl = "http://www.simulationdecredit.fr/";
	private StringBuffer verificationErrors = new StringBuffer();

	@Before
	public void setUp() throws Exception {

		System.setProperty("webdriver.chrome.driver",
				"D:/Travail/Eclipse/workspaces/java/Test-Celenium/WebDrivers/chromedriver.exe");
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		Proxy proxy = new Proxy();
		proxy.setHttpProxy("proxy-etu:3128");
		capabilities.setCapability("proxy", proxy);

		driver = new ChromeDriver(capabilities);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@org.junit.Test
	public void testSimulationCredit() throws Exception {
		driver.get(baseUrl);
		driver.findElement(By.id("CcPret")).clear();
		driver.findElement(By.id("CcPret")).sendKeys("10000");
		driver.findElement(By.id("Ccdure")).clear();
		driver.findElement(By.id("Ccdure")).sendKeys("3");
		driver.findElement(By.id("Ccan1")).click();
		driver.findElement(By.id("Cctaux")).clear();
		driver.findElement(By.id("Cctaux")).sendKeys("4");
		driver.findElement(By.name("Ccsubmit")).click();

		try {
			assertTrue(isElementPresent(By.cssSelector("div.Result")));
		} catch (Error e) {
			verificationErrors.append(e.toString());
		}

		assertEquals("295.24 Euros", driver.findElement(By.cssSelector("dd")).getText());
		assertEquals("629 Euros", driver.findElement(By.xpath("//div[@id='ResultCE']/div/dl/dd[2]")).getText());
	}

	@org.junit.Test
	public void testSimulationCredit2() throws Exception {
		driver.get(baseUrl);
		driver.findElement(By.id("CcPret")).clear();
		driver.findElement(By.id("CcPret")).sendKeys("10000");
		driver.findElement(By.id("Ccdure")).clear();
		driver.findElement(By.id("Ccdure")).sendKeys("2");
		driver.findElement(By.id("Ccan1")).click();
		driver.findElement(By.id("Cctaux")).clear();
		driver.findElement(By.id("Cctaux")).sendKeys("4");
		driver.findElement(By.name("Ccsubmit")).click();

		try {
			assertTrue(isElementPresent(By.cssSelector("div.Result")));
		} catch (Error e) {
			verificationErrors.append(e.toString());
		}
		assertEquals("434.25 Euros", driver.findElement(By.cssSelector("dd")).getText());
		assertEquals("422 Euros", driver.findElement(By.xpath("//div[@id='ResultCE']/div/dl/dd[2]")).getText());
	}

	@org.junit.Test
	public void testSimulationCredit3() throws Exception {
		driver.get(baseUrl);
		driver.findElement(By.id("CcPret")).clear();
		driver.findElement(By.id("CcPret")).sendKeys("100");
		driver.findElement(By.id("Ccdure")).clear();
		driver.findElement(By.id("Ccdure")).sendKeys("1");
		driver.findElement(By.id("Ccan2")).click();
		driver.findElement(By.id("Cctaux")).clear();
		driver.findElement(By.id("Cctaux")).sendKeys("10");
		driver.findElement(By.name("Ccsubmit")).click();

		try {
			assertTrue(isElementPresent(By.cssSelector("div.Result")));
		} catch (Error e) {
			verificationErrors.append(e.toString());
		}
		assertEquals("100.83 Euros", driver.findElement(By.cssSelector("dd")).getText());
		assertEquals("1 Euros", driver.findElement(By.xpath("//div[@id='ResultCE']/div/dl/dd[2]")).getText());
	}

	@org.junit.Test
	public void testSimulationCredit4() throws Exception {
		driver.get(baseUrl);
		driver.findElement(By.id("CcPret")).clear();
		driver.findElement(By.id("CcPret")).sendKeys("100");
		driver.findElement(By.id("Ccdure")).clear();
		driver.findElement(By.id("Ccdure")).sendKeys("1");
		driver.findElement(By.id("Ccan2")).click();
		driver.findElement(By.id("Cctaux")).clear();
		driver.findElement(By.id("Cctaux")).sendKeys("100");
		driver.findElement(By.name("Ccsubmit")).click();
		try {
			assertTrue(isElementPresent(By.cssSelector("div.Result")));
		} catch (Error e) {
			verificationErrors.append(e.toString());
		}
		assertEquals("108.83 Euros", driver.findElement(By.cssSelector("dd")).getText());
		assertEquals("8 Euros", driver.findElement(By.xpath("//div[@id='ResultCE']/div/dl/dd[2]")).getText());
	}

	@org.junit.Test
	public void testSimulationCredit5() throws Exception {
		driver.get(baseUrl);
		driver.findElement(By.id("CcPret")).clear();
		driver.findElement(By.id("CcPret")).sendKeys("1000");
		driver.findElement(By.id("Ccdure")).clear();
		driver.findElement(By.id("Ccdure")).sendKeys("4");
		driver.findElement(By.id("Ccan1")).click();
		driver.findElement(By.id("Cctaux")).clear();
		driver.findElement(By.id("Cctaux")).sendKeys("10");
		driver.findElement(By.name("Ccsubmit")).click();
		try {
			assertTrue(isElementPresent(By.cssSelector("div.Result")));
		} catch (Error e) {
			verificationErrors.append(e.toString());
		}
		assertEquals("25.36 Euros", driver.findElement(By.cssSelector("dd")).getText());
		assertEquals("217 Euros", driver.findElement(By.xpath("//div[@id='ResultCE']/div/dl/dd[2]")).getText());
	}

	@org.junit.Test
	public void testSimulationCredit6() throws Exception {
		driver.get(baseUrl);
		driver.findElement(By.id("CcPret")).clear();
		driver.findElement(By.id("CcPret")).sendKeys("1000");
		driver.findElement(By.id("Ccdure")).clear();
		driver.findElement(By.id("Ccdure")).sendKeys("2");
		driver.findElement(By.id("Ccan1")).click();
		driver.findElement(By.id("Cctaux")).clear();
		driver.findElement(By.id("Cctaux")).sendKeys("10");
		driver.findElement(By.name("Ccsubmit")).click();
		try {
			assertTrue(isElementPresent(By.cssSelector("div.Result")));
		} catch (Error e) {
			verificationErrors.append(e.toString());
		}
		assertEquals("46.14 Euros", driver.findElement(By.cssSelector("dd")).getText());
		assertEquals("107 Euros", driver.findElement(By.xpath("//div[@id='ResultCE']/div/dl/dd[2]")).getText());
	}

	@org.junit.Test
	public void testSimulationCredit7() throws Exception {
		driver.get(baseUrl);
		driver.findElement(By.id("CcPret")).clear();
		driver.findElement(By.id("CcPret")).sendKeys("1000");
		driver.findElement(By.id("Ccdure")).clear();
		driver.findElement(By.id("Ccdure")).sendKeys("24");
		driver.findElement(By.id("Ccan2")).click();
		driver.findElement(By.id("Cctaux")).clear();
		driver.findElement(By.id("Cctaux")).sendKeys("10");
		driver.findElement(By.name("Ccsubmit")).click();
		try {
			assertTrue(isElementPresent(By.cssSelector("div.Result")));
		} catch (Error e) {
			verificationErrors.append(e.toString());
		}
		assertEquals("46.14 Euros", driver.findElement(By.cssSelector("dd")).getText());
		assertEquals("107 Euros", driver.findElement(By.xpath("//div[@id='ResultCE']/div/dl/dd[2]")).getText());
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
		String verificationErrorString = verificationErrors.toString();
		if (!"".equals(verificationErrorString)) {
			fail(verificationErrorString);
		}
	}

	private boolean isElementPresent(By by) {
		try {
			driver.findElement(by);
			return true;
		} catch (NoSuchElementException e) {
			return false;
		}
	}
}
