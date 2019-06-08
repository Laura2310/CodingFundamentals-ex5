import java.time.Year;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int year = input.nextInt();
        System.out.println("Introduceti anul:");
        if((year%4==0 && year%100!=0) || year%400==0){
            System.out.println("Bisect!");
        }else {
            System.out.println("Nu e bisect!");
        }
        // exista functie in clasa year pentru a verifica daca anul este bisect sau nu
        System.out.println(Year.isLeap(year));
    }
}
