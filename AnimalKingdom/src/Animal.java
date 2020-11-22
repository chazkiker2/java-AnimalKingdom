import java.util.ArrayList;
import java.util.List;

public abstract class Animal
{
	private static int maxId = 0;

	protected int id;

	protected int yearDiscovered;

	protected String name;

	protected List<String> stomach = new ArrayList<>();

	public Animal(
			String name,
			int yearDiscovered)
	{
		this.id = maxId++;
		this.name = name;
		this.yearDiscovered = yearDiscovered;
	}

	public int getYearDiscovered()
	{
		return yearDiscovered;
	}

	public String getName()
	{
		return name;
	}

	public void eat(String food)
	{
		stomach.add(food);
	}

	abstract String move();

	abstract String breath();

	abstract String reproduce();

	@Override
	public String toString()
	{
		return "Animals{id=" + id + ", name=" + name + ", yearDiscovered=" + yearDiscovered + "}\n";
	}
}
