import java.util.Scanner;

public class Dateable {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("PLease enter your age:");
        int age = scanner.nextInt();
        int newage = age/2 + 7;
        System.out.println(age + "-year olds should date somebody who is at least " + newage + " years old");
    }
}
