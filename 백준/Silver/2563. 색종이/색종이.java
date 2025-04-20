import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int su = sc.nextInt(); //색종이 개수
        boolean arr[][] = new boolean[100][100]; //행렬정의

        for(int i=0; i<su; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            
            //해당 색종이만큼 true로 변경
            for(int j=x; j<x+10; j++) {
                for( int k=y; k<y+10; k++){
                    arr[j][k] = true;
                }
            }

        }
        //true 개수 세기
        int count = 0;
        for( int i=0; i<100; i++){
            for( int j=0; j<100; j++){
                if(arr[i][j]) count++;
            }
        }
        sc.close();
        System.out.println(count); //출력

    }    
}
