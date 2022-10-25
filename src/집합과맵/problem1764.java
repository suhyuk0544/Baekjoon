package 집합과맵;

import java.io.*;
import java.util.*;

public class problem1764 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int n = Integer.parseInt(st.nextToken()),m = Integer.parseInt(st.nextToken());
        HashSet<String> hashSet = new HashSet<>();
        List<String> str = new ArrayList<>();
        for (int i = 0; i < n+m; i++) {
            String s = bf.readLine();
            if (hashSet.contains(s)){
                str.add(s);
            }else {
                hashSet.add(s);
            }
        }
        Collections.sort(str);
        bw.write(str.size()+"\n");
        for (String s:str) {
            bw.write(s+"\n");
        }
        bw.flush();
    }
}
