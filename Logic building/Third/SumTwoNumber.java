import java.util.Scanner;
    
public class SumTwoNumber{
    public static int SumOfTwoNumbers(int first,int second){
      int sum = first+second;
      return sum;
		}

    public static void main(String[] args){
	
     System.out.println("enter the first no. : ");
   	Scanner sc = new Scanner(System.in);
        int first = sc.nextInt();
    
      System.out.println("enter the second no. : ");
        int second = sc.nextInt();
   
    int sum = SumOfTwoNumbers(first,second);
       System.out.println("sum of both number is :"+sum);
       
     }
   }
 