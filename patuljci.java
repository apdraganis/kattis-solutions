import java.util.Arrays;
import java.util.Scanner;

public class patuljci
{
    public static void main(String[] args)
    {
        try (Scanner sc = new Scanner(System.in))
        {
            int[] allDwarfs = new int[9]; // Array of all integers on hats
            int[] legitDwarfs = new int[7]; // Array of legit integers
            int totalSum = 0;

            // Add integers to array and compute totalSum
            for (int i = 0; i < 9; i++)
            {
                allDwarfs[i] = sc.nextInt();
                totalSum += allDwarfs[i];
            }

            int sumOfIntruders = totalSum - 100; // Find sum of intruders' hat
            int int1 = 0; // Intruder 1
            int int2 = 0; // Intruder 2

            for (int i = 0; i < allDwarfs.length - 1; i++)
            {
                for (int j = i + 1; j < allDwarfs.length; j++)
                    if (allDwarfs[i] + allDwarfs[j] == sumOfIntruders)
                    {
                        int1 = allDwarfs[i];
                        int2 = allDwarfs[j];
                    }
            }

            for (int dwarf : allDwarfs)
                if (dwarf != int1 && dwarf != int2)
                    System.out.println(dwarf);
        }
    }
}
