package java_code;

import java.util.Scanner;

class HW_02_04 {
    public static void main(String[] args) {
        //Entering numbers
        Scanner in = new Scanner(System.in);
        System.out.print("Введи A: ");
        int a = in.nextInt();
        System.out.print("Введи B: ");
        int b = in.nextInt();

        //Positive or negative
        boolean negative;
        if (a < 0) {
            if (b < 0) {
                negative = false;
                a *= -1;
                b *= -1;
            } else {
                negative = true;
                a *= -1;
            }
        } else if (b < 0) {
            negative = true;
            b *= -1;
        } else {
            negative = false;
        }

        //Operation multiplication
        int multiplication = 0;
        while (b-- > 0) {
            multiplication += a;
        }
        if (negative) {
            multiplication *= -1;
        }
        System.out.println("Multiplication " + multiplication);
    }
}
