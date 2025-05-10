import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken()); //응시자 수
        int k = Integer.parseInt(st.nextToken()); //상 받는 사람 수
        int[] score = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i=0; i<N; i++) {
            score[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(score);
        System.out.println(score[N-k]);
    }
}

