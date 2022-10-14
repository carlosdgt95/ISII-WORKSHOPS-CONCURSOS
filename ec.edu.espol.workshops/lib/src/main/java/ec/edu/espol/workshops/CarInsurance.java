package ec.edu.espol.workshops;

public class CarInsurance {

	private int age;
	private char sex;
	private boolean status_marital;
	
	private boolean license;
	
	
	// Constructor
	public CarInsurance(int age, char sex, boolean status_marital, boolean license) {
		super();
		this.age = age;
		this.sex = sex;
		this.status_marital = status_marital;
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
	public Boolean getStatus_marital() {
		return status_marital;
	}
	public void setStatus_marital(Boolean status_marital) {
		this.status_marital = status_marital;
	}
	public boolean getLicense() {
		return license;
	}
	public void setLicense(boolean license) {
		this.license = license;
	}
	
	
	// Calculo
	public int getPremium( CarInsurance Persona) {
		int base = 500;
		if ( Persona.getSex() == 'M' && Persona.getStatus_marital() == false  && Persona.getAge() < 25)
			return base + 1500;
		else if (getSex() == 'F' || Persona.getStatus_marital())
			return base - 200;
		else if ( Persona.getAge() > 45  && Persona.getAge() < 65 )
			return base -100 ;
		else if ( Persona.getLicense() == true)
			return base;
		return -1;
	}
	
	public static void main() {
		
		CarInsurance Person1 = new CarInsurance(86,'M',true,true); // No se puede
		CarInsurance Person2 = new CarInsurance(50,'M',false,true); // Si cumple
		CarInsurance Person3 = new CarInsurance(50,'M',false,false); // No cumple
		CarInsurance Person4 = new CarInsurance(24,'M',false,true); // Si cumple
		
	}
	

}