package 집합과맵;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class problem1269 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        HashSet<Integer> hashSet1 = new HashSet<>();
        HashSet<Integer> hashSet2 = new HashSet<>();
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int n = Integer.parseInt(st.nextToken()),m = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(bf.readLine());
        for (int i = 0; i < n; i++) {
            hashSet1.add(Integer.parseInt(st.nextToken()));
        }
        st = new StringTokenizer(bf.readLine());
        for (int j = 0; j < m; j++) {
            hashSet2.add(Integer.parseInt(st.nextToken()));
        }
        HashSet<Integer> hashSet3 = (HashSet<Integer>) hashSet1.clone();
        for (int t:hashSet2) {
            hashSet1.remove(t);
        }
        for (int t:hashSet3) {
            hashSet2.remove(t);
        }
        System.out.println(hashSet1.size() + hashSet2.size());
    }
}
