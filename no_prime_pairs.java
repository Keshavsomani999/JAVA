public class no_prime_pairs {
    static boolean prime(int a){
        boolean prim = true;
        for (int j= 2;j<a/2-1;j++) {
            if (a % j == 0) {
                prim = false;
            }
        }
        return prim;
    }
    public static void main(String[] args) {
        int n =4;
        int m = 30;
        for (int i=n;i<=m;i++){
            int r = i+6;
            if (prime(i)&&prime(r)){
                System.out.println(i+" "+r);
            }
        }
    }
}
