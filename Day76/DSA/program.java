package Day76.DSA;

public class program {
    static public boolean isPowerOfTwo(int n) {
        for (int i = 0; i < 31; i++) {
            int ans = (int) Math.pow(2, i);
            if (ans == n) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(16));
    }
}
