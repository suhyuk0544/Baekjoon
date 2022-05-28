package 기본수학2;

import java.io.*;

public class problem4948 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true){
            int m = Integer.parseInt(bf.readLine());
            if (m == 0){
                break;
            }
            int num = 0;
            if (m == 1){
                num += 1;
            }else {
                for (int i = m + 1; i < m * 2; i++) {
                    boolean booleans = false;
                    if (i % 2 == 0 || i < 2) {
                        booleans = true;
                    }else {
                        for (int j = 2; j <= Math.sqrt(m * 2); j++) {
                            if (i != j) {
                                if (i % j == 0) {
                                    booleans = true;
                                    break;
                                }
                            }
                        }
                    }
                    if (!booleans) {
                        num += 1;
                    }
                }
            }
            bw.write(num+"\n");
        }
        bw.flush();
    }
}
