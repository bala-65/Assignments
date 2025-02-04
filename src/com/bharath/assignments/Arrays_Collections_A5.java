package com.bharath.assignments;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Arrays_Collections_A5 {

	public static void main (String [] args) {
		
		//Creating a list of the top 5 most populated countries in the world 
		List<String> popularCountries= new ArrayList<String>();
		
		//Source: Worldometer
		popularCountries.add("India");
		popularCountries.add("China");
		popularCountries.add("US");
		popularCountries.add("Indonesia");
		popularCountries.add("Pakistan");
		
		//Printing 2nd country in the list
		System.out.println("The second most populated country is: " + popularCountries.get(1));
		
	
		
		//Creating a set of the top 10 most visited tourist attractions in the world 
		Set<String> mostVisited= new HashSet<String>();
		
		//Source: Indian Express
		mostVisited.add("Empire State Building");
		mostVisited.add("Eiffel Tower");
		mostVisited.add("Anne Frank House");
		mostVisited.add("Basílica de la Sagrada Familia");
		mostVisited.add("Cayman Crystal Caves");
		mostVisited.add("Colosseum");
		mostVisited.add("Louvre Museum");
		mostVisited.add("Gardens by the Bay");
		mostVisited.add("Duomo di Milano");
		mostVisited.add("Sheikh Zayed Grand Mosque Centre");
		
		//Printing out its size
		System.out.println("The size of the most visited tourist attraction is: "+ mostVisited.size());
		
		
		
		//Creating a map of the 5 largest cities in the United States and their populations.
		Map<String, Integer> largestCities= new HashMap<String, Integer>();
		
		//Source: U.S. Census Bureau as of 2022
		largestCities.put("New York City", 8335897);
		largestCities.put("Los Angeles", 3822238);
		largestCities.put("Chicago", 2665039);
		largestCities.put("Houston", 2302878);
		largestCities.put("Phoenix", 1644409);
		
		//Printing out the values
		System.out.println("The top 5 largest cities in US and their population is: " + largestCities);
		
		
		
		//Creating an array of 10 random integers
		int [] sums= {90, 89, 04, 9, 85, 673, 957, 54, 74, 955};
		int add= sums[2]+sums[4];
		
		//Printing out the sum of 3rd and 5th Value.
		System.out.println("The sum of 3rd and 5th value is: "+ add);
		//System.out.println("The sum of 3rd and 5th value is: " + sums[2] + sums[4]);
		
		
		
		//Creating a list of the top 5 highest-grossing movies of all time
		List<String> highestGross= new ArrayList<String>();
	
		//Source: boxofficemojo
		highestGross.add("Avatar");
		highestGross.add("Avengers: Endgame");
		highestGross.add("Avatar: The Way of Water");
		highestGross.add("Titanic");
		highestGross.add("Star Wars: Episode VII - The Force Awakens");
		
		//Printing out the third movie on the list
		System.out.println("The top 3rd highest gross movie of all time is: " + highestGross.get(2));
	}
	
	
}

