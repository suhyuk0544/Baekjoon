package 문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class problem5622 {
    public static void main(String[] args) throws IOException {
        BufferedReader bu = new BufferedReader(new InputStreamReader(System.in));
        String a = bu.readLine();
        String[] arr = {"ABC","DEF","GHI","JKL","MNO","PQRS","TUV","WXYZ"};
        int t = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < a.length(); j++) {
                if (arr[i].contains(String.valueOf(a.charAt(j)))) {
                    t += i + 3;
                }

            }
        }
        System.out.println(t);
    }
}
class Um{
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String str = bf.readLine();
        String[] arr = new String[str.length()];
        for (int i = 0; i < str.length(); i++) {
            arr[i] = String.valueOf(str.charAt(i));
        }
        int t = 0;
        for (int j = 0; j < str.length(); j++) {
            switch (arr[j]){
                case "A","B","C" -> {
                    t += 3;
                }case "D","E","F" -> {
                    t += 4;
                }case "G","H","I" -> {
                    t += 5;
                }case "J","K","L" -> {
                    t += 6;
                }case "M","N","O" -> {
                    t += 7;
                }case "P","Q","R","S" -> {
                    t += 8;
                }case "T","U","V" -> {
                    t += 9;
                }case "W","X","Y","Z" -> {
                    t += 10;
                }
            }
        }
        System.out.println(t);
    }
}
