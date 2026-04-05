import java.util.Scanner;

public class CF2185A{

    public static void main(String args[])
    {
        int t;
        Scanner scanner = new Scanner(System.in);
        t = scanner.nextInt();
        while(t > 0)
        {   
            int n = scanner.nextInt();
            for(int i = 1; i <= n; i++)
            {
                System.out.println(i);
            }
            t--;
        }
    }
}
