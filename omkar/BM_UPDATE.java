package BIT_MANIPULATION;

public class BM_UPDATE {
    public static void main(String[] args) {
        int n = 16;
        int pos = 2;
        int bitmask = 1<<pos;
        int res2;
        //int res1 = n ^ bitmask; // when we just want to toggle (no specific update)
        int opp = 3; // we are setting or clearing bit on users choice ;
        if(opp==1){
             res2 = n | bitmask;
        }
        else {
            res2 = n & (~ bitmask);
        }
        System.out.println(res2);
    }}

