import java.util.*;
public class Divisor
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of test case");
        int t=sc.nextInt();
        for (int i=0;i<=t;i++)
        {
            int n=sc.nextInt();
            for (int j=1;j<=n;j++)
            {
            if((n%j)==0)
             System.out.println(j+" ");
            }
        System.out.println();
        }
            
    }
}
            


       