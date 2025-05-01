import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 정수 N

        for (int i=2; i <= Math.sqrt(N); i++) {
            while (N % i == 0) {
                System.out.println(i);
                N = N / i;
            }
        }

        // 루프롤 돌고 남은 수가 소수라면
        if (N > 1) {
            System.out.println(N);
        }
    }
}
