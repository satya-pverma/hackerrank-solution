import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {
        double cp=0;
        double cn=0;
        double co=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<0)
            {
                cn++;
            }
            else if(arr[i]>0)
            {
                cp++;
            }
            else
            co++;
        }
        double p = cp/arr.length;
        double n= cn/arr.length;
        double o=co/arr.length;
         System.out.println(p);
          System.out.println(n);
           System.out.println(o);
       
        


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();
    }
}
