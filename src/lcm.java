public class lcm {
    public static void main(String[] args) {
        // LCM * GCD = A * B
        // LCM = A * B / GCD
        int a = 48 ;
        int b  = 18;
        int oldValueOfa = a;
        int oldValueofb = b;
        while ( b != 0){
            int remiander = a%b;
            a = b ;
            b = remiander;
        }
        System.out.println("gcd "+ a );

        int lcm = (oldValueOfa * oldValueofb) / a ;
        System.out.println(lcm);

    }
}
