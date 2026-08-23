import java.util.Scanner;
 public class EvenNumber{
    public static void main(String[] args) {
        System.out.println("enter the number");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
       for(int i=1; i<=number; i++ ){
        if (i%2==0) {
         System.out.println(i + " ");
        }
       }
    }
 }