import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int birthdayCakeCandles(int n, int[] ar) {
        // Complete this 
        
        int  max = ar[0];
        int count =0;
        for(int k=0;k<n;k++)
        {
            if(max < ar[k])
               {
                   max= ar[k];
               }
            
        }
        for(int m =0;m<n;m++)
        {
            if(max == ar[m])
            {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = birthdayCakeCandles(n, ar);
        System.out.println(result);
    }
}

