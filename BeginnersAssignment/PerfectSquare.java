import java.util.*;

public class PerfectSquare
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int i = 1;
        while (i*i < N)
        {
            i++;
        }
        if (i*i == N)
        {
            System.out.println("Perfect Square");
        }
        else
        {
            System.out.println("Not a Perfect Square");
        }
    }
}
