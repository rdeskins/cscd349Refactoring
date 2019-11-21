public class WarriorCrushingBlowBehavior implements AttackBehavior {

    @Override
    public void attack(DungeonCharacter hero, String displayName, DungeonCharacter opponent) {
        if (Math.random() <= .4)
        {
            int blowPoints = (int)(Math.random() * 76) + 100;
            System.out.println(displayName + " lands a CRUSHING BLOW for " + blowPoints
                    + " damage!");
            opponent.subtractHitPoints(blowPoints);
        }//end blow succeeded
        else
        {
            System.out.println(displayName + " failed to land a crushing blow");
            System.out.println();
        }//blow failed
    }

    @Override
    public String toString()
    {
        return "Crushing Blow on Opponent";
    }
}