import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine();
    
    str = str.replace("c=", "a");
    str = str.replace("c-", "a");
    str = str.replace("dz=", "a");
    str = str.replace("d-", "a");
    str = str.replace("lj", "a");
    str = str.replace("nj", "a");
    str = str.replace("s=", "a");
    str = str.replace("z=", "a");
    
    System.out.println(str.length());
    }}