package com.seleniumTask2;

//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait_Concepts {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\Selenium project_2\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

		driver.manage().window().maximize();

		// Implicit wait

	   //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement email = driver.findElement(By.id("email"));

		email.sendKeys("HRMS@gmail.com");

		WebElement password = driver.findElement(By.id("pass"));

	    password.sendKeys("4201pq");
		
		//Explicit wait
		
		WebDriverWait  wait = new WebDriverWait(driver,10);
		
        wait.until(ExpectedConditions.visibilityOf(password));
		
		

		
		
		
		
		
		

	}
}
