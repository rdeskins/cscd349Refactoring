
public class MonsterBasicHealBehavior implements HealBehavior {
	//-----------------------------------------------------------------
	  public void heal(Monster monster)
	  {
		boolean canHeal;
		int healPoints;

		canHeal = (Math.random() <= monster.getChanceToHeal()) && (monster.getHitPoints() > 0);

		if (canHeal)
		{
			healPoints = (int)(Math.random() * (monster.getMaxHeal() - monster.getMinHeal() + 1)) + monster.getMinHeal();
			monster.addHitPoints(healPoints);
			System.out.println(monster.getName() + " healed itself for " + healPoints + " points.\n"
								+ "Total hit points remaining are: " + monster.getHitPoints());
			System.out.println();
		}//end can heal


	  }//end heal method
}
