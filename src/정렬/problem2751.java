package 정렬;


import java.io.*;
import java.util.Arrays;

public class problem2751 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] x = new int[Integer.parseInt(bf.readLine())];
        for (int i = 0; i < x.length; i++) {
            x[i] = Integer.parseInt(bf.readLine());
        }
        Arrays.sort(x);
        for (int i : x) {
            bw.write(i + "\n");
        }
        bw.flush();
    }
}
