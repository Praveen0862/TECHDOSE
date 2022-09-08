import java.util.*;

public class IsPowerOfTwo 
{
    public static void main (String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a == 0)
        {
            System.out.println("NO");
        }
        else
        {
            System.out.println(((a&(a-1)) == 0) ? "YES" : "NO");
        }
    }
}
