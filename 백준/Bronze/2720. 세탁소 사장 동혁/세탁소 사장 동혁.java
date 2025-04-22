import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt(); // 테스트 케이스 개수

        for(int i=0; i<T; i++) {
            int C = sc.nextInt(); //거스름돈(센트) (1달러=100센트)

            int Quater; // $0.25 = 25센트
            int Dime; // $0.10 개수
            int Nickel; // $0.05 개수
            int Penny; // $0.01 개수

            Quater = C/25;
            C = C % 25;
            Dime = C/10;
            C = C%10;
            Nickel = C / 5;
            C = C % 5;
            Penny = C;
            System.out.println(Quater + " " + Dime + " " + Nickel+" "+Penny);
        }
    }    
}
