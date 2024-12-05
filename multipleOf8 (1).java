import java.util.*;
public class multipleOf8
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int i=0;i<t;i++)
        {
            int n=sc.nextInt();
            if((n&7)==0)
            {
                System.out.println("a is multiple of 8");
            }
            else
            {
                System.out.println("a is not multiple of 8");
             }
        }
    }
}
            


       