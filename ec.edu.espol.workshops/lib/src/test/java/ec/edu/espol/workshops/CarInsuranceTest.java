/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package ec.edu.espol.workshops;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;


public class CarInsuranceTest {
	@Test public void getPremiunMethod() {
    	
    	// Test case - 001
    	CarInsurance person1 = new CarInsurance(86,'M',true,true);
    	assertEquals(-1 , CarInsurance.getPremium(person1));
    	
    	// Test case - 002
    	CarInsurance person2 = new CarInsurance(45,'M',false,true);
    	assertEquals(400 , CarInsurance.getPremium(person2));
		
    	// Test case - 003
    	CarInsurance person3 = new CarInsurance(26,'F',false,false);
    	assertEquals(300 , CarInsurance.getPremium(person3));
    	
    	// Test case - 004
    	CarInsurance person4 = new CarInsurance(21,'H',false, true) ;
    	assertEquals(2000 , CarInsurance.getPremium(person4));
    	
    	// Test case - 005
    	CarInsurance person5 = new CarInsurance(60,'H',true, true) ;
    	assertEquals(200 , CarInsurance.getPremium(person5));
		
    	// Test case - 006
    	CarInsurance person6 = new CarInsurance(20,'M',true, false) ;
    	assertEquals(-1 , CarInsurance.getPremium(person6));
    	
    	// Test case - 007
    	CarInsurance person7 = new CarInsurance(45,'H',false, false) ;
    	assertEquals(-1 , CarInsurance.getPremium(person7));
    	
    	
    	// Test case - 008
    	CarInsurance person8 = new CarInsurance(50,'M',true, true) ;
    	assertEquals(-1 , CarInsurance.getPremium(person8));
    	
    	
    	// Test case - 009
    	CarInsurance person9 = new CarInsurance(20,'M',true, false) ;
    	assertEquals(-1 , CarInsurance.getPremium(person9));
    	
    	
    }
}
