package 함수;

import java.io.*;

public class problem1065 {
    static boolean num(int n){
        if (n < 100){
            return false;
        }
        int[] result = new int[(int) Math.log10(n) +1];
        for (int i = 0; i < result.length; i++) {

            result[i] = n % 10;
            n /= 10;
        }
        return result[0] - result[1] != result[1] - result[2];
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(bf.readLine());
        if (num == 1000){
            num -= 1;
        }
        boolean[] arr = new boolean[num];
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = num(i +1);
        }
        for (boolean b : arr) {
            if (!b) {
                result += 1;
            }
        }
        System.out.println(result);
    }
}
