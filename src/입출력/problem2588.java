package 입출력;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class problem2588 {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(bf.readLine());

        int b = Integer.parseInt(bf.readLine());

        System.out.println(a * (b % 10));

        System.out.println(a * (b % 100 / 10));

        System.out.println(a * (b % 1000 / 100));

        System.out.println(a * b);


    }

}
