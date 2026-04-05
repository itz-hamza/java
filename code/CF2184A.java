import java.util.Scanner;

public class CF2184A{
    
    public static void main(String args[])
    {
        int t;
        Scanner scanner = new Scanner(System.in);
        t = scanner.nextInt();

        while(t > 0)
        {
            int n = scanner.nextInt();
            if(n == 2 || n == 3)
            {
                System.out.println(n);
            }
            else if(n%2 == 0)
            {
                System.out.println(0);
            }
            else
            {
                System.out.println(1);
            }
            t--;
        }
    }
}
