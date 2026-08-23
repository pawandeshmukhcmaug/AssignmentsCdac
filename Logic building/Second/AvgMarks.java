import java.util.Scanner;
 
public class AvgMarks{
   public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter your maths marks");
    int math = sc.nextInt();
    System.out.println("enter your science marks");
    int science = sc.nextInt();
    System.out.println("enter your history marks");
    int history = sc.nextInt();
    
 int avg = (math+science+history)/3;
 System.out.println("average marks is " + avg);
  if(avg>=90) System.out.println("Grade A");
   else if(70 <= avg && avg <= 89) System.out.println("Grade B");
   else if(50 <= avg && avg <= 69) System.out.println("Grade C");
   else if(30 <= avg && avg <= 49) System.out.println("Grade D");
   else System.out.println("Fail");
}

}
