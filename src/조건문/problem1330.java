package 조건문;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class problem1330 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String[] str = bf.readLine().split(" ");

        int a = Integer.parseInt(str[0]);

        int b = Integer.parseInt(str[1]);

        if (a > b){
            System.out.println(">");
        }else if (a < b){
            System.out.println("<");

        }else if (a == b){
            System.out.println("==");
        }
    }
}
