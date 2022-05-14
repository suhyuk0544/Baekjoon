package 문자열;

import java.io.*;
import java.util.StringTokenizer;

public class problem2675 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int length = Integer.parseInt(st.nextToken());

        for (int i = 0; i < length; i++) {
            st = new StringTokenizer(bf.readLine());
            int m = Integer.parseInt(st.nextToken());
            String x = st.nextToken();
            int n = 0;
            for (int j = 0; j < x.length(); j++) {
                for (int k = 0; k < m; k++) {
                    sb.append(x.charAt(n));
                }
                n++;
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
