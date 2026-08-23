import java.util.*;
public class LargestElement{
   public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      int[] numbers=new int[5];

      System.out.println("Enter 5 integers:");
      for(int i=0;i<numbers.length;i++){
         numbers[i]=sc.nextInt();
      }

      Arrays.sort(numbers);

      System.out.println("The largest element is: "+numbers[numbers.length-1]);
   }
}