package java_code;

import java.util.Scanner;

class HW_01_03 {
    public static void main(String[] args) {
        //Entering number
        Scanner in = new Scanner(System.in);
        System.out.print("Введи число: ");
        int num = in.nextInt();

        //Operation with number
        if (num > 0) {
            num++;
        } else if (num < 0) {
            num -= 2;
        } else {
            num = 10;
        }

        //Output the number
        System.out.println("Число после операций: " + num);
    }
}
