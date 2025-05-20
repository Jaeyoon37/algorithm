import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken()); //트럭의 수
        int w = Integer.parseInt(st.nextToken()); //다리 길이
        int L = Integer.parseInt(st.nextToken()); //다리 최대 하중

        Deque<Integer> car = new ArrayDeque<>(); //대기하는 트럭들
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            car.offer(Integer.parseInt(st2.nextToken()));
        }

        Deque<Integer> bridge = new ArrayDeque<>(); //다리 위 트럭

        int weight = 0; //다리 위 무게
        int time = 0; //시간

        for (int i=0; i<w; i++){
            bridge.offer(0);
        }

        while (!bridge.isEmpty()) {
            time++; //시간 흐름
            weight = weight - bridge.poll(); //맨 앞 트럭 다리에서 나감

            if(!car.isEmpty()) {
                if(weight + car.peek() <= L) { //무게+대기 차량 <= 다리하중 일 때 (전진가능)
                    int go = car.poll();
                    bridge.offer(go); //차량 빼서 다리에 넣기
                    weight += go; //무게 추가
                } else { //하중이 넘어서 안되면 그냥 0만 추가 (시간만 흐름)
                    bridge.offer(0);
                }
            }
        }
        System.out.println(time);
    }
}

