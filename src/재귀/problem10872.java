package 재귀;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class problem10872 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        u(Integer.parseInt(bf.readLine()));
    }
    static int sum = 1;
    public static void u(int n){
        if (n <= 1){
            System.out.println(sum);
            return;
        }
        sum *= n;
        u(n - 1);
    }
}
