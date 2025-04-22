import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 테스트 케이스 개수
        int result = (int)Math.pow((int)Math.pow(2, N) + 1, 2);
        sc.close();
        System.out.println(result);
    }    
}