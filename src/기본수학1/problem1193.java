package 기본수학1;

import java.io.*;

public class problem1193 {
    static String u(int a) {
        String result = "";
        int num = 0;
        int t = 1;
        while (true){
            if (a <= num + t) {
                if (t % 2 == 1) {
                    result = t - (a - num - 1)+ "/" + (a - num);
                }else{
                    result = a - num+"/"+(t - (a - num -1));
                }
                break;
            }else{
                num += t;
                t++;
            }
        }
        return result;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(u(Integer.parseInt(bf.readLine())));
    }
}
