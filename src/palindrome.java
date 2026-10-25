public class palindrome {
    public static void main(String[] args) {

        // plaindrome mean that if that string or integer is same if reversed
        int num0 =  1221;
        int rev = 0;
        int num1 = num0; // num1 me num 0 ki value store ki
        while (num0!=0){
            int ss = num0%10;
            rev = rev * 10 + ss ;
            num0 = num0/10;
        }
        // why did i stored num 0  value in num 1
        //For example, when num0 = 1221, the loop works like this:
        //
        //Iteration	num0	ss = num0 % 10	rev
        //1	1221	1	1
        //2	122	2	12
        //3	12	2	122
        //4	1	1	1221
        //Loop ends	0	—	1221
        //
        //Therefore, when you execute:
        //
        //if (rev == num0)
        //
        //You are comparing:
        //
        //if (1221 == 0)
        //
        //That's why your output is false.



        if (rev== num1){
            System.out.println("true ");
        }
        else {
            System.out.println("false " );
        }

    }

}



