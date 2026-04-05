import java.util.Scanner;

public class CF2202A{
    
    public static void main(String args[])
    {
        int t;
        Scanner scanner = new Scanner(System.in);
        t = scanner.nextInt();

        while(t > 0)
        {
            int x = scanner.nextInt();
            int y = scanner.nextInt();

            int temp = x+y;
            if(temp % 3 == 0 && (y >= (-x/4)) && (y <= (x/2)))
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
