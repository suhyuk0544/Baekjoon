package 입출력;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class problem1000 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] strs = br.readLine().split(" ");

        int a = Integer.parseInt(strs[0]);

        int b = Integer.parseInt(strs[1]);

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);

    }
}
