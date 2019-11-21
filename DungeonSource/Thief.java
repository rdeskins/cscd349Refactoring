import java.util.Scanner;

/**
 * Title:
 * Description:
 * Copyright:    Copyright (c) 2001
 * Company:
 * @author
 * @version 1.0
 */

public class Thief extends Hero
{

    public Thief(String name)
	{
		super("Thief", 75, 6, .8, 20, 40, .5,name);

		//Creating BaseAttackBehavior array,
		AttackBehavior[] thiefAttacks = {new BaseAttackBehavior(), new ThiefSurpriseAttackBehavior()};
		this.setAttackBehaviors(thiefAttacks);
    }//end constructor

	public void attack(DungeonCharacter opponent)
	{
		
		//This attack is set at runtime when user chooses which attack to use
		this.attackBehavior.attack(this, name, opponent);
	}//end override of attack method
}