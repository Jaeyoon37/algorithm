import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        
        int[][] A = new int[9][9]; //행렬 정의
        int max = Integer.MIN_VALUE; //최댓값 초기화
        int maxRow = 0;
        int maxCol = 0;

        for(int i=0; i<9; i++){
            StringTokenizer tokens = new StringTokenizer(br.readLine());
            for(int j=0; j<9; j++){
                A[i][j] = Integer.parseInt(tokens.nextToken());
                if(A[i][j] > max){
                    max = A[i][j];
                    maxRow = i+1;
                    maxCol = j+1;
                }
            }
        }
        System.out.println(max);
        System.out.println(maxRow + " "+ maxCol);
    }    
}
