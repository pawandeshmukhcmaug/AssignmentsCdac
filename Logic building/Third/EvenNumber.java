import java.util.Scanner;
public class EvenNumber{
    public static void evenNumber(){
    int i=1;
    while(i<=50){
    if(i % 2 ==0){
    System.out.println(i);
    }
  i++;}
    }


  public static void main(String agrs[]){
   Scanner sc = new Scanner(System.in);
   System.out.println("all even number between 1-50");
    evenNumber();
  }
}