public class GCDEx
{
public int  gcd(int a, int b)
{ 
    if (a == 0) 
         { 
          // System.out.println(a);
            return a;
           }
   while (b > 0) 
     { if (a > b)  
          a = a - b;
       else
           b = b - a;
      }
        // System.out.println(a);
    return a; 
    }
}
