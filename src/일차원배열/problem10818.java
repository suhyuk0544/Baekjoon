package 일차원배열;

import java.io.*;
import java.util.StringTokenizer;
import java.util.Arrays;

public class problem10818 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(bf.readLine()," ");


        int n = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(bf.readLine()," ");

        int[] result = new int[n];
        for(int i = 0;i < n;i++){
            result[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(result);
        bw.write(result[0] + " ");
        bw.write(String.valueOf(result[n-1]));


        bf.close();
        bw.flush();
        bw.close();

    }
}
