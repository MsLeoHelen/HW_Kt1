package java_code;



import java.util.Scanner;

class HW_01_01 {
    public static void main(String[] args) {
        //Entering number
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int num = in.nextInt();

        //Positive or negative number
        String pos_or_neg;
        if (num == 0)//exclude 0
        {
            pos_or_neg = "не положительное и не отрицательное";
        } else if (num > 0) {
            pos_or_neg = "положительное";
        } else {
            pos_or_neg = "отрицательное";
            num *= -1;
        }

        //Binary tree
        String dig;
        if (num > 999999)//if more then 6 digits
        {
            if (num > 99999999)//if more then 8 digits
            {
                if (num > 999999999)//if more then 9 digits
                {
                    dig = "десяти";
                } else//9 digits
                {
                    dig = "девяти";
                }
            } else if (num < 10000000)//if less then 8 digits
            {
                dig = "семи";
            } else//8 digits
            {
                dig = "восьми";
            }
        } else if (num < 100000)//if less then 6 digits
        {
            if (num > 9999)//if more then 4 digits
            {
                dig = "пяти";
            } else if (num < 1000)//if less then 4 digits
            {
                if (num > 99)//if more then 2 digits
                {
                    dig = "трех";
                } else if (num < 10)//if less then 2 digits
                {
                    dig = "одно";
                } else//2 digits
                {
                    dig = "дву";
                }
            } else//4 digits
            {
                dig = "четырех";
            }
        } else//6 digits
        {
            dig = "шести";
        }

        //Out text
        System.out.println("Это " + dig + "значное " + pos_or_neg + " число.");
    }
}
