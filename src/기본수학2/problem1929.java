package 기본수학2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class problem1929 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int min = Integer.parseInt(st.nextToken()),max = Integer.parseInt(st.nextToken());
        boolean[] booleans = new boolean[max - min + 1];
        for (int i = min; i <= max; i++) {
            if (i == 2) {
                booleans[i - min] = false;
            }else if (i % 2 == 0 || i < 2){
                booleans[i - min] = true;
            }else {
                for (int j = 2; j <= Math.sqrt(max); j++) {
                    if (i != j) {
                        if (i % j == 0) {
                            booleans[i - min] = true;
                            break;
                        }
                    }
                }
            }
        }
        for (int k = 0; k < booleans.length; k++) {
            if (!booleans[k]){
                System.out.println(k + min);
            }
        }
    }

}
