package 일차원배열;

import java.io.*;
import java.util.StringTokenizer;

public class problem4344 {
    static float num(int s,float r,int[] arr){
        float a = 0;
        for (int i = 0; i < s; i++) {
            if (arr[i] > r){
                a += 1;
            }
        }
        float result = a / s * 100;
        return result;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(bf.readLine());
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(bf.readLine());

            int s = Integer.parseInt(st.nextToken());

            float m = 0;

            int[] arr = new int[s];
            for (int j = 0; j < s; j++) {
                 int l = Integer.parseInt(st.nextToken());
                 arr[j] = l;
                 m += l;
            }
            float result = m / s;
            bw.write(String.format("%.3f",num(s,result,arr))+ "%\n");
        }
        bw.flush();
        bw.close();

    }
}
