public class Bird extends Animal
{
	public Bird(
			String name,
			int yearDiscovered)
	{
		super(name,
				yearDiscovered);
	}

	public String move()
	{
		return "fly";
	}

	public String breath()
	{
		return "lungs";
	}

	public String reproduce()
	{
		return "eggs";
	}
}
