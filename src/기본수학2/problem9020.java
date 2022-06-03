package 기본수학2;

import java.io.*;

public class problem9020 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int num = Integer.parseInt(bf.readLine());
        for (int i = 0; i < num; i++) {
            int x = Integer.parseInt(bf.readLine());
            int f = x / 2,s = x / 2;
            while (true){
                if (select(f) && select(s)){
                    bw.write(f +" "+ s+"\n");
                    break;
                }
                f--;
                s++;
            }
        }
        bw.flush();
    }
    static boolean select(int n) {
        boolean booleans = true;
        if (n == 2){
            return true;
        }else if (n % 2 == 0 || n < 2) {
            booleans = false;
        }else {
            for (int j = 2; j <= Math.sqrt(10000); j++) {
                if (n != j) {
                    if (n % j == 0) {
                        booleans = false;
                        break;
                    }
                }
            }
        }
        return booleans;
    }
}
