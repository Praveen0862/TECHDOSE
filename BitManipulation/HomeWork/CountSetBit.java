import java.util.*;

public class CountSetBit 
{
    public static void main (String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int count = 0;
        while (a > 0)
        {
            if ((a&1) == 1)
            {
                count++;
            }
            a = a >> 1;
        }
        System.out.println(count);
    }
}
