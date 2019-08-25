public class Strings
{
   public static String uniqueLetters(String str)
   {
     
    String word = "";
    int repeat = 0;
    for(int i=0; i<str.length(); i++) 
    {
     for(int j=0; j<str.length(); j++) 
     {
      if(i != j && str.charAt(i) == str.charAt(j)) {
         repeat = 1;
      }
     }
     if(repeat != 1) 
     {
      word += str.charAt(i);
     }
    }
    return word;
   }
   
}