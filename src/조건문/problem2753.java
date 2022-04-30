package 조건문;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class problem2753 {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(bf.readLine());

        if (a % 4 == 0 && a % 100 != 0 || a % 400 == 0) {
            System.out.println(1);

        }else{
            System.out.println(0);
        }

    }
}

