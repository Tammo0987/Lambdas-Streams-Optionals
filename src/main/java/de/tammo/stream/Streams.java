package de.tammo.stream;

import java.util.*;
import java.util.stream.Stream;

/**
 * Cheatsheet for streams.
 *
 * @author Tammo
 */
public class Streams {

	public static void main(String[] args) {
		// Einen Stream aus einzelnen Elementen erzeugen.
		Stream<String> stream1 = Stream.of("Test-1", "Test-2");

		// Einen Stream aus eine Collection erzeugen.
		Collection<String> stringList = Arrays.asList("Test-1", "Test-2");
		Stream<String> stream2 = stringList.stream();

		// Einen Stream aus einem array erzeugen.
		String[] array = new String[]{"Test-1", "Test-2"};
		Stream<String> stream3 = Arrays.stream(array);
	}

}
