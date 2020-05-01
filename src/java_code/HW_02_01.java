package java_code;

class HW_02_01 {
    public static void main(String[] args) {
        int last_distance = 10;
        last_distance *= 100; // for counting metres
        int distance = 0;
        short day = 1;
        while (day++ <= 7) {
            distance += last_distance;
            last_distance += last_distance / 10;
        }
        System.out.println("За 7 дней спортсмен суммарно пробежал " + (distance / 100) + " километров и " + (distance % 100) + " метров.");
    }
}
