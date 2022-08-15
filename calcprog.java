package abhinav;

            // "जावा कैलकुलेटर प्रोग्राम मैं आपका स्वागत है"

import java.util.Scanner;

public class calcprog {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // take the input from the user till he press X or x
        int ans = 0;
        while (true) {  // infinite while loop
            //take the operator as input
            System.out.println("Enter the operator: ");
            char op = in.next().trim().charAt(0);
            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                // input 2 no
                System.out.println("Enter two number's: ");
                int num1 = in.nextInt();
                int num2 = in.nextInt();

                if (op == '+') {
                ans = num1 + num2;
                }
                if (op == '-') {
                    ans = num1 - num2;
                }
                if (op == '*') {
                    ans = num1 * num2;
                }
                if (op == '/') {
                    if (num2 != 0) {
                        ans = num1 / num2;
                    }
                }
                if (op == '%') {
                    ans = num1 % num2;
                }
            } else if (op == 'x' || op == 'X') {
                break;
            } else {
                System.out.println("Invalid Syntax");
            }
            System.out.println(ans);
        }

    }
}
