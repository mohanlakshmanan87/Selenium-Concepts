package com.Automationproject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Runner2 {
	
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\Selenium_Concepts\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
	   //Emailid
		
		WebElement mailid = driver.findElement(By.id("email"));
		
		mailid.sendKeys("bensmith4201@gmail.com");
	
	   //password
		
		WebElement password = driver.findElement(By.id("passwd"));
		
		password.sendKeys("mahi@12345");
		
		//signin
		
		WebElement login = driver.findElement(By.id("SubmitLogin"));
		 
		login.click();
		
		//women
		
		WebElement women = driver.findElement(By.xpath("//a[@title='Women']"));
		
		women.click();
		
		driver.findElement(By.id("list")).click();
		
		//fadedshorts
		
        WebElement fadedshorts = driver.findElement(By.xpath("(//a[@title='Blouse'])[2]//preceding::a[@title='Faded Short Sleeve T-shirts'][1]"));
		
	    fadedshorts.click();
	    
	    
	    
	    //addtocart
	    
        WebElement addtocart = driver.findElement(By.xpath("//*[text()='Add to cart']"));
		
	    addtocart.click();
	    
	    //continueshopping
	    
        WebElement continueshopping = driver.findElement(By.xpath("//*[@title='Continue shopping']"));
		
	    continueshopping.click();
	    
	    //Naviagte back
	    driver.navigate().back();
	    
    
	    //printed summerdress
        WebElement summerdress = driver.findElement(By.xpath("(//*[@title='Printed Dress'])[6]//following::a[@title='Printed Summer Dress'][4]"));
		
	    summerdress.click();
	    

	    //quantity
	    
        WebElement quantity = driver.findElement(By.id("quantity_wanted"));
        quantity.clear();
		quantity.sendKeys("3");
	   
        //size
        
	    WebElement size = driver.findElement(By.id("group_1"));
		
		Select s= new Select(size);
		s.selectByValue("3");
		
		//color
		
		 driver.findElement(By.id("color_16")).click();
		
        //add to cart
		
		WebElement addtocart2 = driver.findElement(By.xpath("//*[text()='Add to cart']"));
		
		addtocart2.click();
		
	    //continueshopping 
		
		WebElement conshop = driver.findElement(By.xpath("//*[@title='Continue shopping']"));
			
		conshop.click();
		
		//viewed my cart
		WebElement allcart = driver.findElement(By.xpath("//a[@title='View my shopping cart']"));
		
		allcart.click();
		
		//proceed to check
	    WebElement p1check = driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]"));
		
		p1check.click();
		
		//proceed to check
	    WebElement p2check = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		
	    p2check.click();
	    
	    //terms of service
	    WebElement termsofservice = driver.findElement(By.id("cgv"));
	    termsofservice.click();
			
		//proceed to check
        WebElement p3check = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		
	    p3check.click();
		
	    //paybank
        WebElement paybybank = driver.findElement(By.xpath("//a[@title='Pay by bank wire']"));
		
	    paybybank.click();
	    
	    //confirm order
	    WebElement confirmorder = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
			
		confirmorder.click();
		
		//back to orders
		driver.findElement(By.xpath("//a[@title='Back to orders']")).click();
		
		//signout
		WebElement signout = driver.findElement(By.xpath("//a[@title='Log me out']"));
		signout.click();
		    
		    
		    
	}
	
}	
	        

	    
	        
	    
	    
	    
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
