import java.util.Scanner;

public class CF2193A {
    
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        int t;
        int n,s,x;
        int sum = 0;
        t = scanner.nextInt();

        while(t > 0)
        {
            n = scanner.nextInt();
            s = scanner.nextInt();
            x = scanner.nextInt();
            
            sum = 0;
            for(int i = 0; i < n; i++)
            {
                sum += scanner.nextInt();
            }

            if(sum == s || (s - sum > 0 && (s - sum) % x == 0))
            {
                System.out.println("YES");
            }
            else
            {
                System.out.println("NO");
            }
            t--;
        }
    }
}
