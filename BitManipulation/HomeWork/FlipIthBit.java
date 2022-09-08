import java.util.*;

public class FlipIthBit
{
    public static void main (String [] args)
    {
        Scanner sc = new Scanner (System.in);
        int x = sc.nextInt();
        int pos = sc.nextInt();
        System.out.println(x^(1 << (pos-1)));
    }
}
