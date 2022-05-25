package 기본수학2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class problem2581 {
    public static boolean[] booleans;
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int min = Integer.parseInt(bf.readLine()),max = Integer.parseInt(bf.readLine());
        int result = 0,r = 0,m = 0;
        booleans = new boolean[max - min + 1];
        select(max,min);
        for (int i = 0; i < booleans.length; i++) {
            if (!booleans[i]){
                if (r == 0){
                    m = i + min;
                }
                System.out.println(i+min);
                result += i + min;
                r++;
            }
        }
        if (result == 0){
            System.out.println(-1);
        }else {
            System.out.println(result);
            System.out.println(m);
        }
    }
    static void select(int max,int min){
        for (int j = min; j <= max; j++) {
            if (j == 2) {
                booleans[j - min] = false;
                continue;
            }else if (j % 2 == 0 || j < 2){
                booleans[j - min] = true;
                continue;
            }for (int i = 2; i <= Math.sqrt(max); i++) {
                if (j != i) {
                    if (j % i == 0){
                        booleans[j - min] = true;
                        break;
                    }
                }
            }
        }
    }
}
