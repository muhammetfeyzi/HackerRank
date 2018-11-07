package hackerrank;

import java.util.Scanner;
/* 
 * we used printf for formatting output 
 * - left side
 * d digit
 * f folating
 * s string char vb
 * 
 * Input Format
 * Every line of input will contain a String followed by an integer. 
   Each String will have a maximum of  alphabetic characters, and each integer will be in the inclusive range from  0 to 999.
 *
 *Output format
 *In each line of output there should be two columns: 
  The first column contains the String and is left justified using exactly 15 characters. 
  The second column contains the integer, expressed in exactly 3 digits; if the original input has less than three digits, you must pad your output's leading digits with zeroes.
  
  *Sample Input 
  *Java 100
  *cpp 65
  *phyton 50
  *
  *Sample output
  *java     100
  *cpp		065
  *phyton	050
 */
public class JavaOutputFormatting {

	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++){
            String str=sc.next();
            int num=sc.nextInt();
            //Complete this line
            System.out.printf("%-15s%03d\n",str,num);
        }
        System.out.println("================================");

}

}
