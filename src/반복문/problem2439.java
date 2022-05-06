package 반복문;

import java.io.*;

public class problem2439 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(bf.readLine());

        for (int i = 1; i <= t; i++){
            for (int j = t; j > 0; j--) {
                if (i<j){
                    bw.write(" ");
                }else {
                    bw.write("*");
                }
            }
            bw.write("\n");
        }
        bf.close();
        bw.flush();
        bw.close();

    }
}
