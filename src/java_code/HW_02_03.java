package java_code;

class HW_02_03 {
    public static void main(String[] args) {
        int sum = 0;
        int number = 1;
        while (number <=256) {
            sum += number;
            number *= 2;
        }
        System.out.println("Ответ " + sum);
    }
}
