package 일차원배열;

import java.io.*;

public class problem2562 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] result = new int[9];
        int index = 1;
        for (int i = 0;i < 9;i++){
            result[i] = Integer.parseInt(bf.readLine());
        }
        int max = result[0];
        for (int j = 0;j < 9;j++){
            if (result[j] > max){
                max = result[j];
                index += j;
            }
        }
        bw.write(max + "\n" + index);

        bf.close();
        bw.flush();
        bw.close();
    }
}
