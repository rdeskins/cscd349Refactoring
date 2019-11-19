
public class HeroFactory {
	public static Hero createHero(String type,String name)
	{
		Hero hero = null;
		if(type == "Sorceress")
		{
			hero = new Sorceress(name);
		}
		else if(type == "Thief")
		{
			hero = new Thief(name);
		}
		else if(type == "Warrior")
		{
			hero = new Warrior(name);
		}
		else
		{
			throw new java.lang.IllegalArgumentException();
		}
		return hero;
	}
}
