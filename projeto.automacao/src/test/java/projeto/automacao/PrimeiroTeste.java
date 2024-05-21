package projeto.automacao;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PrimeiroTeste {
	
	WebDriver driver;

	@Before
	public void setUp() throws Exception {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
		}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void e2etreinamentos() {
		driver.get("https://e2etreinamentos.com.br");
	}

	@Test
	public void google() {
		driver.get("https://www.google.com.br");
	}

	@Test
	public void amazon() {
		driver.get("https://www.amazon.com.br");
	}

}
