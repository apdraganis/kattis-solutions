import java.util.HashSet;
import java.util.Scanner;

public class bookingaroom
{
    public static void main(String[] args)
    {
        try (Scanner sc = new Scanner(System.in))
        {
            int r = sc.nextInt(), n = sc.nextInt();

            if (r - n == 0) System.out.println("too late"); // If there are no available rooms
            else // If there are available rooms
            {
                // Add unavailable rooms to a HashSet
                HashSet<Integer> unavailableRooms = new HashSet<>();
                for (int i = 0; i < n; i++) unavailableRooms.add(sc.nextInt());

                // Print room of the hotel if it does not exist unavailableRooms
                for (int i = 1; i <= r; i++)
                {
                    if (!unavailableRooms.contains(i))
                    {
                        System.out.println(i);
                        break;
                    }
                }
            }
        }
    }
}
