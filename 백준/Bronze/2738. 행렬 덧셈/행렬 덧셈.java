import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokens = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(tokens.nextToken()); //행렬의 크기 N
        int M = Integer.parseInt(tokens.nextToken()); //행렬의 크기 M

        int[][] A = new int[N][M]; //A행렬 정의
        int[][] B = new int[N][M]; //B행렬 정의

        int[][] sum = new int[N][M]; //행렬의 덧셈

        for(int i=0; i<N; i++){
            tokens = new StringTokenizer(br.readLine());
            for(int j=0; j<M; j++){
                A[i][j] = Integer.parseInt(tokens.nextToken());
            }
        }
        for(int i=0; i<N; i++){
            tokens = new StringTokenizer(br.readLine());
            for(int j=0; j<M; j++){
                B[i][j] = Integer.parseInt(tokens.nextToken());
            }
        }
        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                System.out.print((A[i][j] + B[i][j]) + " ");
            }
            System.out.println();
        }
    }    
}
