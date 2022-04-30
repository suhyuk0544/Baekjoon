package 반복문;

import java.io.*;

public class problem2438 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(bf.readLine());
        for (int i = 1;i <= t;i++){
            for (int j = 0;j < i;j++){
                System.out.print("*");
            }
            System.out.println("");

        }
    }
}
