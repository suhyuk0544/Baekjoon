package 기본수학1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class problem2292 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(bf.readLine());
        int length = 2  ;
        int num = 1;
        if (a == 1){
            System.out.println(1);
        }else {
            while (a >= length){
                length += 6 * num;
                num += 1;
            }
            System.out.println(num);
        }
    }
}
