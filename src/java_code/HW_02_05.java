package java_code;

class HW_02_05 {
    public static void main(String[] args) {
        int inch = 1;
        int centimeter = 254;
        int const_cent = 254;
        while (inch <= 20) {
            System.out.println(inch + " д. = " + (centimeter/100) + "." + (centimeter%100) + " см.");
            inch++;
            centimeter += const_cent;
        }
    }
}
