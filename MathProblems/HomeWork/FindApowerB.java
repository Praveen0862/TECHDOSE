import java.util.*;
public class FindApowerB {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int base=sc.nextInt();
        int power=sc.nextInt();
        int res=1;
        while(power>0)
        {
            if(power%2==1)
            {
                res=res*base;
            }
            base=base*base;
            power/=2;
        }
        System.out.print(res);
    }
}
