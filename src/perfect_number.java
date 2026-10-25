public class perfect_number {
    public static void main(String[] args) {
        //A perfect number is a number whose sum of proper divisors equals the number itself.
        //
        //Example:
        //
        //For 6:
        //
        //Proper divisors are 1, 2, 3
        //
        //Their sum:
        //
        //1 + 2 + 3 = 6

        int num = 6 ;
        int original = num ;
        int sum = 0 ;
        for(int i = 1 ; i< num- 1 ; i ++){
            if (num%i==0){
                sum = sum + i ;
            }
        }
        if (sum == original ){
            System.out.println("prefect number ");
        }
        else {
            System.out.println("not a perfect number ");
        }
    }
}
