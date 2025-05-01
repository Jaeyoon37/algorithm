import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int x = 0;
        int y = 0;

        for (int i=0; i<3; i++) {
            x ^= sc.nextInt();
            y ^= sc.nextInt();
        }

        System.out.println(x + " " + y);
    }
}
