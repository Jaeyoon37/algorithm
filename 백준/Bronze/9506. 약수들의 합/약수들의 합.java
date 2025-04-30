import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            int n = Integer.parseInt(br.readLine());
            int sum = 0;
            List<String> divList = new ArrayList<>();

            if (n == -1) break;

            for(int i=1; i<n; i++) {
                if ( n % i == 0) {
                    sum += i;
                    divList.add(String.valueOf(i));
                }

            }

            if( sum == n) {
                System.out.println(n + " = " + String.join(" + ", divList));
            } else {
                System.out.println(n + " is NOT perfect.");
            }
        }
    }
}
