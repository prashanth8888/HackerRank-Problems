import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
   

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int t = in.nextInt();   
        while(t-- > 0)
            {
            int n = in.nextInt();
            StringBuffer answer = new StringBuffer();
            for(int j=0; j <= n/5 ; j++)
                {
                if((n-5*j)%3 == 0){
                    for(int k = 0;k < n-5*j;k++)
                         answer.append("5");
                     for(int k = 0;k < 5*j;k++)
                         answer.append("3");
                    System.out.println(answer.toString());
                     break;
                 }
            }
             if(answer.toString().equals(""))
                 System.out.println(-1);
            }
            
        }
        
}