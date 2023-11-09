import java.lang.Math;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //variables
        int num;
        double squareRoot;

        System.out.println("Enter a number:");
        num = scan.nextInt();
        squareRoot = Math.sqrt(num);
        if (num / squareRoot == squareRoot) {
            System.out.println(num + " is a perfect square");
        } else {
            System.out.println(num + " is not a perfect square");
        }
    }
}