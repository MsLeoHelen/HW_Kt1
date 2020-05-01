package java_code;

import java.util.Scanner;

class HW_01_02 {
    public static void main(String[] args) {
        //Entering 3 side of the triangle
        Scanner in = new Scanner(System.in);
        System.out.print("Введите сторону a: ");
        int a = in.nextInt();
        System.out.print("Введите сторону b: ");
        int b = in.nextInt();
        System.out.print("Введите сторону c: ");
        int c = in.nextInt();

        //Definition there is the triangle with this side or not
        int max_side, other_side1, other_side2;
        if (a > b) {
            other_side1 = b;
            if (a > c) {
                max_side = a;
                other_side2 = c;
            } else {
                max_side = c;
                other_side2 = a;
            }
        } else {
            other_side1 = a;
            if (b > c) {
                max_side = b;
                other_side2 = c;
            } else {
                max_side = c;
                other_side2 = b;
            }
        }
        if (max_side < (other_side1 + other_side2)) {
            System.out.println("Треугольник с такими сторонами существует.");
        } else {
            System.out.println("Треугольника с такими сторонами не существует.");
        }
    }
}
