import java.util.Scanner;
public class Tables{
   public static void MultiplicationTable(int number){
   int multiple;
   for(int i=1; i<=10; i++){
     multiple = i*number;
     System.out.println(number +" * "+ i + "=" + multiple);
  }    
}
   
   public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int number = sc.nextInt();
   MultiplicationTable(number);
 
  }
}