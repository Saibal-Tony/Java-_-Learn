public class Palindrome_20
{
    public static void main(String[] args)
    {
        String name = "abbbaccabbba" ;
        Boolean ans1 = palimndromeStringBuilder(name);
        System.out.println(ans1);

        Boolean ans2 = palindromeDoublePointer(name);
        System.out.println(ans2);
    }

    private static Boolean palimndromeStringBuilder(String name)
    {
        if(name.isEmpty())
        {
            return true;
        }
        
        name = name.toLowerCase();
        StringBuilder build = new StringBuilder();
        for (int i = name.length(); i > 0  ; i--)
        {
            char ch = name.charAt(i - 1);
            build.append(ch);
        }
        return (name.contentEquals(build));
    }

    static boolean palindromeDoublePointer(String name)
    {
        if(name.isEmpty())
        {
            return true;
        }

        int i = 0;
        int j = name.length() - 1;
        name = name.toLowerCase();
        while(i < name.length()/2  && j > name.length()/2 )
        {
            if(name.charAt(i++) != name.charAt(j--))
            {
                return false;
            }
        }
        return true;
    }
}
