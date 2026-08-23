import java.util.Scanner;
public class BonusProblem{
    public static void main(String[] args) {
        System.out.println("Enter the number for problem");
        Scanner sc = new Scanner(System.in);
    int choice; 
    do {
         choice = sc.nextInt();
            switch (choice) {
        case 1:  {
            System.out.println("Grade Evaluation System");
        }
             break;
        case 2: {
            System.out.println("Leap Year Check");
        }
            break;
        case 3:  {
            System.out.println("Day of the week");
        }
           break;
        case 4:   {
            System.out.println("Identify Default Values of Variables");
        }
           break;
        case 5: {
            System.out.println("exit");
        }

          break;
        
    
        default: {
            System.out.println("invalid input");
        }
            break;
    }
    } while (choice != 5);
    
    }
}