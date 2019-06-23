package com.codingdojo.ObjectMaster2;

public class Ninja extends Human {
	


	public Ninja () {
		this.stealth= 10;		//Set default stealth to 10
		
	}

	
	
	/*Add a method steal(Human) that takes the amount of stealth the ninja has,
	  removes it from the other human's health adds it to the ninja's */
	public void steal (Human NinjaMethod) {
		System.out.println("Ninja steal from another human:"+"\n	Ninja's health increased, another human's health decreased");
		NinjaMethod.health -= stealth;			//remove stealth from Ninja
		this.health += stealth;					//add health to Ninja
	
	}
	
	
	
	
	
	//Add a method runAway() that decreases their health by 10
	public void runAway() {
		System.out.println("Ninja runs away:"+"\n	health decreased by (-10)");
		this.health -= 10;
	}
	
	
	
	
	//method to display the summary report 
	public void displayHealth() {
		if (this.health==0) {
			System.out.println("\nHere is summary report of Ninja: "+ "\nNinja Killed! Health is Zero");
		}	
	
		else 
		System.out.println("\nHere is summary report of Ninja: ");
		System.out.println("Updated Health Status: "+health);
		System.out.println("Updated Stealth Status: "+stealth);
		System.out.println("Updated Strength Status: "+strength);
		System.out.println("Updated Intelligence Status: "+intelligence);
		
	}
	
	
}
