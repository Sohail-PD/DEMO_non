package p1;
import java.util.Scanner;

public class Tables
{
     protected void m1() {  
       
        System.out.println("Give a number:");
        Scanner sc = new Scanner(System.in);
        int N =sc.nextInt();
        for(int i = 1; i <= 10;i++)
        {
            System.out.printf("%d * %d = %d \n", N,i,N * i);
        }
     }
          
}