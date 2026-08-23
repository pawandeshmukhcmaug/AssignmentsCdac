import java.util.Scanner;
public class PrintNames{
   public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      System.out.println("enter 4 names");
      String[] names=new String[4];
      for(int i=0;i<names.length;i++){
         names[i]=sc.next();
      }
 for(String name:names){
         System.out.print(name + " ");
      }
   }
}