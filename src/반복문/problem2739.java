package 반복문;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class problem2739 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int num= Integer.parseInt(bf.readLine());

        for (int i = 1; i < 10; i++){
            System.out.println(num +" * "+ i +" = " + num * i);
        }
    }
}
