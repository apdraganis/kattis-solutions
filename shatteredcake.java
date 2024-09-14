
import java.util.Scanner;

public class shatteredcake 
{
    public static void main(String[] args) 
    {
        try(Scanner scanner = new Scanner(System.in))
        {
            int W = scanner.nextInt(), N = scanner.nextInt();

            int totalArea = 0;
            for(int i =0; i < N; i++)
                totalArea+= (scanner.nextInt() * scanner.nextInt());

            int L = totalArea/W;

            System.out.println(L);
        }            
    }    
}
