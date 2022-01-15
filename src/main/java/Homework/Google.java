package Homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","/Users/abdullahsabbir9/eclipse-workspace/sabbir/chromedriver");
		
		// Navigate to a website
		WebDriver himel= new ChromeDriver();
		himel.get("https://www.google.com/");
		
		//print title of the page
		System.out.println("Page Title: " + himel.getTitle());
	
		
		//Mazimize current window
		himel.manage().window().maximize();
		
		//Mazimize current window
		//himel.manage().window().minimize();
		
		//find X.path
		himel.findElement(By.xpath("//input[@name='q']")).sendKeys("Amex");
		
		
		//find X.path to click
		//himel.findElement(By.xpath("//input[@name='q']")).sendKeys("Amex");

	}

}

