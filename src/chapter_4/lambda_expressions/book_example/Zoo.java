package chapter_4.lambda_expressions.book_example;

import chapter_4.lambda_expressions.book_example.Animal;

import java.util.ArrayList;
import java.util.List;

public class Zoo {

	public void printHoppers(List<Animal> animals) {
		for(Animal a : animals) {
			if(a.canHop()) {
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

		Zoo zoo = new Zoo();
		zoo.printHoppers(animals);
	}
}
