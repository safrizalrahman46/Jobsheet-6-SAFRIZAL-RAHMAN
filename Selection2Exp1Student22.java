import java.util.Scanner;
public class Selection2Exp1Student22 {
    public static void main(String[] args) {
        Scanner inputan22 = new Scanner(System.in); 
        int year; System.out.println("What Year ?"); 
        
        year = inputan22.nextInt(); 
        
        if (year%4==0) {
            if (year%100!=0) {
                System.out.println("Leap Year"); 
        }   else {
                System.out.println("Not A leap Year");
        }
    }
}
}
