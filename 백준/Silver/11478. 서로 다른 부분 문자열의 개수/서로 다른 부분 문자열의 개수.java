import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        HashSet<String> set = new HashSet<>();

        for(int i=0; i<str.length(); i++) {
            for (int j=i+1; j<=str.length(); j++) {
                String sub = str.substring(i, j);
                set.add(sub);
            }
        }
        System.out.println(set.size());
        
    }
}