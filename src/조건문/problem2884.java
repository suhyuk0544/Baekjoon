package 조건문;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class problem2884 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String[] arr = bf.readLine().split(" ");

        int h = Integer.parseInt(arr[0]);

        int m = Integer.parseInt(arr[1]);

        if (m - 45 < 0){
            m = (m - 45) + 60;
            h -= 1;

            if (h == 24){
                h = 0;
            }else if (h < 0){
                h += 24;
            }
            System.out.println(h+" "+m);
        }else {
            m -= 45;
            System.out.println(h+" "+m);
        }
    }

}