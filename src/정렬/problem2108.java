package 정렬;

import java.io.*;
import java.util.Arrays;

public class problem2108 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(bf.readLine());
        int[] arr = new int[n];
        int[] count = new int[8001];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(bf.readLine());
            sum += arr[i];
        }
        for (int i = 0; i < n; i++) {
            count[arr[i] + 4000]++;
        }
        Arrays.sort(arr);
        bw.write((int) Math.round((double) sum / n) + "\n");
        bw.write(arr[n / 2] + "\n");
        bw.write(mode(count) + "\n");
        bw.write(arr[n-1] - arr[0] + "\n");
        bw.flush();
        bf.close();
        bw.close();
    }
    static int mode(int[] count){
        int max = 0;
        int mode = 10000;
        boolean r = false;
        for (int j = 0; j < count.length; j++) {
            if (count[j] != 0) {
                if (max < count[j]) {
                    max = count[j];
                    mode = j - 4000;
                    r = true;
                } else if (max == count[j] && r) {
                    mode = j - 4000;
                    r = false;
                }
            }
        }
        return mode;
    }
}
