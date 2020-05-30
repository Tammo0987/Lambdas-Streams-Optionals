package de.tammo.optional;

import java.util.Optional;

/**
 * Cheatsheet for optionals.
 *
 * @author Tammo
 */
public class Optionals {

	public static void main(String[] args) {

		// Leeres Optional erzeugen
		Optional<String> emptyOptional = Optional.empty();

		// Optional für eine non nullable variable erzeugen. Falls der Wert null ist, dann wird eine
		// NullPointerException
		// geworfen.
		Optional<String> nonNullableOptional = Optional.of("Value");

		// Optional für eine nullable variable erzeugen.
		Optional<String> nullableOptional = Optional.ofNullable("Value");



		// Abfragen ob ein Optional einen Wert besitzt. Ab Java 9 geht auch optional#isEmpty().
		if (emptyOptional.isPresent()) {
			// ...
		}

		// Abfragen ob ein Optional einen Wert besitzt in Lambda Form.
		emptyOptional.ifPresent(System.out::println);


		// Wert aus Optional auslesen.
		nonNullableOptional.get();

		// Wert aus Optional auslesen und falls er null ist, einen default Wert nutzen.
		nullableOptional.orElse("Defaul Value");

		// Wert aus Optional auslesen und falls er null ist, eine Exception werfen.
		nullableOptional.orElseThrow(IllegalArgumentException::new);
	}

}
