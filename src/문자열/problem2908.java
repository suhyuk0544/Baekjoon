package 문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class problem2908 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        StringBuilder sb = new StringBuilder();

        String[] arr = new String[2];

        for (int i = 0; i < 2; i++) {
            String a = st.nextToken();
            sb.setLength(0);
            for (int j = 2; j >= 0; j--) {
                 sb.append(a.charAt(j));
            }
            arr[i] = String.valueOf(sb);
        }
        if (Integer.parseInt(arr[0]) > Integer.parseInt(arr[1])){
            System.out.println(arr[0]);
        }else {
            System.out.println(arr[1]);
        }
    }
}
