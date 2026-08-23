import java.util.Scanner;
 public class Factorial{
    public static void main(String[] args) {
        System.out.println("enter the number");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int Factorial = 1;
       for(int i=1; i<=number; i++ ){
         Factorial = Factorial*i;
       }
      System.out.println(Factorial);
    }
 }