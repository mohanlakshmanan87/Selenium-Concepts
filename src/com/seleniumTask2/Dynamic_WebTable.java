package com.seleniumTask2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_WebTable {
	
	static int indexofActive,indexofTests,indexofpopulation;
	static String country="Italy";
	
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+
				"\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.worldometers.info/coronavirus/");
		
		driver.manage().window().maximize();
		
		
		 List<WebElement> allheaders = driver.findElements(By.tagName("th"));
		 
		for (int i = 0; i < allheaders.size(); i++) {
			
			  String text = allheaders.get(i).getText();
			  
			  System.out.println(text);
			
			  String header = text.replaceAll("\n"," ");
			
			  System.out.println(header);
			
			  
			if (header.equalsIgnoreCase("Active Cases")) {
				
				
				indexofActive =i;
				
				System.out.println("Index of Active cases:"+indexofActive);
			}
			
			else if (header.equalsIgnoreCase("Total Tests")) {
				 
				indexofTests=i;
				
				System.out.println("Index of Total Tests :"+indexofTests);
			}
				
				
			else if (header.equalsIgnoreCase("Population")) {
				 
				indexofpopulation=i;
				
				System.out.println("Index of population :"+indexofpopulation);
			}
				
		}			
			  
			  
		// Body
		
		  List<WebElement> allrow = driver.findElements(By.xpath("//table/tbody[1]/tr"));
		  
		  for (int i = 0; i < allrow.size(); i++) {
			  
		  List<WebElement> alldata = allrow.get(i).findElements(By.tagName("td"));
		  
		  for (int j = 0; j < alldata.size(); j++) {
			
		  if (alldata.get(j).getText().equalsIgnoreCase("Italy")) {
			  
			  
			  
			System.out.println("Active Cases:"+alldata.get(indexofActive).getText());  
			System.out.println("Total No Of Tests:"+alldata.get(indexofTests).getText());
			System.out.println("Total Population:"+alldata.get(indexofpopulation).getText());
			    
			
		    }
			  
		  }	  	  
		  
		}
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
