package com.java8.sample;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class JavaStream {
	public static void main(String args[]) {
		new JavaStream().doWork();
	}

	private void doWork() {
		Stream<Integer> values = Stream.of(1, 2, 4, 6);
		Stream<String> wordStream = Stream.of("word", "is", "the", "best");
		Stream<String> wordStream1 = Stream.of("word", "is", "the", "best");
		Stream<String> wordStream2 = Stream.of("word", "is", "the", "best");
		Stream<Stream<Character>> ss = wordStream
				.map(JavaStream::characterStream);

		// ---------------
		Object[] powers = Stream.iterate(1.0, p -> p * 2)
				.peek(e -> System.out.println("Fetching " + e)).limit(20)
				.toArray();

		// Stream<String> longestFirst = wordStream
		// .sorted(Comparator.comparing(String::length).reversed());

		// ------------------
		Optional<String> largest = wordStream1
				.max((str, str1) -> str.length() - str1.length());
		largest.ifPresent(System.out::println);

		// -------------------------
		boolean aWordStartsWithQ = wordStream2.parallel()
				.anyMatch(s -> s.startsWith("Q"));
		
		//--------------------
		Optional<Integer> sum = values.reduce(Integer :: sum);

	}

	public static Stream<Character> characterStream(String s) {
		List<Character> result = new ArrayList<>();
		for (char c : s.toCharArray())
			result.add(c);
		return result.stream();
	}

}
