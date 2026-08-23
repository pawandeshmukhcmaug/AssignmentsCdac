import java.util.*;
public class FindIndex{
   public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      int[] numbers=new int[5];

      System.out.println("Enter 5 integers:");
      for(int i=0;i<numbers.length;i++){
         numbers[i]=sc.nextInt();
      }

      System.out.println("Enter the number to search:");
      int search=sc.nextInt();

      Arrays.sort(numbers);

      int index=Arrays.binarySearch(numbers,search);

      if(index>=0){
         System.out.println("Index: "+index);
      }else{
         System.out.println("Not Found");
      }
   }
}