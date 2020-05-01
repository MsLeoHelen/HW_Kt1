package java_code;

class HW_02_08_1 {
    public static void main(String[] args) {
        String str = "";
        for (int string = 0, space = 3; string < 4; string++, space--) {
            str = "";
            for (int symbol = 0; symbol < 4; symbol++) {
                if (symbol < space) {
                    str += " ";
                } else {
                    str += "*";
                }
            }
            System.out.println(str);
        }
    }
}
