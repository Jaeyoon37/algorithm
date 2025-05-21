
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
    static class Document {
        int index; //원래 위치
        int priority; //중요도

        Document(int index, int priority) {
            this.index = index;
            this.priority = priority;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int test = Integer.parseInt(br.readLine()); //테스트 케이스 수

        while (test-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken()); //문서의 개수
            int M = Integer.parseInt(st.nextToken()); //궁금한 문서의 위치

            StringTokenizer st2 = new StringTokenizer(br.readLine());
            Deque<Document> que = new ArrayDeque<>();

            for(int i=0; i<N; i++) {
                int priority = Integer.parseInt(st2.nextToken());
                que.offer(new Document(i, priority));
            }

            int printOrder = 0;

            while (!que.isEmpty()) {
                Document current = que.poll(); //큐에서 문서 꺼내기
                //더 높은 중요도가 있는지 확인
                boolean isHigh = false;
                for (Document doc : que) {
                    if (doc.priority > current.priority) {
                        isHigh = true;
                        break;
                    }
                }
                //중요도가 낮으면 다시 큐 뒤에 넣기
                if (isHigh) {
                    que.offer(current);
                } else {
                    printOrder++; //인쇄
                    if (current.index == M) {
                        System.out.println(printOrder);
                        break;
                    }
                }
            }
        }

    }
}

