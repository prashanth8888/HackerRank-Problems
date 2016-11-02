import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int vertices = scanner.nextInt();
        int edges = scanner.nextInt();
        int[] tree = new int[vertices + 1];

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < edges; i++)
        {
            int connected = scanner.nextInt();
            int parent = scanner.nextInt();
            tree[connected] = parent;

            if(map.get(parent) == null)
            {
                map.put(parent, 1);
                int val = (int)map.get(parent);
                //System.out.println("The value in parent is " + val);
            }
            if(map.get(connected) == null)
            {
                map.put(connected, 1);
                int val = (int)map.get(parent);
                //System.out.println("The value in connected is " + val);
            }

            int count = map.get(parent);
            map.put(parent, ++count);
            //System.out.println("Value of Parent count" + map.get(parent));
 
        }
       
        
        
        int result = 0;
        for (int nodeIndex = tree.length - 1; nodeIndex > 1; nodeIndex--)
        {	
            if(map.get(nodeIndex) % 2 == 0)
            {	//System.out.println("Value at Node Index:" + map.get(nodeIndex));
                boolean hasEven = false;
                for (int i = tree.length - 1; i > 1; i--)
                {
                    if(tree[i] == nodeIndex)
                    {
                        int node = i;
                        //System.out.println(node);
                        if(map.get(node) % 2 == 0)
                        {
                            hasEven = true;
                        }
                    }
                }
                if(!hasEven)
                {
                    result++;
                    //System.out.println("cut " +nodeIndex);
                    int parent = tree[nodeIndex];
                    tree[nodeIndex] = 0;
                    //System.out.println("parent " + parent);
                    int count = map.get(parent);
                    map.put(parent, --count);
                }
            }
        }
        System.out.println(result);
        
        scanner.close();
    }
}