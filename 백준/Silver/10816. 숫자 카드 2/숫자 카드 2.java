import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        int n = Integer.parseInt(bf.readLine());
        int[] ints = new int[n];
        StringTokenizer st = new StringTokenizer(bf.readLine());
        for (int i = 0; i < n; i++) {
            ints[i] = Integer.parseInt(st.nextToken());
        }
        int u = Integer.parseInt(bf.readLine());
        st = new StringTokenizer(bf.readLine());
        int[] arr = new int[u];
        for (int j = 0; j < u; j++) {
            int key = Integer.parseInt(st.nextToken());
            arr[j] = key;
            hashMap.put(key,0);
        }
        for (int i = 0; i < n; i++) {
            int anInt = ints[i];
            if (hashMap.containsKey(anInt)) {
                hashMap.replace(anInt, hashMap.get(anInt) + 1);
            }
        }
        for (int m:arr) {
            bw.write(hashMap.get(m) + " ");
        }
        bw.flush();

    }
}