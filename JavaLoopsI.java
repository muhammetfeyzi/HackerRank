package hackerrank;

import java.util.Scanner;

/*
 * Muhammet Feyzi Saðlam JavaLoopsI
 * Task 
   Given an integer,N , print its first 10 multiples. Each multiple Nxi (where1<=i<=10 ) should be printed on a new line in the form: N x i = result.	
  * 
  * Input Formatting
  * A single integer, N.
  * 
  * Constraints
  * 2<=N<=20
  * 
  * output Format
  * Print  10 lines of output; each line i  (where 1<=i<=10) contains the  of Nxi  in the form: 
  * N x i = result.
 */
public class JavaLoopsI {

	private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        scanner.close();
        if(N>=2 && N<=20){
        	int res=0;
        	for(int i = 1 ; i<=10 ; i++)
        	{ 
        		res=N*i;
        		System.out.println(N+" x "+i+" = "+res);
        	}
        }
    }

}
