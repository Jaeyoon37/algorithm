import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int[] tri = new int[3];

        for (int i=0; i<3; i++) {
            tri[i] = Integer.parseInt(input[i]);
        }
        Arrays.sort(tri); //정렬

        if (tri[2] < tri[0] + tri[1]) {
            System.out.println(tri[0] + tri[1] + tri[2]);
        } else {
            // a+b+(a+b-1) = 2a+2b-1
            System.out.println(2*(tri[0]+tri[1])-1);
        }
    }
}
