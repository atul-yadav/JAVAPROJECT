package com.jda.utility;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author atul
 *
 */

public class Utility2 {
	Scanner scanner;

	/**
	 * this constructor is for initializing scanner class object
	 */
	public Utility2() {
		scanner = new Scanner(System.in);
	}

	/**
	 * function to take user input as string
	 * 
	 * @return input input return to ReplaceString class
	 */
	public String inputString() {
		return scanner.nextLine();

	}

	/**
	 * function to take user input as integer
	 * 
	 * @return input goes to Flipcoin class
	 */
	public int inputInteger() {
		int input = scanner.nextInt();
		return input;
	}

	public double inputDouble() {
		double input = scanner.nextDouble();
		return input;
	}

	/**
	 * replaceString function replaces the given input string part to user input.
	 * 
	 * @param template
	 *           is given input passing to replaceString function
	 * @param name
	 *           is user input by which we want to replace <<UserName>>
	 * @return
	 */
	public String replaceString(String template, String name) {
		template = template.replace("<<UserName>>", name);
		return template;
	}

	/**
	 * flip coin funtion is drive===
	 * 
	 */
	public void flipcoin(int number) {
		int noOfHeads = 0;

		int noOfTails = 0;
		int noOftoss = number;

		for (int i = 0; i < number; i++) {
			double random = Math.random();
			System.out.println(random);
			if (random < 0.5) {
				noOfTails++;
			} else {
				noOfHeads++;
			}

		}
		System.out.println("no of heads = " + noOfHeads);
		System.out.println("no of tails = " + noOfTails);
		System.out.println("percentage of head = " + (double) (noOfHeads * 100) / noOftoss);
		System.out.println("percentage of head = " + (double) (noOfTails * 100) / noOftoss);

	}

	/**
	 * function to check leap year or not
	 * 
	 * @param year
	 */
	public void leapyear(int year) {

		int count = 0;
		int temp = year;
		while (temp > 0) {
			temp = temp / 10;
			count++;
		}

		if (count == 4) {
			if ((year % 4 == 0 || year % 400 == 0) && year % 100 != 0) {
				System.out.println("Yes, this is leap year");
			} else {
				System.out.println("Not a leap year");
			}
		} else {
			System.out.println("Enter 4 digit number please");
		}
	}

	/**
	 * powervalue function computes the power value of given number
	 * 
	 * @param number
	 */
	public void powervalue(int number) {
		int res = 1;
		int j = 2;
		System.out.println("table of number " + number);
		for (int i = 0; i < number; i++) {
			res = res * j;
			System.out.println(res);
		}

	}

	/**
	 * harmonicValue is function for calculating nth harmonic value.
	 * 
	 * @param number
	 *           is nth value for which harmonic value is to be calculated
	 * @return nth harmonic value.
	 */
	public double harmonicValue(int number) {
		double res = 0.0;
		for (int i = 1; i <= number; i++) {
			res = res + (1.0 / i);
			System.out.println(i + "th harmonic value is  " + res);
		}
		return res;
	}

	/**
	 * primeFactor method is finding the prime factors of given number
	 * 
	 * @param number
	 *           the number is parameter for which we need find prime factors.
	 */
	public void primeFactors(int number) {
		System.out.println("Prime factors of  number  " + number + " " + "are  ");

		for (int i = 2; i * i <= number; i++) {

			while (number % i == 0) {

				System.out.println(i + " ");

				number = number / i;
			}

		}
		if (number > 1) {
			System.out.println(number);
		}
	}

	/**
	 * gambler function basically implement the logic of finding winning and
	 * losing percentage.
	 * 
	 * @param stake
	 *           is initial stake for gambler
	 * @param goal
	 *           is gambler will win if he has cash equals goal
	 * @param trials
	 *           is number of times he is playing
	 */
	public void gambler(int stake, int goal, int trials) {

		int numberOfWins = 0;
		int points;
		for (int i = 0; i < trials; i++) {
			points = stake;
			while (points > 0 && points < goal) {

				if (Math.random() < 0.5) {
					points++;
				} else {
					points--;
				}

			}
			if (points == goal) {
				numberOfWins++;
			}
		}
		System.out.println("Number of wins  =  " + numberOfWins);
		System.out.println("winning %  =  " + ((double) numberOfWins / trials) * 100.00);
		System.out.println("losing  %  = " + (100.00 - ((double) numberOfWins / trials) * 100.00));
	}

