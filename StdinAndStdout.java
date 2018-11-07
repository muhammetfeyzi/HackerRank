package hackerrank;

import java.util.*;

public class StdinAndStdout {
	/*
	 * Muhammet Feyzi Saðlam 07.11.2018 StdInStdOut
	 * 
	 * In this challenge, you must read  integers from stdin and then print them to stdout. 
	 * Each integer must be printed on a new line To make the problem a little easier, a portion of the code is provided for you in the editor below.
	 * 
	 * Input Format
	 * There are  lines of input, and each line contains a single integer.
	 * 
	 * Sample Input
	 * 42
	   100
	   125
	 *Sample Output
	 * 42
	   100
	   125
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in); // Scan user input value class
		// there are three integer number. user entry three number for tis numbers.
		int a = scan.nextInt();
		int b= scan.nextInt();
		int c= scan.nextInt();
		System.out.println(a+"\n"+b+"\n"+c);
	}

}
