import java.util.Scanner;
public class SumOfNumbers{
   public static void calculateSum(int number){
   
  
  int sum = 0;
  for(int i=1; i<=number; i++){
    sum= i+sum;
    }
  System.out.println(sum);
}
   public static void main(String[] args){
   Scanner sc= new Scanner(System.in);
 System.out.println("enter the number");
   int number = sc.nextInt();
   calculateSum(number);
 }
}