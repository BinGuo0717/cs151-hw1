import java.util.*;

public class Encoding
{
 
 public static void code(int m, int n,String code,Set<String>result)
 {
    if(m == 0 && n == 0)
    {
       result.add(code);
       return;
    }
    if(n == 0)
    {
       code(m-1,n,code+".",result);
       return;
    }
    if(m == 0)
    {
       code(m,n-1,code+"-",result);
       return;
    }
    code(m,n-1,code+"-",result);
    code(m-1,n,code+".",result);
 }
   public static Set<String> morseCodes(int m, int n)
   {
      Set<String> result = new TreeSet<>();
      code(m,n,"",result);
      return result;
   }
   }