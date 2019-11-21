import java.util.Scanner;

/**
 * Title:
 * Description:
 * Copyright:    Copyright (c) 2001
 * Company:
 * @author
 * @version 1.0
 */




public class Warrior extends Hero
{

    public Warrior(String name)
	{

		super("Warrior", 125, 4, .8, 35, 60, .2,name );
		
		//This is an array containing all possible attacks for a warrior
		AttackBehavior[] warriorAttacks = {new WarriorAttackBehavior(), new WarriorCrushingBlowBehavior()};
		
		//This sets the attackBehaviors array in the parent DungeonCharacter class
		this.setAttackBehaviors(warriorAttacks);
		
    }//end constructor

	public void attack(DungeonCharacter opponent)
	{
		
		//This attack is set at runtime when user chooses which attack to use
		this.attackBehavior.attack(this, name, opponent);
	}//end override of attack method


	

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

}//end Hero class