import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokens = new StringTokenizer(br.readLine());
        
        int[] correct = {1, 1, 2, 2, 2, 8};
        for (int i=0; i<correct.length; i++){
            int input = Integer.parseInt(tokens.nextToken());
            System.out.print((correct[i] - input) + " ");
        }
    }
}