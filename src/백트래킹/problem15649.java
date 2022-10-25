package 백트래킹;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class problem15649 {
    static int n,m;
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static boolean[] visited;
    static int[] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        visited = new boolean[n + 1];
        arr = new int[m];
        select(0);
        bw.flush();
        bw.close();
    }
    public static void select(int l) throws IOException{
        if (l == m) {
            for (int i = 0; i < m; i++) {
                bw.write(arr[i] + " ");
            }
            bw.write("\n");
            return;
        }
        for (int i = 1; i <= n; i++) {
            if (!visited[i]) {
                arr[l] = i;
                visited[i] = true;
                select(l + 1);
                visited[i] = false;
            }
        }
    }
}
