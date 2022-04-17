package com.seleniumTask2;



import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class keyboardEvents {
	


	public static void main(String[] args) throws AWTException{
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\Selenium project_2\\Driver\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		
		driver.get("https://in.search.yahoo.com/?fr2=inr");
		
		driver.manage().window().maximize();
		
		WebElement mail = driver.findElement(By.xpath("//div[@title='Mail']"));
		
		Actions ac= new Actions(driver);
		ac.contextClick(mail).build().perform();
		
		Robot r =new Robot();
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		driver.close();
		
		
	}	
}