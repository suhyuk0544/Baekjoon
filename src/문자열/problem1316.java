package 문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class problem1316 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(bf.readLine());
        int num = 0;
        for (int i = 0; i < m; i++) {
            String a = bf.readLine();
            if (solution(a)){
                num += 1;
            }
        }
        System.out.println(num);
    }
    static boolean solution(String str) {
        String result = "";
        char u = 0;
        for (int i = 0; i < str.length(); i++) {
            if (!(u == str.charAt(i))){
                if (u > 0){
                    if (result.contains(String.valueOf(str.charAt(i)))) {
                        return false;
                    }
                }
                u = str.charAt(i);
                result += str.charAt(i);
            }
        }
        return true;
    }
}
