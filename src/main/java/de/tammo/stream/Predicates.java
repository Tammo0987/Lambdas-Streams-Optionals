package de.tammo.stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * Cheatsheat for {@link Predicate}s.
 *
 * @author Tammo
 */
public class Predicates {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Test-1", "Test-2");

		// Create a Predicate with a lambda expression
		Predicate<String> lambdaPredicate = string -> string.endsWith(".");

		// Create a Predicate with a Method Reference
		Predicate<String> predicate = String::isEmpty;

		// Use a predicate in a stream
		list.stream().filter(predicate).forEach(System.out::println);

		// Link predicates together
		predicate.and(lambdaPredicate);
		predicate.or(lambdaPredicate);

		// Negate predicate
		predicate.negate();

		// Check for none, any or all matches
		System.out.println(list.stream().allMatch(predicate));
		System.out.println(list.stream().anyMatch(predicate));
		System.out.println(list.stream().noneMatch(predicate));
	}

}
