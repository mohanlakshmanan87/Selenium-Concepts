package com.seleniumTask2;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseEvents {
	


	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\Selenium_Concepts\\Driver\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		
		driver.get("https://demoqa.com/buttons");
		
		driver.manage().window().maximize();
		
		Actions ac= new Actions(driver);
		
        
		WebElement clickbutton = driver.findElement(By.xpath("(//button[@type='button'])[4]"));
		ac.click(clickbutton).build().perform();
		
		
		WebElement rightclickbutton = driver.findElement(By.xpath("(//button[@type='button'])[3]"));
		ac.contextClick(rightclickbutton).build().perform();
		
	
	    WebElement doubleclickbutton = driver.findElement(By.xpath("(//button[@type='button'])[2]"));
		ac.doubleClick(doubleclickbutton).build().perform();
	
	   
		driver.navigate().to("https://www.myntra.com/");
		
		WebElement move = driver.findElement(By.xpath("(//*[@class='desktop-main'])[2]"));
		ac.moveToElement(move).build().perform();
		
		
		driver.navigate().to("http://www.leafground.com/pages/drop.html");
		
		WebElement drag = driver.findElement(By.id("draggable"));

		WebElement drop = driver.findElement(By.id("droppable"));
		
		ac.dragAndDrop(drag, drop).build().perform();
		  
	
	
	
	  
	
	
	
	
	
	
	
	}	

}
