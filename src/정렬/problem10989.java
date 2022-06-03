package 정렬;

import java.io.*;

public class problem10989{
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(bf.readLine());
        int[] arr = new int[n],count = new int[10001],result = new int[n];
        for (int u = 0; u < n; u++) {
            arr[u] = Integer.parseInt(bf.readLine());
        }
        for (int i = 0; i < n; i++) {
            count[arr[i]]++;
        }
        for (int j = 1; j < count.length; j++) {
            count[j] += count[j-1];
        }
        for (int k = n-1; k > -1; k--) {
            if (count[arr[k]] != 0) {
                count[arr[k]]--;
                result[count[arr[k]]] = arr[k];
            }
        }
        for (int l = 0; l < n; l++) {
            bw.write(result[l] + "\n");
        }
        bw.flush();
        bw.close();
    }
}
