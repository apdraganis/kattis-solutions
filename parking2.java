import java.util.Arrays;
import java.util.Scanner;

public class parking2
{
    public static void main(String[] args)
    {
        try (Scanner sc = new Scanner(System.in))
        {
            int t = sc.nextInt(); // Number of test cases
            for (int i = 0; i < t; i++)
            {
                int n = sc.nextInt(); // Number of stores
                int[] stores = new int[n]; // Array of n stores

                // Read store positions
                for (int j = 0; j < n; j++) stores[j] = sc.nextInt();

                int maxStore = Arrays.stream(stores).max().getAsInt();
                int minStore = Arrays.stream(stores).min().getAsInt();
                
                System.out.println(2 * (maxStore - minStore));
            }
        }
    }
}
