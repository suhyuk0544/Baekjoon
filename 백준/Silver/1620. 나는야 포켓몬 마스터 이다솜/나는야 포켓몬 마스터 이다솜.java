import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        HashMap<String,Integer> hashMap = new HashMap<>();
        HashMap<Integer,String> hashMap1 = new HashMap<>();
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int n = Integer.parseInt(st.nextToken()),m = Integer.parseInt(st.nextToken());
        for (int i = 1; i <= n; i++) {
            String str = bf.readLine();
            hashMap.put(str,i);
            hashMap1.put(i,str);
        }
        for (int j = 0; j < m; j++) {
            String t = bf.readLine();
            if (t.chars().allMatch(Character::isDigit)){
                bw.write(hashMap1.get(Integer.parseInt(t))+"\n");
            }else {
                bw.write(hashMap.get(t)+"\n");
            }
        }
        bw.flush();
    }
}