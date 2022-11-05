package ec.edu.espol.workshops;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.*;

public class StepsDefs {
	
	 private int actualAnswer;
	 private CarInsurance person1 = new CarInsurance(86,'M',true,true);
	 private CarInsurance person2 = new CarInsurance(45,'M',false,true);
	 private CarInsurance person3 = new CarInsurance(26,'F',false,false);
	 private CarInsurance person4 = new CarInsurance(21,'H',false, true);
	 private CarInsurance person5 = new CarInsurance(60,'H',true, true);

	@Given("citizen over 30 years old")
	 public void citizen_over_30() {
	 person1.getAge();
	 }

	@When("calculate the insurance premium")
	 public void calculate_premium() {
	 actualAnswer = CarInsurance.getPremium(person1);
	 }

	
	 @Then("we should receive -1")
	 public void should_receive() {
		assertEquals(0, actualAnswer);
	 }
	
	@Given("citizen over 50 years old")
	public void citizen_over_50() {
		person2.getAge();
	}
	 
	@Given("is a man")
	public void is_man() {
		person2.getSex();
	}
		
	@Given("is married")
	public void is_married() {
		person2.isStatusMarital();
	}

	
	@Given("citizen over 25 years old")
	public void citizen_over_25() {
		person3.getAge();
	}
	 
	@Given("is a women")
	public void is_women() {
		person3.getSex();
	}
		
	@Given("is married 3")
	public void is_married3() {
		person3.isStatusMarital();
	}
	
	
	@Given("citizen over 30 years old")
	 public void citizen_over_20() {
	 person1.getAge();
	 }

	@When("calculate the insurance premium")
	 public void calculate_premium5() {
	 actualAnswer = CarInsurance.getPremium(person5);
	 }

	
	 @Then("we should receive 2000")
	 public void should_receive5() {
		assertEquals(2000, actualAnswer);
	 }
 
}
