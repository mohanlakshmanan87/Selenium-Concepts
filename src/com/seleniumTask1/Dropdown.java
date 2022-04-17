package com.seleniumTask1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
	

	  public static void main(String[] args) {
		


			System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\Selenium_Concepts\\Driver\\chromedriver.exe ");
			
			WebDriver driver= new ChromeDriver();
			
			driver.get("http://www.leafground.com/pages/Dropdown.html");
			
			driver.manage().window().maximize();
			
		//Single Dropdown1
		
			WebElement index = driver.findElement(By.id("dropdown1"));
			
			Select select=new Select(index);
			
			select.selectByIndex(1);
		
			
			//Deselect does not works in multiple dropdown
			
			//select.deselectByValue("1");
			
          //Single Dropdown2
			
			WebElement text = driver.findElement(By.name("dropdown2"));
			
			Select select1 =new Select(text);
			
			select1.selectByVisibleText("Appium");
			
			
           //Single Dropdown3
			
			WebElement value = driver.findElement(By.id("dropdown3"));
			
			Select select2 =new Select(value);
			
			select2.selectByValue("3");
			
			
		   // Select sendkeys
			
			WebElement keys = driver.findElement(By.xpath("(//select)[5]"));
			
			keys.sendKeys("Loadrunner");
			
			
			//getoptions
			
			System.out.println("All options are");
			
			List<WebElement> options = select.getOptions();
			
			for (WebElement all : options) {
				 
				String t = all.getText();
				
				System.out.println(t);
				
			}
			
			System.out.println();
			
			
			//get all selected options
			
			System.out.println("All selected options are");
			
			List<WebElement> allSelectedOptions = select.getAllSelectedOptions();
			
			for (WebElement t1 : allSelectedOptions) {
				
				String text2 = t1.getText();
				
				System.out.println(text2);
				
			}
			 
			System.out.println();
			
			
			
			//Firt selected option
			
			System.out.println("First selected option is");
			
			WebElement firstSelectedOption = select.getFirstSelectedOption();
		
			String text3 = firstSelectedOption.getText();
			
			System.out.println(text3);
			
			System.out.println();
			
			
		 //Multi DropDown
			
			WebElement multi = driver.findElement(By.xpath("(//select)[6]"));
			
			Select multiselect = new Select(multi);
			
			multiselect.selectByValue("1");
			
			multiselect.selectByValue("2");
			
			multiselect.selectByValue("3");
			
			multiselect.selectByValue("4");
			 
		   //Deselect works in multiple dropdown
			
			multiselect.deselectByIndex(1);
			
			
			//select.deselectAll();
			
	  }
	  
}		

			
			

			
			
			
			
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	  


