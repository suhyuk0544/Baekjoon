package 문자열;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class problem11720 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int m = 0;
        int length = Integer.parseInt(bf.readLine());
        String num = bf.readLine();
        for (int i = 0; i < length; i++) {
            m += Integer.parseInt(String.valueOf(num.charAt(i)));
        }
        System.out.println(m);
    }
}
