import java.util.Scanner;

/**
 * Title:
 * Description:
 * Copyright:    Copyright (c) 2001
 * Company:
 * @author
 * @version 1.0
 */



public class Sorceress extends Hero
{
	public final int MIN_ADD = 25;
	public final int MAX_ADD = 50;

//-----------------------------------------------------------------
    public Sorceress(String name)
	{	
		super("Sorceress", 75, 5, .7, 25, 50, .3,name);
		
		//Adds Sorceress attacks to AttackBehavior array
		AttackBehavior[] sorceressAttacks = {new SorceressAttackBehavior(), new SorceressIncreaseHitpointsBehavior()};
		//Sets sorceress attack behaviors array
		this.setAttackBehaviors(sorceressAttacks);
    }//end constructor

	public void attack(DungeonCharacter opponent)
	{
		
		//This attack is set at runtime when user chooses which attack to use
		this.attackBehavior.attack(this, name, opponent);
	}//end override of attack method
    
//-----------------------------------------------------------------
    public void battleChoices(DungeonCharacter opponent,Scanner kb)
	{
		int choice = -1;

		super.battleChoices(opponent, kb);

		do
		{
			
			//Iterates through available attacks for user to choose from
			for(int i = 0; i < attackBehaviors.length; i++)
				System.out.println(i + 1 + ". " + attackBehaviors[i]);

			
			//While the choice is outside of the range of the possible attacks array
			while(choice < 0 || choice > attackBehaviors.length)
			{
				try
				{
					System.out.print("Enter your choice: ");
					choice = Integer.parseInt(kb.next());
					kb.nextLine();
				}
				catch(Exception e)
				{
					System.out.println("invalid choice!");
				}
			}

			//Sets attackBehavior to array index that user chose
			this.attackBehavior = attackBehaviors[choice - 1];

			
			//Calls Sorceress.attack(), passing opponent as a parameter
			this.attack(opponent);

			this.numOfAttacks--;
			if (numOfAttacks > 0)
				System.out.println("Number of turns remaining is: " + numOfAttacks);

		} while(numOfAttacks > 0 && opponent.isAlive());

    }//end battleChoices method
}//end class