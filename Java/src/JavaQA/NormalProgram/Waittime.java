package src.JavaQA.NormalProgram;

public class Waittime {
    public static int solution(int N, int[][] patient) {
        long waitTime = 0;
        long currentTime = 0;

        for (int i = 0; i < N; i++) {
            if (currentTime < patient[i][0]) {
                currentTime = patient[i][0];
            }
            waitTime += currentTime + patient[i][1] - patient[i][0];
            currentTime += patient[i][1];
        }
        return (int) (waitTime / N);
    }
}

