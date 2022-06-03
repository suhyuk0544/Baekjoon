package 정렬;

import java.io.*;
import java.util.Arrays;

public class problem2108 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(bf.readLine());
        int[] arr = new int[n];
        int num = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(bf.readLine());
            num += arr[i];
        }
        Arrays.sort(arr);
        int m = mode(arr);
        bw.write(Math.round(num / n)+"\n");
        bw.write(arr[Math.round(n / 2)]+"\n");
        if (m == -1){
            if (arr.length != 1) {
                bw.write(arr[1] + "\n");
            }else {
                bw.write(arr[0] + "\n");
            }
        }else {
            bw.write(m + "\n");
        }
        bw.write(arr[n -1] - arr[0]+"\n");
        bw.flush();
        bw.close();
    }
    static int mode(int[] arr){
        int[][] count = new int[arr.length][2];
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            count[i][0] = arr[i];
            for (int u:arr) {
                if (num == u){
                    count[i][1]++;
                }
            }
        }
//        int[] num = {count[0][0],count[0][1]};
//        for (int[] u:count) {
//            System.out.println(Arrays.toString(u));
//            if (max < u[1]){
//                if (index == u[0]) {
//                    return -1;
//                }
//                max = u[1];
//                index = u[0];
//            }
//        }
//        return index;
        return 1;
    }
}
