//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int num = 12345;
        int extractLastDigit = num % 10 ;
        int remainingNum =     num / 10 ;
        System.out.println("last digit is "+ extractLastDigit);
        System.out.println("remaining digits are "+ remainingNum);
        //print numbers


        int num1 = 53127;
      // numbers kom print karwana he jab tak 0  na aaaye
        while (num1 != 0 ){
            int num2 = num1%10; // extracting last element (7)
            System.out.println(num2);
            num1 = num1 / 10 ; // removing last element from num1 or updating it
        }






    }
}