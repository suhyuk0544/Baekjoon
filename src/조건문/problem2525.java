package 조건문;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class problem2525 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String[] arr = bf.readLine().split(" ");

        int h = Integer.parseInt(arr[0]);

        int m = Integer.parseInt(arr[1]);

        int t = Integer.parseInt(bf.readLine());

        h += t / 60;
        m += t % 60;

        if (m >= 60) {
            h += 1;
            m -= 60;
        }
        if (h >= 24){
            h -= 24;
        }
        System.out.println(h +" "+ m);
    }
}
