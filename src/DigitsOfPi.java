import java.net.*;
import java.io.*;

public class DigitsOfPi
{
    public static void main(String[] args)throws Exception
    {
        int[] digitCount = new int[10];
        File file = new File("/Users/VicMini/git/DigitsOfPi/src/billionPi.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        String st;
        while((st = br.readLine()) != null)
        {
            for (int i = 0; i < st.length(); i++)
            {
                char c = st.charAt(i);
                if (Character.isDigit(c))
                {
                    int d = Character.getNumericValue(c);
                    System.out.print(d);
                    digitCount[d]++;
                }
            }
        }
        for (int i = 0; i < digitCount.length; i++)
        {
            System.out.println("digitCount[" + i + "] = " + digitCount[i]);
        }
    }
}

