package 문자열;

import java.io.*;
import java.util.Arrays;

public class problem10809 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String n = bf.readLine();
        String[] arr = new String[26];
        int m = 97;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = String.valueOf((char) m);
            m += 1;
        }
        int[] result = new int[27];
        Arrays.fill(result, -1);
        for (int i = 1; i < 27; i++) {
            for (int j = 0; j < n.length(); j++) {
                if (String.valueOf(n.charAt(j)).equals(arr[i-1])){
                    result[i] = j;
                    break;
                }
            }
            bw.write(result[i] + " ");
        }
        bw.flush();


    }
}
