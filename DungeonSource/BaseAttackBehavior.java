public class BaseAttackBehavior implements AttackBehavior {

    @Override
    public void attack(DungeonCharacter hero, String displayName, DungeonCharacter opponent) {
        boolean canAttack;
        int damage;

        canAttack = Math.random() <= hero.chanceToHit;

        if (canAttack) {
            damage = (int) (Math.random() * (hero.damageMax - hero.damageMin + 1))
                    + hero.damageMin;
            opponent.subtractHitPoints(damage);

            System.out.println();
        }//end if can attack
        else {
            System.out.println(displayName + "'s attack on " + opponent.getName() +
                    " failed!");
            System.out.println();
        }//end else
    }
    
    @Override
    public String toString() {
    	return "Attack opponent";
    }
}