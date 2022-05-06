package 문자열;

import java.io.*;

public class u {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        char a = bf.readLine().charAt(0);
        int i = (int) a;
        System.out.println(i);
    }
}
