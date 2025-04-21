import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); //10진법수
        int B = sc.nextInt(); //B진법
        sc.close();

        StringBuilder sb = new StringBuilder();
        
        while (N>0) { 
            if( N % B >= 10){
                sb.append((char)(N % B - 10 + 'A'));
            } else {
                sb.append(N % B);
            }
            N/=B;
        }
        System.out.println(sb.reverse().toString());
    }    
}