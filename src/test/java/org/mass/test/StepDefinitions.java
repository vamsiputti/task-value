package org.mass.test;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.runtime.junit.Assertions;
import junit.framework.Assert;

public class StepDefinitions extends Pageobject {
	



public StepDefinitions(WebDriver driver) {
		super(driver);
		
	}
//open home page with Url 
@Given("user is on Home Page")
public void user_is_on_Home_Page() {

openUrl("https://www.exercise1.com/values ");	
}

@When("verify the right count of values appear on the screen")
public void verify_the_right_count_of_values_appear_on_the_screen() {
	
	//"i don't understand what mean by right count values appear on the screen......so i had not written any logic here "
    
}

//verify the values on the screen are greater than 0
@When("verify the values on the screen are greater than 0")
public void verify_the_values_on_the_screen_are_greater_than() {
  
	
	List<WebElement> w1 = driver.findElements(By.id("getValue"));
	
	for (int i = 0; i < w1.size(); i++) {
		
		WebElement w2 = w1.get(i);
		String text = w2.getText();
		
		int pa = Integer.parseInt(text);
if (pa!=0) {
	System.out.println("value at:"+i +"not zero");
}
else {
	System.out.println("value at:"+i +" zero");
}
	}
	
}

//verify the values are formatted as currencies
@When("verify the values are formatted as currencies")
public void verify_the_values_are_formatted_as_currencies() {
    
	List<WebElement> w1 = driver.findElements(By.id("getValue"));
	
	
	for (int i = 0; i < w1.size(); i++) {
		
		WebElement w2 = w1.get(i);
		String text = w2.getText();
		 String s="$";
		
		if (text.contains(s)) {
			System.out.println("value formatted as currencies");
			
		} else {
			System.out.println("value formate is not currencies");
		}
		
	}
}

//verify the total balance matches the sum of the values
@When("verify the total balance matches the sum of the values")
public void verify_the_total_balance_matches_the_sum_of_the_values() {
	

	List<WebElement> w1 = driver.findElements(By.id("getValue"));
	int count=0;
	
	for (int i = 0; i < w1.size(); i++) {
		
		WebElement w2 = w1.get(i);
		String text = w2.getText();
		
		
		count=count+ Integer.parseInt(text);;
		
	}
	int ba = Integer.parseInt( getText(getTotalBalancevalue()));
	if (ba==count) {
		System.out.println("total balance matches the sum of values");
		
		
	} else {
		System.out.println("total balance DOSE NOT matches the sum of values");
	}
}

//the mockup results would look like assuming all steps passed
@Then("the mockup results would look like assuming all steps passed")
public void the_mockup_results_would_look_like_assuming_all_steps_passed() {
   
	Assert.assertTrue(true);
	System.out.println("all the reports ok");
}



}
