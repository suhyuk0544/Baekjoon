import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(bf.readLine());
        int count = 0;
        Map<Integer,Integer> hashMap = new HashMap<>();
        int[] arr = new int[n];
        int[] ints;
        StringTokenizer st = new StringTokenizer(bf.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        ints = arr.clone();
        Arrays.sort(arr);
        for (int j = 0; j < arr.length; j++) {
            if (!hashMap.containsKey(arr[j])) {
                hashMap.put(arr[j],count++);
            }
        }
        for (int anInt : ints) {
            bw.write(hashMap.get(anInt)+" ");
        }
        bw.flush();
    }
}