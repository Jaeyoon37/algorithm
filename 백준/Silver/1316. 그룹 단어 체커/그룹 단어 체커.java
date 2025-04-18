import java.util.Scanner;

public class Main {
    
    static Scanner sc = new Scanner(System.in);

    public static boolean check() {
        String str = sc.next();
        boolean[] check = new boolean[26];
        int prev = 0;

        for(int i=0; i<str.length(); i++) {
            int now = str.charAt(i); //i번째 문자 저장
            
            // 앞선 문자와 i 번째 문자가 같지 않다면?
            if (prev != now) {
                
                //해당 문자가 처음 나오는 경우
                if( check[now - 'a'] == false ) {
                    check[now - 'a'] = true; //true로 바꿔주기
                    prev = now; //다음 턴을 위해 prev도 바꾸기
                } else { //해당 문자가 이미 나온적이 있는 경우 (그룹단어가 아님)
                    return false; //함수 종료
                }   
            }
            //앞선 문자와 i 번째 문자가 같다면? (연속)
            else {
                continue;
            }
        }
        return true;
    }
    public static void main(String[] args) {
    
        int N = sc.nextInt();
        int count = 0;
        
        for(int i=0; i<N; i++) {
            if (check() == true) {
                count++;
            }
        }
        System.out.println(count);
    }
}
