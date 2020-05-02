package java_code;

class HW_02_02 {
    public static void main(String[] args) {
        int count = 1;
        int hours = 0;
        while (hours < 24) {
            count *= 2;
            hours += 3;
        }
        System.out.println("Через 24 часа будет " + count + " амеб.");
    }
}


