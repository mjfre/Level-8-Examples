package chapter_4.lambda_expressions.book_example;

import chapter_4.lambda_expressions.book_example.Animal;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ZooPredicate {

	public void print(List<Animal> animals, Predicate<Animal> checker) {
		for(Animal a : animals) {
			if(checker.test(a)) {
				System.out.println(a);
			}
		}
	}

	public static void main(String[] args) {
		Animal fish = new Animal("fish", false, true);
		Animal kangaroo = new Animal("kangaroo", true, false);
		List<Animal> animals = new ArrayList<>();
		animals.add(fish);
		animals.add(kangaroo);

		ZooPredicate zoo = new ZooPredicate();
		zoo.print(animals, cheeseburger -> cheeseburger.canHop());
		zoo.print(animals, a -> a.canSwim());
		zoo.print(animals, a -> a.getSpecies().startsWith("f"));

		animals.removeIf( a -> a.canHop());
		System.out.println(animals);
	}
}







