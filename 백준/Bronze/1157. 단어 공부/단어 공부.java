import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next().toUpperCase(); //전부 대문자로 변환
        int[] count = new int[26]; //알파벳 배열 생성

        //알파벳 개수 세기
        for(int i=0; i<str.length(); i++){
            count[str.charAt(i) - 'A']++;
        }

        //최대값 찾기
        int max = -1;
        char result = '?';

        for(int i=0; i<26; i++){
            if(count[i] > max){
                max = count[i];
                result = (char)(i + 'A');
            } else if (count[i] == max) {
                result = '?';
            }
        }
        System.out.println(result);
        sc.close();
    }
}
