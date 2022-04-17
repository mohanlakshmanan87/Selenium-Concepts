package com.seleniumTask1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webdriver_Methods {


	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium_Concepts\\Driver\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		
		driver.get("http://www.greenstechnologys.com/");
		
		
		driver.manage().window().maximize();
		
		
		String title = driver.getTitle();
		System.out.println(title);
		
        driver.navigate().to("https://www.inspirisys.com/");
        
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		
		driver.navigate().back();
		
		driver.navigate().forward();
		
		driver.navigate().refresh();
		
		driver.close();
		
	}
	
}	
	