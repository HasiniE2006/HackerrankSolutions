import java.io.*;
import java.util.*;
public class Solution {
public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String res="";
        for(int i=A.length()-1;i >=0;i--)
        {
            res=res+A.charAt(i);
        }
        if(A.equals(res))
        System.out.println("Yes");
        else
        System.out.println("No");
        
    }
}
        


