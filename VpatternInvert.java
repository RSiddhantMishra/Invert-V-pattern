import java.util.*;
import java.lang.*;

class VpatternInvert
{  
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int n1=n,n2,p=0;
        char a;
        for(int i=0;i<n;i++)
        {
            n2=n1+64;
             a=(char)n2;
            for(int sp=i;sp<=n;sp++)
            {
                System.out.print(" ");
            }
            System.out.print(a);
            for(int j=1;j<(p*2);j++)
                System.out.print(" ");
            if(i<n && i!=0)
                System.out.print(a);
                
            n1--;
            n2=0;
            System.out.println();
            p++;
        }
    }
}
/*Input:(any number)eg:8
Output:     
         H
        G G
       F   F
      E     E
     D       D
    C         C
   B           B
  A             A
*/