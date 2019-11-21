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

}//end Hero class