package 기본수학2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class problem1978 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        int num = n;
        StringTokenizer st = new StringTokenizer(bf.readLine());
        for (int i = 0; i < n; i++) {
            int a = Integer.parseInt(st.nextToken());
            if (a != 2) {
                if (a == 1) {
                    num--;
                }else if (a % 2 != 0) {
                    for (int j = 3; j <= Math.sqrt(1000); j++) {
                        if (a != j) {
                            if (a % j == 0) {
                                num--;
                                break;
                            }
                        }
                    }
                } else {
                    num--;
                }
            }
        }
        System.out.println(num);
    }
}
