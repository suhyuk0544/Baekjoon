package 집합과맵;

import java.io.*;
import java.util.HashSet;
import java.util.StringTokenizer;

public class problem14425 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int n = Integer.parseInt(st.nextToken()),m = Integer.parseInt(st.nextToken());
        HashSet<String> hashSet = new HashSet<>();
        int count = 0;
        for (int i = 0; i < n; i++) {
            hashSet.add(bf.readLine());
        }
        for (int j = 0; j < m; j++) {
            String str = bf.readLine();
            if (hashSet.contains(str)){
                count++;
            }
        }
        System.out.println(count);
    }
}
