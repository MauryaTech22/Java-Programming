public class Problem {
    public static int optiomizedPower(int a, int n) {
        if (n == 0) {
            return 1;
        }

        int halfPowerSq = optiomizedPower(a, n / 2) * optiomizedPower(a, n / 2);
        //n is odd
        if (n % 2 != 0) {
            halfPowerSq = a * halfPowerSq;
        }
        return halfPowerSq;
    }

    public static void main(String args[]) {
        int a = 2 ;
        int n = 10 ;
System.out.println(optiomizedPower(a,n));
    }
}