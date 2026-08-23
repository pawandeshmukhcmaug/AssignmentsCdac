import java.util.Scanner;
public class PositiveNumber{
   public static int askForPositiveNumber(){
 Scanner sc = new Scanner(System.in);
int number;
    do{
 number = sc.nextInt();
    }
    while(number<=0);
return number;
    }
   public static void main(String[] pawan){
   int number = PositiveNumber();
   System.out.print(number);

}
}