package 반복문;

import java.io.*;
import java.util.StringTokenizer;

public class problem10871 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(bf.readLine()," ");


        int n = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(bf.readLine()," ");
        for (int i = 0;i < n;i++){
            int a = Integer.parseInt(st.nextToken());
            if (a < x){
                bw.write(a + " ");
            }
        }
        bf.close();
        bw.flush();
        bw.close();

    }
}

