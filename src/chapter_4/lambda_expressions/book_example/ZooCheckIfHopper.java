package chapter_4.lambda_expressions.book_example;

import chapter_4.lambda_expressions.book_example.Animal;
import chapter_4.lambda_expressions.book_example.CheckIfHopper;

import java.util.ArrayList;
import java.util.List;

public class ZooCheckIfHopper {

	public void print(List<Animal> animals, CheckIfHopper checker) {
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

		ZooCheckIfHopper zoo = new ZooCheckIfHopper();
		zoo.print(animals, new CheckIfHopper());
	}
}
