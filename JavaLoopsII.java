package hackerrank;

import java.util.Scanner;
/*
 * Muhammet Feyzi Saðlam 08.11.2018
 * 
 * 0<=q<=500
 * 0<=a,b<=50
 * 1<=n<=15
 * 
 * 
 */

public class JavaLoopsII {

	public static void main(String []args){
		
	        Scanner in = new Scanner(System.in);
	        int t=in.nextInt();
	        for(int i=0;i<t;i++){
	            int a = in.nextInt();
	            int b = in.nextInt();
	            int n = in.nextInt();
	            int res = a;
	            if((a >= 0 & a<=50) && (b>=0 & b<=50) & (n>=1 & n<=15) ){
	            for (int j = 0; j < n; j++)
	            {
	                res += (int)(Math.pow(2, j) * b);
	                System.out.print(Integer.toString(res)  + ' ');
	            }
	            System.out.print('\n');
	        }
	        }
	        in.close();
	    
	}

}
