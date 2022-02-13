package chapter_4.lambda_expressions.book_example;

import chapter_4.lambda_expressions.book_example.Animal;
import chapter_4.lambda_expressions.book_example.CheckTrait;

import java.util.ArrayList;
import java.util.List;

public class ZooCheckTrait {


	public void print(List<Animal> animals, CheckTrait checker) {
		for(Animal a : animals) {
			if(checker.checkIf(a)) {
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

		ZooCheckTrait zoo = new ZooCheckTrait();
		//zoo.print(animals, new CheckIfHopper());

		zoo.print(animals, a -> a.canHop());
		zoo.print(animals, (Animal a) -> {
			System.out.println("hello");
			return a.canHop();
		});
//
		zoo.print(animals, (a) -> a.canSwim());
		zoo.print(animals, a -> a.getSpecies().startsWith("k"));

	}
}
