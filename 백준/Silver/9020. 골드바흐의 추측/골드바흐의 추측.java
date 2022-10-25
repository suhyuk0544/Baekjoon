import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int num = Integer.parseInt(bf.readLine());
        for (int i = 0; i < num; i++) {
            int x = Integer.parseInt(bf.readLine());
            int f = x / 2,s = x / 2;
            while (true){
                if (!selectfalse(f) && !selectfalse(s)){
                    bw.write(f +" "+ s+"\n");
                    break;
                }
                f--;
                s++;
            }
        }
        bw.flush();
    }
    static boolean selectfalse(int n) {
        boolean booleans = false;
        if (n == 2){
            return false;
        }else if (n % 2 == 0 || n < 2) {
            booleans = true;
        }else {
            for (int j = 2; j <= Math.sqrt(10000); j++) {
                if (n != j) {
                    if (n % j == 0) {
                        booleans = true;
                        break;
                    }
                }
            }
        }
        return booleans;
    }
}