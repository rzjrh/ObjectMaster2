package com.codingdojo.ObjectMaster2;

//import com.codingdojo.ObjectMaster1.Ninja;
//import com.codingdojo.ObjectMaster1.Samurai;
//import com.codingdojo.ObjectMaster1.Wizard;

public class HumanTest {
	
public static void main(String[] args) {
		
		//create objects for all three classes of human's extension
		Ninja NJ = new Ninja();
		Wizard Wiz = new Wizard();
		Samurai Sam = new Samurai();
		
		
		System.out.println("Activity Log:");
		
		Wiz.heal(Wiz);
		NJ.steal(Sam);
		NJ.runAway();
		Wiz.fireball(Sam);
		Wiz.heal(NJ);
		Sam.deathBlow(Wiz);
		Sam.meditate();
		Sam.meditate();
		Sam.meditate();
		NJ.steal(Sam);
		NJ.steal(Sam);
		NJ.steal(Sam);
		NJ.runAway();
		
		
		System.out.println("\n\n\nHuman's Summary Report:");
		
		//display the summary report of each human
		Wiz.displayHealth();
		NJ.displayHealth();
		Sam.displayHealth();
		
		
		//as asked
		Sam.howMany();
		
//end		
}
}
