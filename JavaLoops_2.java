import java.util.*;
public class Solution
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
            {
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            int sum = a;
            for (int x = 0; x < c; x++)
            {
            sum=b*(1<<x)+sum;
            System.out.print(sum + " ");
            }
            System.out.println();
        }
} 
}

