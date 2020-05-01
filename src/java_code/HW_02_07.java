package java_code;

class HW_02_07 {
    public static void main(String[] args) {
        int num = 1;
        int sum = 0;
        while (num <= 99) {
            sum += num;
            num += 2;
        }
        System.out.println("Сумма - " + sum);
    }
}
