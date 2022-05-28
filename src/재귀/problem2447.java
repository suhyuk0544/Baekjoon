package 재귀;

import java.io.*;

public class problem2447 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(bf.readLine());
        Star(num / 3, num / 3);
    }
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static String[] str = new String[9];
    static int anInt = 0;
    static void Star(int width, int length) throws IOException{
        if (0 == length) {
            return;
        }
        string(width,2);
        for (int i = 0; i < str.length; i++) {
            bw.write(str[i]+"\n");
        }
        bw.flush();
        Star(width,length-1);
    }
    static void string(int width,int length){
        if (anInt == 5){

        }else {

        }

        anInt += 1;
        string(width,length-1);
    }
}