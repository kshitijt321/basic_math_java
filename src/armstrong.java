public class armstrong {

    public static void main(String[] args) {
        // armstrong asa numebers which satiesfiy

        // abc = abc = a³ + b³ + c³
        // ex 153 =   1³ + 5³ + 3³

        int number = 153 ;
        int oldNum = number;
        double sum  = 0;

        while (number !=0){
            int lastdigit = number%10;
            sum = sum + Math.pow(lastdigit,3);
            number  = number/10;
        }
      if(oldNum ==sum ){
          System.out.println("armstrng ");
      }
      else{
          System.out.println("not armstrng ");
      }
    }

}
