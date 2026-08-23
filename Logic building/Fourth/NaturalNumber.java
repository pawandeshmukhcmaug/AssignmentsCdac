import java.util.Scanner;
 public class NaturalNumber{
    public static void main(String[] args) {
        System.out.println("enter the number");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
       for(int i=1; i<=number; i++ ){
        System.out.print(i + " ");
       }
    }
 }