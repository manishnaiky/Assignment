public class Pangram {
    public static void main(String[] args) 
    {
        String input = "dfjgthjkhigfd12fddghjkuyt";
        boolean isPangram = isPangram(input.toLowerCase());
        if (isPangram) 
        {
            System.out.println("The input is a pangram.");
        } 
        else 
        {
            System.out.println("The input is not a pangram.");
        }
    }

    public static boolean isPangram(String str) 
    {
        if (str.length() < 26) 
        {
            return false;
        }
        for (char c = 'a'; c <= 'z'; c++) 
        {
            if (str.indexOf(c) == -1) 
            {
                return false;
            }
        }
        return true;
    }
}
