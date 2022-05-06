package 반복문;

import java.io.*;
import java.util.StringTokenizer;

public class problem10952 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for (;;) {
            StringTokenizer st = new StringTokenizer(bf.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            if (a == b && a == 0){
                break;
            }else {
                bw.write(a + b+"\n");
            }
        }
        bf.close();
        bw.flush();
        bw.close();

    }
}
