package 기본수학1;

import java.io.*;
import java.util.StringTokenizer;

public class problem2869 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken()), c = Integer.parseInt(st.nextToken());
        System.out.println((int)Math.ceil((double) (c - b) / (a - b)));
    }
}