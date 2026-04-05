import java.util.Scanner;
import java.lang.Integer;
import java.util.ArrayList;
import java.lang.String;
import java.util.HashMap;
import java.util.Map;

public class CF2191A {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int t;
        t = scanner.nextInt();

        while (t > 0) {
            ArrayList<Integer> nums = new ArrayList<Integer>();
            int n;
            boolean canBeColored = true;
            n = scanner.nextInt();
            int inp;
            Map<Integer, String> map = new HashMap<Integer, String>();
            for (int i = 0; i < n; i++) {
                inp = scanner.nextInt();
                if(i % 2 == 0)
                map.put(inp,"B");
                else
                map.put(inp, "R");
            }
            for(int i = 1; i < n; i++)
            {
                if(map.get(i).equals(map.get(i+1)))
                {
                    canBeColored = false;
                    break;
                }
            }
            if (canBeColored) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            t--;
        }
        scanner.close();
    }
}
