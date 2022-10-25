package 문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

public class problem1157 {
    static String solution(String str) {
        String answer = "";

        for (int i = 0; i < str.length(); i++) {
            if(str.indexOf(str.charAt(i)) == i) {
                answer += str.charAt(i);
            }
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str = bf.readLine().toUpperCase(Locale.ROOT);

        String x = solution(str);
        String[] m = new String[x.length()];
        int[] n = new int[x.length()];
        for (int j = 0; j < m.length; j++) {
            m[j] = String.valueOf(x.charAt(j));
            for (int k = 0; k < str.length(); k++) {
                if (m[j].equals(String.valueOf(str.charAt(k)))){
                    n[j] += 1;
                }
            }
        }
        int max = n[0];
        int maxIndex = 0;
        for (int i = 0; i < n.length ; i++) {
            if (n[i] > max) {
                maxIndex = i;
            }
            if (i > 0) {
                if (n[i] == max) {
                    sb.append("?");
                }
            }
        }
        if (sb.isEmpty()){
            System.out.println(m[maxIndex]);
        }else {
            System.out.println(sb);
        }
    }

}
