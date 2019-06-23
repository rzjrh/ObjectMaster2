package com.codingdojo.ObjectMaster2;

public class Samurai extends Human{

	
	
	
	public int NumberOfSamurai=0;	//this is variable to add one Samurai for each attack and count number of Samuraies at the end
	
	
	
	
	//Override the health by 200
	public Samurai() {
		this.health=200;
	}
	
	
	
	
	
	public void deathBlow(Human SamMethod) {
		System.out.println("Samurai killed another human:"+ "\n	Another human(Health= 0)"+"\n	Samurai health decreased by half");
		SamMethod.health = 0;
		this.health = (this.health/2);
		NumberOfSamurai += 1; 		//add one Samurai after each attack
	}
	
	
	
	
	
	//Add a method meditate() that heals the Samurai for half of their current health
	public void meditate() {
		this.health += (this.health/2);
		NumberOfSamurai += 1; 		//add one Samurai after each attack		
	}
	
	
	
	
	
	//Add a method howMany() that returns the total current number of Samurai
	//we already made the NumberOfSamurai in the beginning of this class
	public  void howMany() {
		System.out.println("\nTotal current number of Samurai is: "+NumberOfSamurai);
	}
	
	
	
	
	
	
	//method to display the summary report 
	public void displayHealth() {
		if (this.health==0) {
			System.out.println("\nHere is summary report of Samurai: "+ "\nSamurai Killed! Health is Zero");
		}	
	
		else 
		System.out.println("\nHere is summary report of Samurai: ");
		System.out.println("Updated Health Status: "+health);
		System.out.println("Updated Stealth Status: "+stealth);
		System.out.println("Updated Strength Status: "+strength);
		System.out.println("Updated Intelligence Status: "+intelligence);
		System.out.println("Number of Samurai involved: "+NumberOfSamurai);
		
	}
	
	
}
