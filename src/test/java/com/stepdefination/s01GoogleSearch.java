package com.stepdefination;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class s01GoogleSearch {
	WebDriver driver;
	@Given("Open google")
	public void open_google() {
		 driver = new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		   driver.get("https://www.google.co.in/");
	}

	@When("enter virat kohali in search box")
	public void enter_virat_kohali_in_search_box() {
	   driver.findElement(By.name("q")).sendKeys("virat kohali");
	}

	@When("hit enter")
	public void hit_enter() {
	    driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	}

	@Then("Search virat kohali should display")
	public void search_virat_kohali_should_display() 
	{
	   if(driver.getTitle().contains("virat kohali"))
	   
	       System.out.println("Search Sucessfully");
	   else
		   System.out.println("Search Fail");
	   
	}
}
