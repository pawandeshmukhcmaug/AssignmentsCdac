import java.util.*;

public class CheckPalindrome{
   public static void main(String[] args){
      Scanner sc=new Scanner(System.in);

      System.out.print("Enter a string: ");
      String str=sc.nextLine();

      String clean=str.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
      String rev="";

      for(int i=clean.length()-1;i>=0;i--){
         rev=rev+clean.charAt(i);
      }

      if(clean.equals(rev)){
         System.out.println("The string '"+str+"' is a palindrome.");
      }else{
         System.out.println("The string '"+str+"' is not a palindrome.");
      }
   }
}