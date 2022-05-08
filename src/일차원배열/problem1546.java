package 일차원배열;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class problem1546 {
    static float num(float m,float n){
        return m / n * 100;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int length = Integer.parseInt(bf.readLine());

        float[] arr = new float[length];

        StringTokenizer st = new StringTokenizer(bf.readLine());

        for (int i = 0; i < length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        float n = arr[length - 1];
        float result = 0;
        for (int j = 0; j < length; j++) {
            result += num(arr[j],n);
        }
        System.out.println(result / length);

    }
}
