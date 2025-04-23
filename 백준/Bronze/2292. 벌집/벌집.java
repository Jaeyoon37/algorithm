import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine()); // 개수

        int count = 1; // 거리
        int range = 2; // 범위

        if( N == 1 ) {
            System.out.println(1);
        } else {
            while (range <= N) {
                range += 6*count;
                count++;
            }
            System.out.println(count);
        }
    }    
}
