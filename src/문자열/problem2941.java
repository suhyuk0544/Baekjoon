package 문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class problem2941 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String a = bf.readLine();
        String[] arr = {"c=","c-","dz=","d-","lj","nj","s=","z="};
        for (String str:arr) {
            if (a.contains(str)){
                a = a.replace(str,"u");
            }
        }
        System.out.println(a.length());
    }
}
