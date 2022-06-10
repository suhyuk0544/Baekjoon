import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        if (n == 1){
            System.out.println(Integer.parseInt(bf.readLine()));
        }else {
            int[] ints = new int[n];
            int sum = 0;
            for (int i = 0; i < n; i++) {
                int num = Integer.parseInt(bf.readLine());
                if (num != 0) {
                    ints[i] = num;
                }
                if (num == 0) {
                    for (int j = ints.length - 1; j > -1; j--) {
                        if (ints[j] != 0){
                            ints[j] = 0;
                            break;
                        }
                    }
                }
            }
            for (int i:ints) {
                sum += i;
            }
            System.out.println(sum);
        }
    }
}