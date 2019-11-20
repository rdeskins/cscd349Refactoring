
public class HeroFactory {
	public static Hero createHero(String type,String name)
	{
		Hero hero = null;
		if(type.equals("Sorceress"))
		{
			hero = new Sorceress(name);
		}
		else if(type.equals("Thief"))
		{
			hero = new Thief(name);
		}
		else if(type.equals("Warrior"))
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
