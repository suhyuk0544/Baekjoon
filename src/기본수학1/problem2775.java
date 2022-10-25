package 기본수학1;

import java.io.*;

public class problem2775 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[][] ints = new int[15][15];
        int t = Integer.parseInt(bf.readLine());

        for (int l = 0; l < 15; l++) {
            ints[l][1] = 1;
            ints[0][l] = l;
        }
        for (int i=1;i<15;i++) {
            for (int k=2;k<15;k++) {
                ints[i][k] = ints[i][k-1] + ints[i - 1][k];
            }
        }

        for (int i=0;i<t;i++) {
            int k = Integer.parseInt(bf.readLine());
            int n = Integer.parseInt(bf.readLine());
            bw.write(ints[k][n] + "\n");
        }
        bw.flush();
        bw.close();
    }
}
