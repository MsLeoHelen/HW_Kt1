package java_code;

public class HW_02_08_2 {
    public static void main(String[] args) {
        String str = "";
        for (int string = 0; string < 4; string++) {
            str = "";
            for (int symbol = 0; symbol < 4; symbol++) {
                if (symbol < string) {
                    str += " ";
                } else {
                    str += "*";
                }
            }
            System.out.println(str);
        }
    }
}
