package com.training.sdet.homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapTranslationExHW {
	public static void main(String[] args) {
		HashMap<String, String[]> map = null;
		map = setupInitialTranslationMap();

		// Request a string and convert to uppercase for consistent mapKey
		// lookup
		String testPhrase = requestString().toUpperCase();

		while (!testPhrase.equalsIgnoreCase("QUIT")) {
			String[] translationResults = map.get(testPhrase);
			System.out.println("For your phrase: " + testPhrase);
			System.out.print("Translations are: ");
			for (String t : translationResults) {
				System.out.print(t + " | ");
			}
			System.out.print("\n\nTry Again - ");
			
			testPhrase = requestString().toUpperCase();
		}
	}

	private static HashMap<String, String[]> setupInitialTranslationMap() {
		HashMap<String, String[]> map;
		final String[] HELLO_ARRAY = { "Hallo", "Hola", "Bonjour" };
		final String[] GOODBY_ARRAY = { "Auf Wiedersehen", "Adios", "Au Revoir" };
		final String[] EAT_ARRAY = { "Essen", "Comado", "Mangé" };

		map = new HashMap<String, String[]>();
		map.put("HELLO", HELLO_ARRAY);
		map.put("GOODBYE", GOODBY_ARRAY);
		map.put("EAT", EAT_ARRAY);

		System.out.println("Initial map:");
		Set s = map.entrySet();
		Iterator itr = s.iterator();
		while (itr.hasNext()) {
			Map.Entry element = (Entry) itr.next();
			System.out.print("*Phrase: " + element.getKey() + "	");
			String[] translations = (String[]) element.getValue();

			// Study up on these forms... didn't get desired
			// Arrays.asList(element.getValue()).forEach(System.out :: print);
			// Arrays.asList(element.getValue()).forEach((temp) ->
			// System.out.print(temp + " |"));

			System.out.print("Translations: ");
			for (String t : translations) {
				System.out.print(t + " | ");
			}
			System.out.println("");
		}
		return map;
	}

	private static String requestString() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = null;

		try {
			System.out.println("Enter a phrase to translate ('quit' to exit):");
			str = br.readLine();

		} catch (IOException e) {
			System.out.println("Some problem getting a phrase" + e);
		}

		return str;
	}
}
