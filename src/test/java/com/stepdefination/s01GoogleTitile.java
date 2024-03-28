package com.stepdefination;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class s01GoogleTitile {
	WebDriver driver;
	
    String expTitle = "Google",actTitle;
    @Given("Open Google")
	public void open_google() {
	    
	   driver = new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   driver.get("https://www.google.co.in/");
	}

	@When("Read Ttile")
	public void read_ttile() {	
	 actTitle = driver.getTitle();
	}

	@Then("Title Should Be Google")
	public void title_should_be_google() {
		 if(expTitle.equals(actTitle))
		     System.out.println("Title Matching");
		     else
		     System.out.println("Title not Matching");
			
		}
	}



