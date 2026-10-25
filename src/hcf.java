import java.io.FilterOutputStream;

public class hcf {
    // hcf or gcd
    // a = 18 , b = 12
    // a = 2 * 3 * 3 , b = 2 * 2 * 3
    // so hcf will be 2 * 3 = 6
    // gcd ( a, b ) = gcd ( b , a % b ) gives gcd of a and b
    // gcd ( a , b ) = gcd ( b ,  remiender of a and b  )
    // gcd ( a , b ) = gcd ( b , a - b * quotent )
    public static void main(String[] args) {
        int a = 48 ;
        int b  = 18;
        while ( b != 0){
            int remiander = a%b;
            a = b ;
            b = remiander;
        }
        // jab b , 0 hoga tab a ki place pe gcd milega
        System.out.println("gcd "+ a );
    }
}
