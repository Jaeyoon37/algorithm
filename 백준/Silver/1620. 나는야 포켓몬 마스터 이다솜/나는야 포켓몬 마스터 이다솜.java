import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); //포켓몬 개수
        int M = Integer.parseInt(st.nextToken()); //맞춰야하는 문제 수

        HashMap<String, Integer> nameToNum = new HashMap<>(); //이름→숫자
        HashMap<Integer, String> numToName = new HashMap<>(); //숫자→이름

        //포켓몬입력
        for (int i = 1; i <=N; i++) {
            String name = br.readLine();
            nameToNum.put(name, i);
            numToName.put(i, name);
        }

        StringBuilder sb = new StringBuilder();

        //문제
        for (int i = 0; i < M; i++) {
            String question = br.readLine();
            if (isNumeric(question)) {
                int num = Integer.parseInt(question);
                sb.append(numToName.get(num)).append('\n');
            } else {
                sb.append(nameToNum.get(question)).append('\n');
            }
        }
        System.out.println(sb);

    }
    //문자열이 숫자인지 판별하는 함수
    public static boolean isNumeric(String str) {
        //첫 글자가 음수일 수도 있으므로 예외 처리 추가
        if (str == null || str.isEmpty()) return false;

        for(int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) return false;
        }
        return true;
    }
}

