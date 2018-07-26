import java.io.*;
import java.math.*;
import java.security.*;
import java.util.*;

public class Solution
{
    public static void main(String[] args)
    {
        try (Scanner scanner = new Scanner(System.in);)
        {
            // let the big integer has atmost 100 digits
            // more the value of the parameter, more the accuracy and more is the excution time
            System.out.println(scanner.nextBigInteger().isProbablePrime(100) ? "prime" : "not prime");
        }
    }
}