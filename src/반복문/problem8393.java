package 반복문;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class problem8393 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(bf.readLine());
        int t = 0;

        for (int i = 1; i <= a; i++){
            t += i;
        }
        System.out.println(t);
    }
}
