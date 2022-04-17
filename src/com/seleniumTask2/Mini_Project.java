package com.seleniumTask2;

import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Mini_Project {


	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\Selenium project_2\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://adactinhotelapp.com/");

		driver.manage().window().maximize();
		
       //username
		
	    WebElement username = driver.findElement(By.id("username"));
	    
	    username.sendKeys("maddymohan");
	
	  //password
	    
	    WebElement password = driver.findElement(By.id("password"));
	    
	    password.sendKeys("tendulkar@200");
	    
	 //login
	    
	    WebElement login = driver.findElement(By.id("login"));
	    
	    login.click();
	    
	   //Select location
	    
		WebElement location = driver.findElement(By.id("location"));
		
		Select select1=new Select(location);
		
		select1.selectByIndex(1);
		
		//select Hotel
		
		WebElement hotel = driver.findElement(By.id("hotels"));
		
		Select select2 =new Select(hotel);
		
		select2.selectByIndex(2);
		
		// selectRoom type
		
		WebElement roomtype = driver.findElement(By.id("room_type"));
		
		Select select3 =new Select(roomtype);
		
		select3.selectByVisibleText("Deluxe");
		
		// No.of rooms
		
	    WebElement numberofrooms = driver.findElement(By.id("room_nos"));
	    			
		Select select4 =new Select(numberofrooms);
		
		select4.selectByValue("5");
		
		// Checkindate
		
		WebElement checkindate = driver.findElement(By.id("datepick_in"));
		
		checkindate.sendKeys("16/02/2022");

		// Checkoutdate
	    WebElement checkoutdate = driver.findElement(By.id("datepick_in"));
		
		checkoutdate.sendKeys("17/02/2022");
		
		//Adults per Room

	    WebElement adultsperroom = driver.findElement(By.id("adult_room"));
	    			
		Select select5 =new Select(adultsperroom);
		
		select5.selectByValue("2");
		
		//Child per Room

	    WebElement childrenperroom = driver.findElement(By.id("child_room"));
	    			
		Select select6 =new Select(childrenperroom);
		
		select6.selectByIndex(1);
		
		// Search
		
		WebElement search = driver.findElement(By.id("Submit"));
		
		search.click();
		
		//select radiobution
		
		WebElement radiobutton = driver.findElement(By.id("radiobutton_0"));
		
		radiobutton.click();
		
		// continue
		
        WebElement next = driver.findElement(By.id("continue"));
  
        next.click();
		
        //Firstname
        
        WebElement fname = driver.findElement(By.id("first_name"));
        fname.sendKeys("Mono");
        
        //Lastname
        
        WebElement lname = driver.findElement(By.id("last_name"));
        lname.sendKeys("Mohan");
        
        //Address
        
        WebElement address= driver.findElement(By.id("address"));
        address.sendKeys("No.504,cross street,t.nagar,chennai600087");
        
        //CreditCard number
        
        WebElement creditcardno= driver.findElement(By.id("cc_num"));
        creditcardno.sendKeys("1234554321678909");
        
		//Credit Card Type
        WebElement cardtype = driver.findElement(By.id("cc_type"));
     		
        Select select7 =new Select(cardtype);
     		
        select7.selectByIndex(2);
        
        // CC Expiry month

		WebElement month = driver.findElement(By.id("cc_exp_month"));
		
		Select select8 =new Select(month);
		
		select8.selectByVisibleText("October");
			
        // CC Expiry Year

		WebElement year = driver.findElement(By.id("cc_exp_year"));
		
		Select select9 =new Select(year);
		
		select9.selectByVisibleText("2022");
		
		// Card CVV NO

	    WebElement cvvno = driver.findElement(By.xpath("(//input[@class='reg_input'])[4]"));
		cvvno.sendKeys("985");
		
		// Booking

	    WebElement booking = driver.findElement(By.id("book_now"));
		booking.click();
		
		Thread.sleep(5000);
		
		// Logout
		
		WebElement logout = driver.findElement(By.id("logout"));
		logout.click();
		
	
	}
}	
	   
		
	   
	
	
	
	
	
	
	
	

