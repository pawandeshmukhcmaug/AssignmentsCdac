import java.util.Scanner;
 public class SumOfOdd{
    public static void main(String[] args) {
        System.out.println("enter the number");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int sum = 0;
       for(int i=1; i<=number; i++ ){
        if (i%2 != 0) {
         sum = sum + i;}
      }
      System.out.println(sum);
    }
 }