package 반복문;

import java.io.*;
import java.util.StringTokenizer;

public class problem11022 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(bf.readLine());

        for (int i = 1;i <= t; i++){
            StringTokenizer st = new StringTokenizer(bf.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            bw.write("Case #"+i+": "+a+" + "+b+" = "+ (a + b) +"\n");
        }
        bf.close();
        bw.flush();
        bw.close();

    }
}