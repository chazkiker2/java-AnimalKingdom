import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main
{
	public static void prettyPrint(List<Animal> animals)
	{
		animals.forEach((a) -> System.out.println(
				"" + a.getName() + " " + a.reproduce() + " " + a.move() + " " + a.breath() + " " + a.getYearDiscovered()
		));
		//			String.format("%'\u0020%'\u0020%'\u0020%'\u0020%", a.getName(), a.reproduce(), a.move(), a.breath(), a.getYearDiscovered())
	}

	public static void main(String[] args)
	{

		//mammals
		Mammal panda = new Mammal("Panda",
				1869);
		Mammal zebra = new Mammal("Zebra",
				1778);
		Mammal koala = new Mammal("Koala",
				1816);
		Mammal sloth = new Mammal("Sloth",
				1804);
		Mammal armadillo = new Mammal("Armadillo",
				1758);
		Mammal raccoon = new Mammal("Raccoon",
				1758);
		Mammal bigfoot = new Mammal("Bigfoot",
				2021);

		//birds
		Bird pigeon = new Bird("Pigeon",
				1837);
		Bird peacock = new Bird("Peacock",
				1821);
		Bird toucan = new Bird("Toucan",
				1758);
		Bird parrot = new Bird("Parrot",
				1824);
		Bird swan = new Bird("Swan",
				1758);

		//fish
		Fish salmon = new Fish("Salmon",
				1758);
		Fish catfish = new Fish("Catfish",
				1817);
		Fish perch = new Fish("Perch",
				1758);

		List<Animal> animals = new ArrayList<>(
				Arrays.asList(
						panda,
						zebra,
						koala,
						sloth,
						armadillo,
						raccoon,
						bigfoot,
						pigeon,
						peacock,
						toucan,
						parrot,
						swan,
						salmon,
						catfish,
						perch
				)
		);

		//	MVP
		System.out.println("\n*** List all the animals in descending order by year named ***");
		//		animals.sort((a1, a2) -> a2.getYearDiscovered() - a1.getYearDiscovered());
		animals.sort(Comparator.comparingInt(Animal::getYearDiscovered)
				.reversed());
		System.out.println(animals);

		System.out.println("\n*** List all the animals alphabetically ***");
		animals.sort((a1, a2) -> a1.getName()
				.compareToIgnoreCase(a2.getName()));
		System.out.println(animals);

		System.out.println("\n*** List all the animals order by how they move ***");
		animals.sort((a1, a2) -> a1.move()
				.compareToIgnoreCase(a2.move()));
		System.out.println(animals);

		//*** List only those animals the breath with lungs ***
		System.out.println("\n*** List only those animals the breath with lungs ***");
		List<Animal> sAnimals = animals.stream()
				.filter((a) -> a.breath()
						.equals("lungs"))
				.collect(Collectors.toList());
		prettyPrint(sAnimals);

		System.out.println("\n*** List only those animals that breath with lungs and were named in 1758 ***");
		List<Animal> lungedAnimals = animals.stream()
				.filter((a) -> a.breath()
						.equals("lungs") && a.getYearDiscovered() == (1758))
				.collect(Collectors.toList());
		prettyPrint(lungedAnimals);

		//*** List only those animals that lay eggs and breath with lungs ***
		System.out.println("\n*** List only those animals that lay eggs and breath with lungs ***");
		List<Animal> eggsAndLungs = animals.stream()
				.filter((a) -> a.breath()
						.equals("lungs") && a.reproduce()
						.equals("eggs"))
				.collect(Collectors.toList());
		prettyPrint(eggsAndLungs);

		//*** List alphabetically only those animals that were named in 1758 ***
		System.out.println("\n*** List alphabetically only those animals that were named in 1758 ***");
		List<Animal> named1758 = animals.stream()
				.filter((a) -> a.getYearDiscovered() == 1758)
				.sorted((a1, a2) -> a1.getName()
						.compareToIgnoreCase(a2.getName()))
				.collect(Collectors.toList());
		prettyPrint(named1758);

		//		STRETCH
		System.out.println("\n*** For the list of animals, list alphabetically those animals that are mammals ***");
		List<Animal> mAnimals = animals
				.stream()
				.filter((a) -> a instanceof Mammal)
				.sorted((a1, a2) -> a1.getName()
						.compareToIgnoreCase(a2.getName()))
				.collect(Collectors.toList());
		prettyPrint(mAnimals);
	}
}
