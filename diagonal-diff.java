import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int diagonalDifference(int[][] a) {
        // Complete this function
   int sum1=0,sum2=0,total=0,final1=0,n=0;
         n = a.length;
        for(int i=0;i<n;i++)
        {
                sum1+=a[i][i];
                sum2+=a[i][n-1-i];
            }
        total = sum1 -sum2;
        final1= (total<0 ? -total:total);
        
        
                   return final1; 

    }
        
    

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] a = new int[n][n];
        for(int a_i = 0; a_i < n; a_i++){
            for(int a_j = 0; a_j < n; a_j++){
                a[a_i][a_j] = in.nextInt();
            }
        }
        int result = diagonalDifference(a);
        System.out.println(result);
        in.close();
    }
}

