package java_code;

import java.util.Scanner;

class HW_01_06 {
    public static void main(String[] args) {
        //Entering numbers
        Scanner in = new Scanner(System.in);
        System.out.print("Введи первое число: ");
        int num1 = in.nextInt();
        System.out.print("Введи второе число: ");
        int num2 = in.nextInt();

        //Output
        if (num1 > num2) {
            System.out.println("Первое число больше вторго.");
        } else if (num1 < num2) {
            System.out.println("Второе число больше первого.");
        } else {
            System.out.println("Числа равны.");
        }
    }
}
