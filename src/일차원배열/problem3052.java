package 일차원배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class problem3052 {
    static int r(int a){
        return a % 42;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[10];
        for (int s = 0; s < arr.length; s++) {
            arr[s] = Integer.parseInt(bf.readLine());
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = r(arr[i]);
        }

        int[] setArr = Arrays.stream(arr).distinct().toArray();

        System.out.println(setArr.length);
    }
}
