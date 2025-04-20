import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String arr[][] = new String[5][15]; //행렬정의

        //행렬생성
        for( int i=0; i<5; i++){
            String line = br.readLine();
            for( int j=0; j<line.length(); j++){
                arr[i][j] = String.valueOf(line.charAt(j));
            }
        }

        //세로로 읽기
        for( int j=0; j<15; j++) {
            for( int i=0; i<5; i++){
                if (arr[i][j] != null) {
                    sb.append(arr[i][j]);
                }
            }
        }

        System.out.println(sb); //출력

    }    
}