package com.seleniumTask2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\Selenium_Concepts\\Driver\\chromedriver.exe");
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/table.html");
		
		driver.manage().window().maximize();
		
	// Find all Datas
		
		System.out.println("***All Data***");
		
		List<WebElement> alldatas = driver.findElements(By.xpath("//table/tbody/tr/td"));
		
		for (WebElement all : alldatas) {
			
			String text = all.getText();
			
			System.out.println(text);
			
		}	
		
		System.out.println();
		
	// Find Row data		
		
		System.out.println("***Row Data***");
		
		List<WebElement> rowdata = driver.findElements(By.xpath("//table/tbody/tr[4]/td"));
		
		for (WebElement row : rowdata) {
			
			String text = row.getText();
			
			System.out.println(text);
		}	
			
		System.out.println();
		
	// Find column data		
		
		System.out.println("***Column Data***");
		
		List<WebElement> columndata = driver.findElements(By.xpath("//table/tbody/tr/td[5]"));
		
		for (WebElement column : columndata) {
			
			String text = column.getText();
			
			System.out.println(text);
		}
		
		System.out.println();
		
	//Find particular data
		
		System.out.println("***Particular data***");
		
		WebElement particulardata = driver.findElement(By.xpath("//table/tbody/tr[2]/td[2]"));
		
		String text = particulardata.getText();
		
		System.out.println(text);
		
		System.out.println();	
		
		
    // Find Headers
		
	    System.out.println("***Headers***");
		
		List<WebElement> Headerdatas = driver.findElements(By.tagName("th"));
		
		for (WebElement Header : Headerdatas) {
			
			String text2 = Header.getText();
			
			System.out.println(text2);
		
		}
		
	}	
		
		
		
		

	

}