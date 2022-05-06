package 반복문;

import java.io.*;

public class problem1110 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(bf.readLine());
        int l = 0;
        int p = t;

        while (true){
            int x = p % 10;
            int y = p / 10;

            int n = x + y;
            if (n >= 10){
                n = n % 10;
            }
            p = x * 10 + n;
            l += 1;
            if (t == p){
                bw.write(String.valueOf(l));
                break;
            }
        }
        bf.close();
        bw.flush();
        bw.close();
    }
}
