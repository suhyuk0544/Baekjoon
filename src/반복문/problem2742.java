package 반복문;

import java.io.*;

public class problem2742 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(bf.readLine());

        for (int i = 0;i < t; i++){
            bw.write(t - i + "\n");
            bw.flush();
        }
        bf.close();
        bw.close();

    }
}
