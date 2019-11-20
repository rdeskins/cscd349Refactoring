public class SorceressIncreaseHitpointsBehavior implements AttackBehavior {

	@Override
	public void attack(DungeonCharacter hero, String displayName, DungeonCharacter opponent) {
	    
		int hPoints;

		hPoints = (int)(Math.random() * (((Sorceress)hero).MAX_ADD - ((Sorceress)hero).MIN_ADD + 1)) + ((Sorceress)hero).MIN_ADD;
		hero.addHitPoints(hPoints);
		System.out.println(hero.name + " added [" + hPoints + "] points.\n"
							+ "Total hit points remaining are: "
							+ hero.hitPoints);
		 System.out.println();
		
	}
	
    @Override
    public String toString() {
    	return "Increase Hit Points";
    }

}