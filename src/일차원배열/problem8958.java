package 일차원배열;

import java.io.*;

public class problem8958 {
    static int ox(int m,String[] result){
        int n = 0;
        int O = 0;
        for (int i = 0; i < result[m].length(); i++) {
            if (String.valueOf(result[m].charAt(i)).equals("O")) {
                O += 1;
                if (O > 1){
                    for (int j = 1; j < O; j++) {
                        n += 1;
                    }
                }
                n += 1;
            }else {
                O = 0;
            }
        }
        return n;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int length = Integer.parseInt(bf.readLine());

        String[] result = new String[length];
        for (int i = 0; i < length; i++) {
            result[i] = bf.readLine();
        }
        for (int m = 0; m < length; m++) {
            bw.write(ox(m,result) + "\n");
            bw.flush();
        }

    }
}
