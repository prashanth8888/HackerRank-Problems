import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    private int tmp[];
    private int noOfStudents;
    private int limit;
    private int count = 0;
    
    private void setStudent(int s)
        {
        noOfStudents = s;
    }
    
    private void setLimit(int l){
        limit = l;
    }
    
    public void copyarray(int[] ary)
        {
        this.tmp = ary;
   
    }
    
    public void checkClassStat(){
        
        for(int i=0; i< tmp.length; i++)
            {
             if(tmp[i] <= 0){
                 count++;    
             }
        }
        
   
        if(count < limit){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
        
    }

    public static void main(String[] args) {
       
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int k = in.nextInt();
            int a[] = new int[n];
            for(int a_i=0; a_i < n; a_i++){
                a[a_i] = in.nextInt();
            }
            
            Solution S1 = new Solution();
            S1.copyarray(a);
            S1.setStudent(n);
            S1.setLimit(k);
            S1.checkClassStat();    
        }
        }
        
        
    
}