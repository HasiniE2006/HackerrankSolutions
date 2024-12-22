import java.util.*;
public class Main
{
    int x,y;
    public static void initial(int x,int y)
    {
      x=x;
      y=y;
      if(x<=0 || y<=0)
      {
       System.out.println("java.lang.Exception: Breadth and height must be positive"); 
      }
      else
      {
        System.out.println(x*y);
      }  
    }
   public static void main(String args[])
   {
    Scanner sc=new Scanner(System.in);
    initial(sc.nextInt(),sc.nextInt());
   } 
}
