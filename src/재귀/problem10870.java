package 재귀;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class problem10870 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        u(Integer.parseInt(bf.readLine()));

    }
    static int m = 0;
    static int n = 1;
    static void u(int a){
        if (a <= 0){
            System.out.println(Math.min(m, n));
            return;
        }
        if (m > n){
            n += m;
        }else{
            m += n;
        }
        u(a - 1);
    }

}