	/**
	 * sumzero function finds the triplets and number of triplets whose sum is
	 * zero.
	 * 
	 * @param a
	 *           is array which is taken as input
	 * @param n
	 *           is size of array
	 */
	public void sumzero(int a[], int n) {
		boolean found = true;
		int count = 0;
		for (int i = 0; i < n - 2; i++) {
			for (int j = i + 1; j < n - 1; j++) {
				for (int k = j + 1; k < n; k++) {
					if (a[i] + a[j] + a[k] == 0) {
						System.out.print(a[i] + " ");
						System.out.print(a[j] + " ");
						System.out.print(a[k] + " ");

						count++;
						found = true;
					}

				}
			}
		}
		System.out.println();
		if (found == false) {
			System.out.println("No zero sum triplet exist");
		}
		System.out.println("Number of triplets  = " + count);

	}

	/**
	 * intArray method is array to be read.
	 * 
	 * @param array
	 *           is array to be read
	 * @param m
	 *           is row size
	 * @param n
	 *           is column size
	 */

	public void intArray(int[][] array, int m, int n) {
		System.out.println("enter the array elements");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				array[i][j] = inputInteger();
			}
		}

	}

	/**
	 * printArray function for displaying array elements.
	 * 
	 * @param array
	 *           to be display
	 * @param m
	 *           is row size
	 * @param n
	 *           is column size i
	 */
	public void printArray(int[][] array, int m, int n) {
		intArray(array, m, n);

		PrintWriter p = new PrintWriter(System.out, true);
		p.println("displaying 2d array");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				p.print(array[i][j] + " ");
			}
			p.println();
		}
	}

	/**
	 * @param x
	 *           is x coordinate value
	 * @param y
	 *           is y coordinate value
	 * @return distance between (x,y) and (0,0)
	 */
	public static double getDistance(int x, int y) {
		double distance = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
		return distance;
	}

	/**
	 * coupon function returns total random number needed to have all distinct
	 * numbers
	 * 
	 * @param n
	 *           is number of distinct coupon given
	 */
	public static void coupon(int n) {

		int count = 0;
		int unique = 0;

		int[] checking = new int[n];
		while (unique < n) {
			int var = (int) (Math.random() * n);
			// System.out.print(var+" ");
			count++;
			if (checking[var] != 1) {
				unique++;
				checking[var] = 1;
			}
		}
		System.out.println("total random number needed");
		System.out.println(count);
	}

	/**
	 * function stopwatch prints elapsed time
	 * 
	 * @param start
	 *           is starting time of stopwatch
	 */
	public void stopwatch(long start) {
		start = (System.currentTimeMillis());
		System.out.println("Start  Time is  = " + start);
		for (int i = 0; i < 120000; i++) {
			System.out.print(" ");
		}
		long current = (System.currentTimeMillis());
		System.out.println("End Time is  = " + current);
		System.out.println("total elapsed time  =  " + (current - start));

	}

	/**
	 * quadratic return the roots of given equation.
	 * 
	 * @param a
	 *           is coefficient of X^2
	 * @param b
	 *           is coefficient of X
	 * @param c
	 *           is constant
	 */
	public void quadratic(double a, double b, double c) {
		double d = b * b - 4 * a * c;
		double root1 = (-b + Math.sqrt(d)) / 2 * a;
		double root2 = (-b - Math.sqrt(d)) / 2 * a;

		if (d < 0) {
			System.out.println("roots are imaginery");
		} else {

			System.out.println("root1 =  " + root1);
			System.out.println("root2 =  " + root2);
		}
	}

	/**
	 * Swap Characters at position
	 * 
	 * @param a
	 *           string value
	 * @param i
	 *           position 1
	 * @param j
	 *           position 2
	 * @return swapped string
	 */
	public String swap(String a, int i, int j) {
		char temp;
		char[] charArray = a.toCharArray();
		temp = charArray[i];
		charArray[i] = charArray[j];
		charArray[j] = temp;
		return String.valueOf(charArray);
	}

	/*
	 * permutation function
	 * 
	 * @param str string to calculate permutation for
	 * 
	 * @param l starting index
	 * 
	 * @param r end index
	 */
	int count = 0;

	public void permute(String str, int l, int r) {

		if (l == r) {
			count++;
			System.out.println(str);
		} else {
			for (int i = l; i <= r; i++) {
				str = swap(str, l, i);
				permute(str, l + 1, r);
				str = swap(str, l, i);
			}

		}
		System.out.println(count);
	}

	/**
	 * windChill function prints wind chill
	 * 
	 * @param t
	 *           is temperature
	 * @param v
	 *           is wind speed
	 */
	public void windChill(double t, double v) {
		double w = 35.74 + 0.6215 * t + (0.4275 * t - 35.75) * Math.pow(v, 0.16);
		System.out.println("wind chill  =  " + w);
	}

	static public boolean areAnagram(char[] str1, char[] str2) {
		int n1 = str1.length;
		int n2 = str2.length;
		if (n1 != n2) {
			return false;
		}
		Arrays.sort(str1);
		Arrays.sort(str2);

		for (int i = 0; i < n1; i++) {
			if (str1[i] != str2[i]) {
				return false;
			}
		}

		return true;
	}

	public static boolean isPrime(int n) {

		if (n <= 1)
			return false;

		for (int i = 2; i * i < n; i++)
			if (n % i == 0) {
				return false;
			}

		return true;
	}

	public static boolean isPalindrome(char s[]) {
		int l = s.length;
		for (int i = 0; i < l - 1; i++) {
			if (s[i] != s[l - i - 1]) {
				return false;
			}
		}
		return true;
	}

	public static boolean primePalindrome(int n) {
		if (isPrime(n)) {
			String s1 = Integer.toString(n);
			char[] str1 = s1.toCharArray();
			if (isPalindrome(str1)) {
				return true;
			}
			return false;

		}
		return false;
	}

	public static void primeAnagram() {
		ArrayList<String> list = new ArrayList<>();
		for (int i = 0; i < 1000; i++) {
			if (isPrime(i)) {
				list.add(Integer.toString(i));
			}
		}
		// char[] chars = list.toString().toCharArray();
		for (int i = 0; i < list.size(); i++) {
			for (int j = i + 1; j < list.size(); j++) {
				boolean b = (areAnagram((list.get(i)).toCharArray(), (list.get(j)).toCharArray()));
				if (b) {
					System.out.println("these numbers are anagrams");
					System.out.println(list.get(i) + " " + list.get(j));
				}
			}

		}
	}

	/*
	 * public static int binarySearch(int arr[], int l, int r, int x) { if (r>=l)
	 * { int mid = l + (r - l)/2; if (arr[mid] == x) return mid; if (arr[mid] >
	 * x) return binarySearch(arr, l, mid-1, x);
	 * 
	 * 
	 * return binarySearch(arr, mid+1, r, x); } return -1; }
	 * 
	 * 
	 * public static int binarySearch(String[] a, String x) { int low = 0; int
	 * high = a.length - 1; int mid;
	 * 
	 * while (low <= high) { mid = (low + high) / 2;
	 * 
	 * if (a[mid].compareTo(x) < 0) { low = mid + 1; } else if
	 * (a[mid].compareTo(x) > 0) { high = mid - 1; } else { return mid; } }
	 * 
	 * return -1; }
	 */
	public static <T extends Comparable<T>> T[] insertionSort(T[] elems) {
		int size = elems.length;

		for (int i = 1; i < size; ++i) {
			for (int j = i; j > 0; --j) {
				if (elems[j - 1].compareTo(elems[j]) > 0) {
					T temp = elems[j - 1];
					elems[j - 1] = elems[j];
					elems[j] = temp;
				}
			}
		}
		printarr(elems);
		return elems;

	}

	public static <T extends Comparable<T>> void bubbleSort(T[] arr) {

		T temp;

		boolean swapped = true;

		for (int j = 1; j < arr.length & swapped; j++) {

			swapped = false;

			for (int i = 0; i < arr.length - j; i++) {

				if (arr[i].compareTo(arr[i + 1]) > 0) {

					temp = arr[i];

					arr[i] = arr[i + 1];

					arr[i + 1] = temp;

					swapped = true;

				}

			}
		}
	}

	public static <T extends Comparable<T>> int binarySearch(T[] arr, T value, int lo, int hi) {
		if (lo < hi) {
			int mid = (lo + hi) / 2;
			int cmp = arr[mid].compareTo(value);
			if (cmp == 0) {
				return mid;
			}
			if (cmp > 0) {
				return binarySearch(arr, value, lo, mid - 1);
			}
			if (cmp < 0) {
				return binarySearch(arr, value, mid + 1, hi);
			}

		}
		return -1;
	}

	public static <T> void printarr(T[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
