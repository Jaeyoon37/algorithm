import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine()); //테스트케이스 개수

        while (T-- > 0) {
            String p = br.readLine(); //수행할 함수
            int n = Integer.parseInt(br.readLine()); //배열크기
            String arr = br.readLine(); //배열
            arr = arr.substring(1, arr.length()-1); //문자열자르기(대괄호제거)

            Deque<Integer> deque = new ArrayDeque<>();

            //큐에 값 집어넣기
            if (n>0) {
                String[] nums = arr.split(",");
                for (String num : nums) {
                    deque.offer(Integer.parseInt(num));
                }
            }

            //에러 상태 확인 (기본은 false)
            boolean isErr = false;
            boolean isReverse = false;

            for (char cmd : p.toCharArray()) {
                //뒤집기
                if (cmd == 'R') {
                   isReverse = !isReverse; //뒤집기 상태만 반전
                } else if (cmd == 'D') {
                    if(deque.isEmpty()) {
                        isErr = true;
                        break;
                    }
                    if(isReverse) {
                        deque.pollLast(); //(뒤집혀있으면)뒤에서 제거
                    } else {
                        deque.pollFirst(); //아니면 앞에서 제거
                    }
                }
            }
            if(isErr) {
                System.out.println("error");
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("[");
                while (!deque.isEmpty()) {
                    sb.append(isReverse ? deque.pollLast() : deque.pollFirst());
                    if (!deque.isEmpty()) {
                        sb.append(",");
                    }
                }
                sb.append("]");
                System.out.println(sb.toString());
            }

        }



    }
}

