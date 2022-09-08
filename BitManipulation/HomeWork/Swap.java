import java.util.*;

public class Swap
{
    public static void main (String [] args)
    {
        Scanner sc = new Scanner (System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println("Before Swapping : " + x + " " + y);
        x = x^y;
        y = y^x; // y^(x^y)
        x = x^y; // (x^y)^y
        System.out.println("After Swapping : " + x + " " + y);
    }
}
