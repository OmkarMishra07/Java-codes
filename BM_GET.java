package BIT_MANIPULATION;

public class BM_GET {
    public static void main(String[] args) {
        int n =3 ;
        int pos = 2;
        int bitmask = 1<<pos;
        if((n & bitmask) == 0){
            System.out.println("bit was zero");
        }
        else System.out.println("Bit was one");
    }
}
