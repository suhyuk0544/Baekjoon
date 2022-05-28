package 기본수학2;

import java.io.*;
import java.util.StringTokenizer;

public class problem1929 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int min = Integer.parseInt(st.nextToken()),max = Integer.parseInt(st.nextToken());
        int num = 0;
        for (int i = min; i <= max; i++) {
            boolean booleans = false;
            if (i % 2 == 0 || i < 2) {
                booleans = true;
            }else{
                for (int j = 2; j <= Math.sqrt(max); j++) {
                    if (i != j) {
                        if (i % j == 0) {
                            booleans = true;
                            break;
                        }
                    }
                }
            }if (i == 2) {
                booleans = false;
            }if (!booleans){
                bw.write(i+"\n");
            }
        }
        bw.flush();
    }
}
