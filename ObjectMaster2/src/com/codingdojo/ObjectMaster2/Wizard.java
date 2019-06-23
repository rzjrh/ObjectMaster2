package com.codingdojo.ObjectMaster2;

public class Wizard extends Human{
	
	
	//creating constructor for wizard that calls attributes from Human.java class
	public Wizard () {
		this.health= 50;			//call health method in Human class as set the default value of 50- Override
		this.intelligence= 8; 		//call intelligence method in Human class and set default value of 8- Override
	}

	
	
	
	//Add a method heal(Human) that heals the other human by the wizard's intelligence
	public void heal(Human WizardMethod) {			//Human(call the Human Class) 	WizardMethod(we named it to call Human class)
		System.out.println("Wizard heals another human:"+"\n	another human's health increased");
		WizardMethod.health += intelligence;		//WizardMethod (what we named it in heal method) call the health in Human class and add intelligence
	}
	
	
	
	
	// Add a method fireball(Human) that decreases the other human's health by the wizard's intelligence * 3
	public void fireball(Human WizardMethod) {
		System.out.println("Wizard throws a Fireball"+ "\n	other human's health decreased");
		WizardMethod.health = WizardMethod.health - (this.intelligence*3);
	}
	
	
	
	
	//method to display the summary report 
	public void displayHealth() {
		if (this.health==0) {
			System.out.println("\nHere is summary report of Wizard: "+ "\nWizard Killed! Health is Zero");
		}	
	
		else 
		System.out.println("\nHere is summary report of Wizard: ");
		System.out.println("Updated Health Status: "+health);
		System.out.println("Updated Stealth Status: "+stealth);
		System.out.println("Updated Strength Status: "+strength);
		System.out.println("Updated Intelligence Status: "+intelligence);
		
		
		}
		
	
	
	
}
