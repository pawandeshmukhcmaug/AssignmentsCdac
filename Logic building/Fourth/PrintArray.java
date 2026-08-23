import java.util.*;
public class PrintArray {
    public static void main(String[] args) {
        System.out.println("enter 5 numbers : ");
        Scanner sc = new Scanner(System.in);
        int[] number = new int[5];
        for(int i=0; i<5; i++){
             number[i] = sc.nextInt();
        }
        for(int value : number ){
           System.out.print(value + " ");
        }
    }
}
