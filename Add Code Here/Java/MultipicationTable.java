

import java.util.Scanner;

/**
 * program to print multiplication table of given number
 * @author includehelp
 */
public class MultipicationTable {

  public static void main(String[] args) {
    
        Scanner sc  =   new Scanner(System.in);
        
        System.out.print("Enter Number  : ");
        int num =   sc.nextInt();
        
        for(int i=1;i<=num;i++){
            int result = num*i;
            
            System.out.println(num+"*"+i+" = "+result);
        }
    }
}