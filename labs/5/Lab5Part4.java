package lab5;
//Java program to find given two array 
//are equal or not using hashing technique 
import java.util.*;  

class Lab5Part4
{ 
	// Returns true if x[0..n-1] and y[0..m-1] contain same elements. 
	public static boolean areEqual(int x[], int y[]) 
	{ 
		int n = x.length; 
		int m = y.length; 
		
		// If lengths of arrays are not equal 
		if (n != m) 
			return false; 

		// Store x[] elements and their counts in hash map 
		Map<Integer, Integer> map = new HashMap<Integer, Integer>(); 
		int count = 0; 
		for (int i = 0; i < n; i++) 
		{ 
			if(map.get(x[i]) == null) 
				map.put(x[i], 1); 
			else
			{ 
				count = map.get(x[i]); 
				count ++; 
				map.put(x[i], count); 
			} 
		} 

		// Traverse y[] elements and check if all elements of y[] are present same number of times or not. 
		for (int i = 0; i < n; i++) 
		{ 
			// If there is an element in y[], but not in x[] 
			if (!map.containsKey(y[i])) 
				return false; 

			// If an element of y[] appears more times than it appears in x[] 
			if (map.get(y[i]) == 0) 
				return false; 

			count = map.get(y[i]); 
			--count; 
			map.put(y[i], count); 
		} 
	
		// Make sure all elements become zero 
		for(int i = 0; i < n; i++) 
		{ 
			if(map.get(y[i]) > 0) 
				return false; 
		} 
		return true; 
	} 
	
	// Main code 
	public static void main (String[] args) 
	{ 
		int x[] = { 3, 5, 2, 5, 2}; 
		int y[] = { 2, 3, 5, 5, 2}; 
		
		if (areEqual(x, y)) 
			System.out.println("Yes"); 
		else
			System.out.println("No"); 

	} 
} 
