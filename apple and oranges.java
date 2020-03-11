import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    
    static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
        int countap=0;
        int countor=0;
        int s1=apples.length;
        int s2= oranges.length;
        int arrapple[]=new int[s1];
        int arrorange[]=new int[s2];
        for(int i=0;i<s1;i++)
        {
            arrapple[i]=apples[i]+a;
        }
        for(int i=0;i<s2;i++)
        {
            arrorange[i]=oranges[i]+b;
        }
        for(int i=0;i<s1;i++)
        {
            if(arrapple[i]>=s & arrapple[i]<=t)
            {
               countap++; 
            }
        }
        for(int i=0;i<s2;i++){
            if(arrorange[i]>=s & arrorange[i]<=t)
            {
                countor++;
            }
        }
        System.out.println(countap);
        System.out.println(countor);


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] st = scanner.nextLine().split(" ");

        int s = Integer.parseInt(st[0]);

        int t = Integer.parseInt(st[1]);

        String[] ab = scanner.nextLine().split(" ");

        int a = Integer.parseInt(ab[0]);

        int b = Integer.parseInt(ab[1]);

        String[] mn = scanner.nextLine().split(" ");

        int m = Integer.parseInt(mn[0]);

        int n = Integer.parseInt(mn[1]);

        int[] apples = new int[m];

        String[] applesItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < m; i++) {
            int applesItem = Integer.parseInt(applesItems[i]);
            apples[i] = applesItem;
        }

        int[] oranges = new int[n];

        String[] orangesItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int orangesItem = Integer.parseInt(orangesItems[i]);
            oranges[i] = orangesItem;
        }

        countApplesAndOranges(s, t, a, b, apples, oranges);

        scanner.close();
    }
}
