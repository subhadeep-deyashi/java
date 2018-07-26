import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

class ip_address_verify{

    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        while(inp.hasNext()){
            String IP = inp.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }
        inp.close();
    }
}
class MyRegex{
    // 1) \\d{1,2} catches any one or two digit number
    // 2) (0|1)\\d{2} catches any three digit number starting with 0 or 1.
    // 3) 2[0-4]\\d catches numbers between 200 and 249, i.e., 2 then 0 to 4 then any digit from 0 to 9
    // 4) 25[0-5] catches numbers between 250 and 255, i.e., starting with 25 followed by numbers from 0 to 5
    // Note : \d represents digits in regular expressions, same as [0-9]

    String zeroTo255 = "(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])";
    public String pattern = zeroTo255 + "." + zeroTo255 + "." + zeroTo255 + "." + zeroTo255;    
}