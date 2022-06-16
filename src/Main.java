//import javax.swing.JFrame;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        int num1 = 0;
        int num2 = 0;
        char operator;
        double answer = 0.0;

        Scanner ScanObject = new Scanner(System.in);

        System.out.println("Please enter the first number: ");
        num1 = ScanObject.nextInt();
        System.out.println("Please enter the second number: ");
        num2 = ScanObject.nextInt();
        System.out.println("What operation?");
        operator = ScanObject.next().charAt(0);


        switch (operator) {
            case '+': answer = num1 + num2;
                break;
            case '-': answer = num1 - num2;
                break;
            case '*': answer = num1 * num2;
                break;
            case '/': answer = num1 / num2;
                break;
        }
        System.out.println(num1 + " " + operator + " " + num2 + " = " + answer);

//        JFrame obj = new JFrame();
//
//        obj.setBounds(10, 10, 700, 600);
//        obj.setTitle("Calculator");
//        obj.setResizable(false);
//        obj.setVisible(true);
//        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }
}