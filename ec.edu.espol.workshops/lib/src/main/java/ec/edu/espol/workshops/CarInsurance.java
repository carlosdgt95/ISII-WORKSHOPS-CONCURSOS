package ec.edu.espol.workshops;

import java.util.Scanner;

public class CarInsurance {

	private int age;
	private String sex;
	private boolean statusMarital;
	private boolean license;
	
	// Constructor
	public CarInsurance(int age, String sex, boolean statusMarital, boolean license) {
		super();
		this.age = age;
		this.sex = sex;
		this.statusMarital = statusMarital;
		this.license = license;
	}
	
	public CarInsurance(int age) {
		super();
		this.age = age;

	}
	public CarInsurance() {
		super();
	}


	public CarInsurance(int age, String sex, boolean license) {
		super();
		this.age = age;
		this.sex = sex;
		this.license = license;
	}
	
	// Getters And Setters
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
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
		int base = 600;
		
		if (Persona.getSex() == "M" && Persona.isStatusMarital() == false  && Persona.getAge() < 25 && Persona.isLicense() == true)
			return base + 1500;
		else if (Persona.getSex() == "F" || Persona.isStatusMarital()  && Persona.isLicense() == true)
			return base - 200;
		else if (Persona.getAge() > 45  && Persona.getAge() < 65  && Persona.isLicense() == true)
			return base -100;
		else if (Persona.getAge() > 80  && Persona.isLicense() == false)
			return -1;
		
		return -1;
	}
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);

		System.out.println("Ingrese su edad: ");
		int age = sc.nextInt();

		System.out.println("Ingrese su sexo (F/M): ");
		String sex = sc.next();

		System.out.println("Ingrese su estaus marital (soltero, casado): ");
		Boolean statusMarital = sc.nextBoolean();

		System.out.println("Posee licencia (true, false): ");
		Boolean license = sc.nextBoolean();

		CarInsurance person = new CarInsurance(age,sex,statusMarital,license);

		
		System.out.println("get Premium: " +getPremium(person));
		
	}
	
}
