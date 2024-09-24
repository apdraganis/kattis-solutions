import java.util.*;

public class cups
{
    public static void main(String[] args)
    {
        try (Scanner sc = new Scanner(System.in))
        {
            int N = Integer.parseInt(sc.nextLine()); // Total cups
            List<Cup> cups = new ArrayList<>(); // Cups read from scanner

            for (int i = 0; i < N; i++)
            {
                String[] ln = sc.nextLine().split(" ");

                // Add cups to the list.
                if (Character.isDigit(ln[0].charAt(0))) // If radius is first, divide by 2
                    cups.add(new Cup(Integer.parseInt(ln[0]) / 2, ln[1]));
                else // If color is first, add details as they are
                    cups.add(new Cup(Integer.parseInt(ln[1]), ln[0]));
            }

            // Sort cups
            cups.sort(Comparator.comparingInt(cup -> cup.radius));

            // Print colors in increasing order
            for (Cup cup: cups)
                System.out.println(cup.color);
        }
    }

    static class Cup
    {
        int radius;
        String color;

        Cup(int radius, String color)
        {
            this.radius = radius;
            this.color = color;
        }
    }
}


