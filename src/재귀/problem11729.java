package 재귀;

import java.io.*;

public class problem11729 {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        bw.write((int)(Math.pow(2,n) - 1)+"\n");
        if (n == 1){
            bw.write(1+" "+3+"\n");
        }else {
            top(n,1,2,3);
        }
        bw.flush();
        bw.close();
    }
    static void top(int n,int a,int b,int c) throws IOException{
        if (n == 1){
            bw.write(1+" "+3+"\n");
            return;
        }
        top(n-1,a,c,b);
        bw.write(a +" "+ c +"\n");

    }
}
