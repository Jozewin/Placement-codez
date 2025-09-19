
public class DayOne{
    
    public static long[] pali(long n, int k){
        int count = 0;
        while(count < k){
            long rev = reverse(n);
            System.out.println(rev+ " "+ n);
            if(n == rev){
                return new long[]{count, n};
            }
            
            n += rev;
            count++;
        }
        
        return new long[]{-1, -1};
    }
    
    private static long reverse(long k){
        long s = 0;
        while(k != 0){
            long last = k % 10;
            s = ( s * 10 ) + last;  
            k = k / 10;
        }
        
        return s;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(pali(89, 30)));
    }
}
