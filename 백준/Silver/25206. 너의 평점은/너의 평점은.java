import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        double totalScore = 0; //전공과목별 합
        double totalGrade = 0; //학점의 총합

        for(int i=0; i<20; i++){
            StringTokenizer tokens = new StringTokenizer(br.readLine(), " ");
            String subject = tokens.nextToken(); //과목
            double score = Double.parseDouble(tokens.nextToken()); //학점
            String grade = tokens.nextToken(); //등급

            if( grade.equals("P")) continue;

            double gradeValue = 0;

            switch (grade) {
                case "A+": gradeValue = 4.5; break;
                case "A0": gradeValue = 4.0; break;
                case "B+": gradeValue = 3.5; break;
                case "B0": gradeValue = 3.0; break;
                case "C+": gradeValue = 2.5; break;
                case "C0": gradeValue = 2.0; break;
                case "D+": gradeValue = 1.5; break;
                case "D0": gradeValue = 1.0; break;
                case "F": gradeValue = 0.0; break;
            }
            totalScore += score * gradeValue; //전공과목별 합
            totalGrade += score; //학점의 총합

        }
        System.out.println(String.format("%.6f", totalScore / totalGrade) );


    }    
}
