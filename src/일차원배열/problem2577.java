package 일차원배열;

import java.io.*;


public class problem2577 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(bf.readLine());
        int b = Integer.parseInt(bf.readLine());
        int c = Integer.parseInt(bf.readLine());

        int m = a * b * c;
        int length = (int)(Math.log10(m)+1);
        int[] arr = new int[length];
        for (int i = 0;i < length;i++){
            arr[i] = m % 10;
            m /= 10;
        }
        int[] arr1 = new int[10];

        for (int j = 0;j < length;j++){
            switch (arr[j]) {
                case 0 -> arr1[0] += 1;
                case 1 -> arr1[1] += 1;
                case 2 -> arr1[2] += 1;
                case 3 -> arr1[3] += 1;
                case 4 -> arr1[4] += 1;
                case 5 -> arr1[5] += 1;
                case 6 -> arr1[6] += 1;
                case 7 -> arr1[7] += 1;
                case 8 -> arr1[8] += 1;
                case 9 -> arr1[9] += 1;
            }
        }
        for (int n = 0;n <= 9; n++){
            bw.write(arr1[n] + "\n");
        }
        bf.close();
        bw.flush();
        bw.close();
    }
}