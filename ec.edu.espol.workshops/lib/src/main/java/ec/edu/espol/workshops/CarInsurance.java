package ec.edu.espol.workshops;

public class CarInsurance {

	private int age;
	private char sex;
	private boolean statusMarital;
	private boolean license;
	
	// Constructor
	public CarInsurance(int age, char sex, boolean statusMarital, boolean license) {
		super();
		this.age = age;
		this.sex = sex;
		this.statusMarital = statusMarital;
		this.license = license;
	}
	
	// Getters And Setters
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public char getSex() {
		return sex;
	}
	public void setSex(char sex) {
		this.sex = sex;
	}
	public Boolean isStatusMarital() {
		return statusMarital;
	}
	public void setstatusMarital(Boolean statusMarital) {
		this.statusMarital = statusMarital;
	}
	public boolean isLicense() {
		return license;
	}
	public void setLicense(boolean license) {
		this.license = license;
	}

		
	public static int getPremium(CarInsurance Persona) {
		int base = 500;
		if (Persona.getSex() == 'M' && Persona.isStatusMarital() == false  && Persona.getAge() < 25)
			return base + 1500;
		else if (Persona.getSex() == 'F' || Persona.isStatusMarital())
			return base - 200;
		else if (Persona.getAge() > 45  && Persona.getAge() < 65 )
			return base -100;
		else if (Persona.isLicense() == true)
			return base;
		return -1;
	}
	

	public static void main() {
		
		//CarInsurance person1 = new CarInsurance(86,'M',true,true); // No se puede
		//CarInsurance person2 = new CarInsurance(50,'M',false,true); // Si cumple
		//CarInsurance person3 = new CarInsurance(50,'M',false,false); // No cumple
		//CarInsurance person4 = new CarInsurance(24,'M',false,true); // Si cumple
		
	}
	
}