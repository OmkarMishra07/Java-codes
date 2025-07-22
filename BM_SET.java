package BIT_MANIPULATION;

public class BM_SET {
    public static void main(String[] args) {
        int n = 5;
        int pos = 1;
        int bitmask = 1<<pos;
        int res = n | bitmask;
        System.out.println(res);
    }
}
