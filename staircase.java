import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

     /*static void staircase(int n) {
        // Complete this function
       for(int i =n;i>=0;i--)
        {
            for(int k=0;k<)
        }
    }*/

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String str="#";
        for (int i=0;i<n;i++)
            { 
            System.out.printf("%"+(n+1)+"s",str+"\n");
            str=str+"#";
        }
        in.close();
    }
}

