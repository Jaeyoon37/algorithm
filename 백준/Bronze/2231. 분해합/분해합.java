import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for(int i=1; i<N; i++) {
            int sum = i;
            String S = String.valueOf(i); //CharAt 사용하기위해
            for (int j=0; j<S.length(); j++) {
                sum += S.charAt(j) - '0'; //문자열'0'빼기
            }
            if (sum == N) {
                System.out.println(i);
                sc.close();
                return;
            }
        }
        sc.close();
        System.out.println(0);
    }
}

