package com.training.sdet.homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapTranslationExHW {
	public static void main(String[] args) {
		HashMap<String, String[]> map = null;

		// TODO Instead of setting up from static, should read from a file
		// TODO Once translations are from a file, updates should be saved there
		map = setupInitialTranslationMap();

		// Request a string and convert to upper case for consistent lookup
		String testPhrase = requestStringForTranslation().toUpperCase();

		while (!testPhrase.equalsIgnoreCase("QUIT")) {
			String[] translationResults = map.get(testPhrase);
			if (translationResults != null) {
				System.out.println("Your phrase: " + testPhrase);
				System.out.print("Translations are: ");
				for (String t : translationResults) {
					System.out.print(t + " | ");
				}
				System.out.print("\n\nTry Again - ");
			} else {
				System.out.print("Your phrase: " + testPhrase + " was not found...\n\n	");

				// Ask user if they want it added to the map and request 3 words
				if (addToMap()) {
					// Get the list of translations for testPrase and add to MAP
					System.out.println("Please provide the details now and we'll add your translation.");
					String[] translations = { 
							requestLanguageTranslation("German"),
							requestLanguageTranslation("Spanish"),
							requestLanguageTranslation("French") };
					map.put(testPhrase, translations);
					System.out.println("Thanks. You can continue including your new entry.\n\n");
				}
			}
			testPhrase = requestStringForTranslation().toUpperCase();
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
		Set<Entry<String, String[]>> s = map.entrySet();
		Iterator<Entry<String, String[]>> itr = s.iterator();
		while (itr.hasNext()) {
			Map.Entry element = (Entry) itr.next();
			System.out.print("-*- Phrase: " + element.getKey() + " ");
			String[] translations = (String[]) element.getValue();

			// Study up on these forms... didn't get desired
			// Arrays.asList(element.getValue()).forEach(System.out :: print);
			// Arrays.asList(element.getValue()).forEach((temp) ->
			// System.out.print(temp + " |"));

			System.out.print("	Translations: ");
			for (String t : translations) {
				System.out.print(t + " | ");
			}
			System.out.println(" ");
		}
		System.out.println("\nReady to do some looking up... \n");

		return map;
	}

	private static boolean addToMap() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		boolean addToMap = false;

		String response = null;
		try {
			System.out.println("Would you like to add translations (Y/N):  ");
			response = br.readLine();

			// Only evaluate the 1st character of the response
			if (response.substring(0, 1).equalsIgnoreCase("Y")) {
				addToMap = true;
			}

			
			
		} catch (IOException e) {
			System.out.println("Some problem getting a phrase" + e);
		}

		return addToMap;
	}

	private static String requestLanguageTranslation(String language) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = null;

		try {
			System.out.println("Enter a translation for " + language + ":");
					str = br.readLine();

		} catch (IOException e) {
			System.out.println("Some problem getting a phrase" + e);
		} 

		return str;
	}
	
	private static String requestStringForTranslation() {
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
