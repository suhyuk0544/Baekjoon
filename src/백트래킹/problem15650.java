package 백트래킹;

import java.io.*;
import java.util.StringTokenizer;

public class problem15650 {
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
        arr = new int[m + 1];
        select(0);
        bw.flush();
        bw.close();
    }
    public static void select(int l) throws IOException{
        if (l == n){
            for (int i = 0; i < m; i++) {
                bw.write(arr[i] + " ");
            }
            bw.write("\n");
            return;
        }
        for (int i = 1; i < n; i++) {
            if (!visited[i]) {
                arr[l] = i;
                visited[i] = true;
                select(l + 1);
            }
        }
    }
}