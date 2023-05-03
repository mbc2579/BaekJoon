import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        
        int length = scanner.nextInt();
        
        for (int i = 0; i < length; i++)
        {
            int x1 = scanner.nextInt();
            int y1 = scanner.nextInt();
            int r1 = scanner.nextInt();
            
            int x2 = scanner.nextInt();
            int y2 = scanner.nextInt();
            int r2 = scanner.nextInt();
            
            System.out.println(calcPoints(x1, y1, r1, x2, y2, r2));
        }
    }
    
    private static int calcPoints(int x1, int y1, int r1, int x2, int y2, int r2)
    {
        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        
        int sum = r1 + r2;
        int sub = Math.abs(r1 - r2);
        if (distance == 0 && r1 == r2)
        {
            return -1;
        }
        
        else if (distance < sub)
        {
            return 0;
        }
        
        else if (distance > sum)
        {
            return 0;
        }
        
        else if (distance == sub)
        {
            return 1;
        }
        
        else if (distance == sum)
        {
            return 1;
        }
        
        else
        {
            return 2;
        }
    }
}
