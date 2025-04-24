import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 개수 입력
        int count = 0;

        for(int i=0; i<N; i++){
            int x = sc.nextInt();
            boolean isPrime = true;
            if (x==1) continue;

            if(x != 1){
                for(int j=2; j<=Math.sqrt(x); j++){
                    if(x%j == 0){
                        isPrime = false;
                        break;
                    }
                }
                if(isPrime){
                    count++;
                }
            }
        
        }
        System.out.println(count);


        
    }    
}
