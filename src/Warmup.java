/**
 * Created by cmitchell on 3/23/17.
 */
public class Warmup {
    public String missingChar(String str, int i) {

        //System.out.print(str.substring(0,i));
        //System.out.print("   ");
        //System.out.println(str.substring(i+1,str.length()));

        return str.substring(0, i) + str.substring(i + 1, str.length());
    }



    public boolean isTeen(double a, int b, int c) {




       if ((a >= 13 && a <= 19) ||
                (b >= 13 && b <= 19) ||
                (c >= 13 && c <= 19)){
           return  true;
       }

       return false;
    }




}
