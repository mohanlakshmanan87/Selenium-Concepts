package com.seleniumTask2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbsoluteXpath {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\Selenium project_2\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

		driver.manage().window().maximize();
		
		
		WebElement mail = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/div/form/div/div/input"));
		
	    mail.sendKeys("mono12345");
			
		
		WebElement password = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/div/form/div/div/div/input"));
		
		password.sendKeys("aaaaa");
		
		Thread.sleep(3000);
		
		WebElement login = driver.findElement(By.xpath("/html/body/div/div[2]/div/div/div/div/div[2]/div/div/form/div[2]/button"));
		
		login.click();
		
		
		
		
		
		
		
		
		
		
		

	}

}
