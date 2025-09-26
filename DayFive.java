class Solution {
    public int getSum(int a, int b) {
        while( b != 0 ){
            int carry = ( a & b ) << 1; // a and b then left shift
            a = a ^ b; // a xor b
            b = carry;
        }

        return a;
    }
}
