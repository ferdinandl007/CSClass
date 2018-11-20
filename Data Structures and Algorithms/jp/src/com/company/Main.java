import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
package .c;

public class Main {
    /**
     * Iterate through each line of input.
     */
    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
        BufferedReader in = new BufferedReader(reader);
        String line;
        while ((line = in.readLine()) != null) {
            System.out.println(line);
            int x = Integer.parseInt(line);
            int y = Integer.parseInt(reverse(line));

            int sum = x + y;

            String strSum = Integer.toString(sum);





        }
    }


    static String reverse(String x){
        String reverse = "";
        for(int i = x.length() - 1; i >= 0; i--)
        {
            reverse = reverse + x.charAt(i);
        }
        return x;
    }

    static boolean  isDuplicate(String str){
        ArrayList<String> y = new ArrayList<String>();
        y.add(str);




        return false;
    }






}

