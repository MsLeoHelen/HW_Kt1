package java_code;

import java.util.Scanner;

class HW_01_07 {
    public static void main(String[] args) {
        //Entering number of programmer/s
        Scanner in = new Scanner(System.in);
        System.out.print("Введи число программистов: ");
        int prog = in.nextInt();

        //Output
        if (prog < 0) {
            System.out.println("Вы ввели неправильное число");
        } else {
            String str = "";
            if ((prog % 10 == 0) || (prog % 100 >= 9 && prog % 100 <= 19)) {
                str = "ов";
            } else if ((prog % 100 >= 22 && prog % 100 <= 29) || (prog % 10 >= 2 && prog % 10 <= 4) || (prog % 10 == 9 )){
                str = "а";
            }else if(prog % 10 >= 5 && prog % 10 <= 8)
            {
                str = "ов";
            }
            System.out.println(prog + " программист" + str + ".");
        }

    }
}
