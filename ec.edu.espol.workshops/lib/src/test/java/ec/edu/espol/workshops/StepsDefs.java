package ec.edu.espol.workshops;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.*;

public class StepsDefs {
	
	 private int actualAnswer;
	 private CarInsurance person1 = new CarInsurance(86,"M",true,true);
	 private CarInsurance person2 = new CarInsurance(45,"M",false,true);
	 private CarInsurance person3 = new CarInsurance(26,"F",false,false);
	 private CarInsurance person4 = new CarInsurance(21,"H",false, true);
	 private CarInsurance person5 = new CarInsurance(60,"H",true, true);

	
	@When("calculate the insurance premium")
	 public void calculate_premium1() {
	 actualAnswer = CarInsurance.getPremium(person1);
	 }

	
	 @Then("we should receive 2000")
	 public void should_receive1() {
		assertEquals(-1, actualAnswer);
	 }
	 
	 @When("calculate the insurance premium")
	 public void calculate_premium2() {
	 actualAnswer = CarInsurance.getPremium(person2);
	 }

	
	 @Then("we should receive 400")
	 public void should_receive2() {
		assertEquals(400, actualAnswer);
	 }
	 
	 @When("calculate the insurance premium")
	 public void calculate_premium3() {
	 actualAnswer = CarInsurance.getPremium(person3);
	 }

	
	 @Then("we should receive 300")
	 public void should_receive3() {
		assertEquals(300, actualAnswer);
	 }
	 
	 @When("calculate the insurance premium")
	 public void calculate_premium4() {
	 actualAnswer = CarInsurance.getPremium(person4);
	 }

	
	 @Then("we should receive 2000")
	 public void should_receive4() {
		assertEquals(2000, actualAnswer);
	 }

	@When("calculate the insurance premium")
	 public void calculate_premium5() {
	 actualAnswer = CarInsurance.getPremium(person5);
	 }

	
	 @Then("we should receive 200")
	 public void should_receive5() {
		assertEquals(200, actualAnswer);
	 }
 
}
