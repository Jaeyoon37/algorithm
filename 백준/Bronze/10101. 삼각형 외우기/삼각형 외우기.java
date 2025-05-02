import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());

        boolean isTri = true;

        if ( A+B+C == 180) {
            if ( A == B && B == C ){
                System.out.println("Equilateral");
            } else if ( A == B || A == C || B == C) {
                System.out.println("Isosceles");
            } else {
                System.out.println("Scalene");
            }
        } else {
            isTri = false;
            System.out.println("Error");
        }
    }
}
