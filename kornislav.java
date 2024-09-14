
import java.util.Arrays;
import java.util.Scanner;

/**
 * kornislav
 */
public class kornislav {

    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int[] steps = new int[4];
            for (int i = 0; i < 4; i++) {
                steps[i] = sc.nextInt();
            }
            
            Arrays.sort(steps);

            int area = steps[0] * steps[2];

            System.out.println(area);
        }
    }
}
