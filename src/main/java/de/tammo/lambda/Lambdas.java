package de.tammo.lambda;

import java.util.Arrays;
import java.util.List;

/**
 * Cheatsheet for lambda expressions and forEach.
 *
 * @author Tammo
 */
public class Lambdas {

	public static void main(String[] args) {

		// Generelle Syntax einer Lambda Expression: (Typ param1, Typ param2) -> { statement(); }

		// Einen Runnable erzeugen vor Java 8.
		Runnable runnable = new Runnable() {

			@Override
			public void run() {
				System.out.println("Hello World");
			}
		};

		// Einen Runnable erzeugen mit lambda expressions.
		Runnable runnableLambda = () -> System.out.println("Hello World");


		List<String> strings = Arrays.asList("Hello", "World", "420");

		// Durch eine Liste iterieren vor Java 8.
		for (String string : strings) {
			System.out.println(string);
		}

		// Durch eine Liste iterieren mit lambda expressions.
		strings.forEach(element -> System.out.println(element));

		// Durch eine Liste iterieren mit einer Methoden referenz.
		strings.forEach(System.out::println);
	}

}
