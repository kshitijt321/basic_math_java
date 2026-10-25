public class neww {
    public static void main(String[] args) {

        // reverse another way
        // for logic see video
        int num = 1498;
        int ans = 0;
        while(num != 0){
            int digits  = num%10;
            ans = ans * 10 + digits ;
            // works as
            // 8 * 1000 + 9 * 100 + 4 * 10 + 1

            num = num/ 10;


        }
        System.out.println(ans );
    }
}
