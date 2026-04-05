import java.util.Scanner;

public class JavaInput {
    
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int x = scanner.nextInt();
        String y = scanner.nextLine();
        String z = scanner.nextLine();
        System.out.println("n = " + n + " x = " + x + "y = " + y + "z = " + z);
    }
}
