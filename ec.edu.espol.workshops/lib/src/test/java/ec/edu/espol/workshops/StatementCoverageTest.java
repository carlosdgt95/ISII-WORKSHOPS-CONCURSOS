package ec.edu.espol.workshops;

import static org.junit.Assert.*;



public class StatementCoverageTest {

	public void testStatement() {
		
    	
    	// Test case - 001
    	CarInsurance person1 = new CarInsurance(26,"F",false,true);
    	assertEquals(500 , CarInsurance.getPremium(person1));
    	
    	// Test case - 002
    	CarInsurance person2 = new CarInsurance(85,"M",true,false);
    	assertEquals(-1 , CarInsurance.getPremium(person2));
		
    	// Test case - 003
    	CarInsurance person3 = new CarInsurance(30,"M",true,false);
    	assertEquals(-1 , CarInsurance.getPremium(person3));
    	
    	// Test case - 004
    	CarInsurance person4 = new CarInsurance(24,"M",false, true) ;
    	assertEquals(2000 , CarInsurance.getPremium(person4));
    	
    	// Test case - 005
    	CarInsurance person5 = new CarInsurance(35,"F",true, true) ;
    	assertEquals(300 , CarInsurance.getPremium(person5));
		
    	// Test case - 006
    	CarInsurance person6 = new CarInsurance(47,"F",false, true) ;
    	assertEquals(400 , CarInsurance.getPremium(person6));
    	
    	// Test case - 007
    	CarInsurance person7 = new CarInsurance(52,"M",false, true) ;
    	assertEquals(400 , CarInsurance.getPremium(person7));
    	
    	
    	// Test case - 008
    	CarInsurance person8 = new CarInsurance(29,"M",true, false) ;
    	assertEquals(-1 , CarInsurance.getPremium(person8));
    	
    	
	}

}
