import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str = bf.readLine();
        Integer[] num = new Integer[str.length()];
        for (int i = 0; i < str.length(); i++) {
            num[i] = Integer.parseInt(String.valueOf(str.charAt(i)));
        }
        Arrays.sort(num);
        for (Integer integer : num) {
            sb.append(integer);
        }
        sb.reverse();
        System.out.println(sb);
    }
}