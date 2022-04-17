package com.Automationproject;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class KalaiSelvi {
	
	
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\Selenium_Concepts\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		Thread.sleep(3000);
		WebElement login = driver.findElement(By.xpath("//a[@class='login']"));
		login.click();

		WebElement email = driver.findElement(By.name("email"));
		email.sendKeys("k.kalaiselvi.sep4@mail.com");

		WebElement password = driver.findElement(By.id("passwd"));
		password.sendKeys("123456");

		WebElement signin = driver.findElement(By.xpath("//i[@class='icon-lock left']"));
		signin.click();

		WebElement women = driver.findElement(By.xpath("//a[@title='Women']"));
		women.click();

		driver.findElement(By.id("list")).click();

		//WebElement orderdress = driver.findElement(By.xpath("(//img[@title='Printed Dress'])[2]"));
		//orderdress.click();
		
		 WebElement fadedshorts = driver.findElement(By.xpath("(//a[@title='Blouse'])[2]//preceding::a[@title='Faded Short Sleeve T-shirts'][1]"));
		 fadedshorts.click();
		

		WebElement addtocart = driver.findElement(By.xpath("//*[text()='Add to cart']"));
		addtocart.click();

		WebElement continueshopping = driver.findElement(By.xpath("//*[@title='Continue shopping']"));
		continueshopping.click();

		driver.navigate().back();

		WebElement summerdress = driver.findElement(By.xpath("(//*[@title='Printed Dress'])[6]//following::a[@title='Printed Summer Dress'][4]"));
		summerdress.click();

		WebElement quantity = driver.findElement(By.id("quantity_wanted"));
		quantity.clear();
		quantity.sendKeys("3");

		WebElement size = driver.findElement(By.id("group_1"));
		Select s = new Select(size);
		s.selectByValue("3");

		WebElement colour = driver.findElement(By.id("color_16"));
		colour.click();

		WebElement addtocart2 = driver.findElement(By.xpath("//*[text()='Add to cart']"));
		addtocart2.click();
		
		WebElement conshop = driver.findElement(By.xpath("//*[@title='Continue shopping']"));
		conshop.click();
		
	    WebElement allcart = driver.findElement(By.xpath("//a[@title='View my shopping cart']"));
		allcart.click();
		
		WebElement p1check = driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]"));
	    p1check.click();
	    
        WebElement p2check = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		p2check.click();
		
	    WebElement termsofservice = driver.findElement(By.id("cgv"));
		termsofservice.click();
		
		 WebElement p3check = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		 p3check.click();
		

		WebElement paybybank = driver.findElement(By.xpath("//a[@title='Pay by bank wire']"));
		paybybank.click();

		WebElement confirmorder = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		confirmorder.click();
		
		WebElement backto = driver.findElement(By.xpath("//a[@title='Back to orders']"));
		backto.click();
		
		
		WebElement signout = driver.findElement(By.xpath("//a[@title='Log me out']"));
		signout.click();

	}

	
}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


