import java.util.Scanner;
import java.util.Random;

public class Stone_Paper_Scissor{
    public static void main(String args[]) {
        int n = 1;
        while (n <=3) {
            n++;
            Scanner sc = new Scanner(System.in);
            System.out.println("Games Instructions.1.Chance only 3times and If you enter 0,1,2.\n0 -> Rock\n1 -> Paper\n2 -> Scissors");
            System.out.println("Start the Game: ");
            int num = sc.nextInt();
            int num1;
            Random random = new Random();
            num1 = random.nextInt(3);
            if (num == num1) {
                System.out.println("Draw");
                System.out.println("Computer Choice: " + num1);

                if (num1 == 0) {
                    System.out.println("Computer Choice: Rock\n\n");
                } else if (num1 == 1) {
                    System.out.println("Computer Choice: Paper\n\n");
                } else if (num1 == 2) {
                    System.out.println("Computer Choice: Scissor\n\n");
                }
            } else if (num == 0 && num1 == 2 || num == 1 && num1 == 0 || num == 2 && num1 == 1) {
                System.out.println("You win");
                System.out.println("Computer Choice: " + num1);

                if (num1 == 0) {
                    System.out.println("Computer Choice: Rock\n\n");
                } else if (num1 == 1) {
                    System.out.println("Computer Choice: Paper\n\n");
                } else if (num1 == 2) {
                    System.out.println("Computer Choice: Scissor\n\n");
                }
            } else if (num > 2) {
                System.out.println("Enter the valid number.");
            } else {
                System.out.println("Computer win");
                System.out.println("Computer Choice: " + num1);

                if (num1 == 0) {
                    System.out.println("Computer Choice: Rock\n\n");
                } else if (num1 == 1) {
                    System.out.println("Computer Choice: Paper\n\n");
                } else if (num1 == 2) {
                    System.out.println("Computer Choice: Scissor\n\n");
                }
            }
        }
    }
}
