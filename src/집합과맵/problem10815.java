package 집합과맵;

import java.io.*;
import java.util.HashSet;
import java.util.StringTokenizer;

public class problem10815 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(bf.readLine());
        StringTokenizer st = new StringTokenizer(bf.readLine());
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i = 0; i < n; i++) {
            hashSet.add(Integer.parseInt(st.nextToken()));
        }
        int m = Integer.parseInt(bf.readLine());
        int[] List = new int[m];
        st = new StringTokenizer(bf.readLine());
        for (int i = 0; i < m; i++) {
            int num = Integer.parseInt(st.nextToken());
            if (hashSet.contains(num)) {
                List[i] = 1;
            }else {
                List[i] = 0;
            }
        }
        for (int o:List) {
            bw.write(o + " ");

        }
        bw.flush();
    }
}
