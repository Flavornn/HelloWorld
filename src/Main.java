import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double n1, n2, n3, average;

        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter 3 numbers:");

        n1 = userInput.nextDouble();
        n2 = userInput.nextDouble();
        n3 = userInput.nextDouble();
        average = (n1 + n2 + n3) / 3;
        System.out.println("Average of " + n1 + ", " + n2 + ", " + n3 + " is: " + average);
    }
}