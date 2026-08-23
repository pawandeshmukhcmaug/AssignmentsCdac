import java.util.Scanner;
public class AgeCategory{
    public static String ageCategory(int age){
     if(18>age) return "you are a minor";
     else if(18 <= age && age < 60) return "you are a adult";
     else return "senior citizen";    
  
}

  public static void main(String args[]){
 System.out.print("enter the age :");
      Scanner sc = new Scanner(System.in);
      int age = sc.nextInt();
      String Category = ageCategory(age);
      System.out.print(Category);
      
     }
}