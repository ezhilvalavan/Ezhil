package org.adactindefinition;

import org.baseclass.Baseclass;
import org.baseclass.Pom;
import org.openqa.selenium.WebElement;

import com.github.dockerjava.api.model.Driver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stepdefinition extends Baseclass {
	
	@Given("user  want to launch adactin url {string}")
	public void user_want_to_launch_adactin_url(String string) {
		
		browserLanuch("chrome");
		
		launchurl(string);
		
		}
	@When("user enters the {string} and {string}")
	public void user_enters_the_and(String string, String string2) {
		
		Pom p = new Pom();
		WebElement username = p.getUsername();
		typetext(username, string);
		
		WebElement pass = p.getPassword();
		typetext(pass,string2);
		
	}
	hotel booking branches 
		add for further feartures and there are some the 
		
		hotel bookinng refrence number using 
		card number

	@When("user clicks on the login Button")
	public void user_clicks_on_the_login_Button() {
      Pom  p = new Pom();
		
		WebElement login = p.getLogin();
	    btnclk(login);
	}
	
	
	@When("use select the room type and the Hotel")
	public void use_select_the_room_type_and_the_Hotel() {
		
		Pom p = new Pom();
		
		WebElement location = p.getLocation();
		select(location, "Sydney");
		
		WebElement hotels = p.getHotels();
		select(hotels, "Hotel Sunshine");
		

	}
	@When("user select the room type")
	public void user_select_the_room_type() {
		Pom p = new Pom();
		
WebElement roomtype = p.getRoomtype();
		
		select(roomtype, "Double");
		
	}
	@When("user select the no of rooms")
	public void user_select_the_no_of_rooms() {
		Pom p = new Pom();
		WebElement nor = p.getNor();
		 select(nor, 2);
		
	}
	@When("user enter the check in {string}")
	public void user_enter_the_check_in(String string) {
		Pom p = new Pom();
		 WebElement datein = p.getDatein();
		  
		  boxclear(datein);
		  
		  typetext(datein, string);
		  

		
	}
	@When("user enters the checkout {string}")
	public void user_enters_the_checkout(String string) {
		Pom p = new Pom();
		 WebElement dateout = p.getDateout();
		  
		  boxclear(dateout);
		  
		  typetext(dateout, string);
		  

	
	}

	@When("user selecting the no of rooms")
	public void user_selecting_the_no_of_rooms() {
		Pom p = new Pom();
		WebElement adult = p.getAdult();
		  
		  select(adult, 3);  

	}

	@When("user selecting the number of children")
	public void user_selecting_the_number_of_children() {
		
		Pom p = new Pom();
		 WebElement child = p.getChild();
		  select(child, 4);
	}

	@When("user clicks on the search button")
	public void user_clicks_on_the_search_button() {
		Pom p = new Pom(); 
		WebElement click = p.getClick();
		  
		  btnclk(click);
	}







		
}	





	
	
		
		
	
	
	





