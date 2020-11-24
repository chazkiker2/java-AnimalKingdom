package animalkingdom;

public class Mammal extends Animal
{
	public Mammal(
			String name,
			int yearDiscovered)
	{
		super(name,
				yearDiscovered);
	}

	public String move()
	{
		return "walk";
	}

	public String breath()
	{
		return "lungs";
	}

	public String reproduce()
	{
		return "live-births";
	}
}
