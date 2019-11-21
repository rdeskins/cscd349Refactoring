public class SorceressAttackBehavior implements AttackBehavior {

	private BaseAttackBehavior baseAttack = new BaseAttackBehavior();
	
	@Override
	public void attack(DungeonCharacter hero, String displayName, DungeonCharacter opponent) {
		System.out.println(displayName + " casts a spell of fireball at " +
				opponent.getName() + ":");
		
		//Call to BaseAttackBehavior
		this.baseAttack.attack(hero, displayName, opponent);
	}
	
	@Override
	public String toString() {
		return "Attack opponent";
	}
}