public class count {
    public static void main(String[] args) {
        //count digits of a num
        int num1 = 53127;
        // numbers kom print karwana he jab tak 0  na aaaye
        int count = 0;  // this technique is very imp
        while (num1 != 0 ){
            int num2 = num1%10; // extracting last element (7)

            num1 = num1 / 10 ; // removing last element from num1 or updating it
            count ++;
        }
        System.out.println(count );


        // sum of these digits

        int lum = 53127;
        // numbers kom print karwana he jab tak 0  na aaaye
        int sum = 0;  // this technique is very imp
        while (lum != 0 ){
            int num = lum%10; // extracting last element (7)
            sum = sum + num ;

            lum = lum / 10 ; // removing last element from num1 or updating it

        }
        System.out.println(sum );

        //Reversed a number

        int qq = 1498;
        while (qq != 0){
            int ww = qq%10;
            System.out.print(ww);
            qq = qq/10;
        }



    }

}
