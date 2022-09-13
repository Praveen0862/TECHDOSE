import java.util.*;

public class PrimeFactorsOfANumber
{
    public static void main (String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int i = 2;
        while (i*i <= N)
        {
            while (N%i == 0)
            {
                System.out.println(i);
                N = N / i;
            }
            i++;
        }
        if (N > 1)
        {
            System.out.println(N);
        }
    }
}
