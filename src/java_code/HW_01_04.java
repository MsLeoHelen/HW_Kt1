package java_code;

import java.util.Scanner;

class HW_01_04 {
    public static void main(String[] args) {
        //Entering numbers
        Scanner in = new Scanner(System.in);
        System.out.print("Введи первое число: ");
        int num1 = in.nextInt();
        System.out.print("Введи второе число: ");
        int num2 = in.nextInt();
        System.out.print("Введи треть число: ");
        int num3 = in.nextInt();

        //Counting positive numbers
        short pos = 0;
        if (num1 > 0) {
            pos++;
        }
        if (num2 > 0) {
            pos++;
        }
        if (num3 > 0) {
            pos++;
        }

        //Output
        switch (pos) {
            case 0:
                System.out.println("Ни одно число не положительное.");
                break;
            case 1:
                System.out.println(pos + " чисело положительное.");
                break;
            case 2:
            case 3:
                System.out.println(pos + " чисела положительных.");
                break;
        }
    }
}
