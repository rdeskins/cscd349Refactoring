public class ThiefSurpriseAttackBehavior implements AttackBehavior {

	private BaseAttackBehavior baseAttack = new BaseAttackBehavior();
	
	@Override
	public void attack(DungeonCharacter hero, String displayName, DungeonCharacter opponent) {
			double surprise = Math.random();
			if (surprise <= .4)
			{
				System.out.println("Surprise attack was successful!\n" +
									hero.name + " gets an additional turn.");
				//Doug Doner note: we could possibly assign the casted Hero object to a new variable to make it cleaner, but I didn't want to possibly lose the reference
				((Hero)hero).setNumTurns(((Hero)hero).getNumTurns() + 1);
				//Call to baseattack behavior
			    this.baseAttack.attack(hero, displayName, opponent);
			}//end surprise
			else if (surprise >= .9)
			{
				System.out.println("Uh oh! " + opponent.getName() + " saw you and" +
									" blocked your attack!");
			}
			else
				//Call to baseattackbehavior class
			    this.baseAttack.attack(hero, displayName, opponent);
	}
	
    @Override
    public String toString()
    {
        return "Surprise attack opponent";
    }
}