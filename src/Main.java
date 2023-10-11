import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int month;

        System.out.println("Please input your birth month by number.");
        month = scan.nextInt();

        if (month >=1 && month <= 12){
            System.out.println("Your birth birth month is " + month + ".");
        }else{
            System.out.println("Your input is invalid please try again.");

        }
    }
}