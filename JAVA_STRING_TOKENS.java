import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        s = s.trim();
        if (s.length() == 0) {
            System.out.println(0);
        }
        else{
        String sp[]=s.split("['!?,._@ ]+");
        System.out.println(sp.length);
        for (String i : sp)
        System.out.println(i);
        scan.close();
        }
    }
}
