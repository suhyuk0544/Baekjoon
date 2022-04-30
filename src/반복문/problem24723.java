package 반복문;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class problem24723 {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        double n = Integer.parseInt(bf.readLine());

        double result = Math.pow(2,n);


        System.out.println(Math.round(result));
    }
}