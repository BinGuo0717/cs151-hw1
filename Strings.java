package introduction;
public class Strings {

    public static String uniqueLetters(String str){
        String word = "";
        for(int i = 0; i < str.length(); i++)
        {
            int repeat = 0;
            for(int j = 0; j < str.length(); j++)
            {
                if(str.charAt(i) == str.charAt(j))
                {
                    repeat++;
                }
            }
            if(repeat == 1)
            {
                word += str.charAt(i);
            }
        }
        return word;
    }
}

