import java.util.Scanner;

class theplank
{
    public static void main(String[] args)
    {
        try (Scanner sc = new Scanner(System.in))
        {
            int n = sc.nextInt(); // length of plank
            int[] dp = new int[n + 1]; // Array to store number of ways to build a plank of length n

            // Base cases
            dp[0] = 1; // Ways to build a plank of length 0
            if (n >= 1) dp[1] = 1; // Ways to build a plank of length 1
            if (n >= 2) dp[2] = 2; // Ways to build a plank of length 2

            // Fill array for lengths greater than 2
            for (int i = 3; i <= n; i++) dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];

            System.out.println(dp[n]);
        }
    }
}
