package animalkingdom;

public class Fish extends Animal
{
	public Fish(
			String name,
			int yearDiscovered)
	{
		super(name,
				yearDiscovered);
	}

	public String move()
	{
		return "swim";
	}

	public String breath()
	{
		return "gills";
	}

	public String reproduce()
	{
		return "eggs";
	}
}
