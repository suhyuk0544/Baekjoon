import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        if (n == 1){
            System.out.println(Integer.parseInt(bf.readLine()));
        }else {
            LinkedList<Integer> ints = new LinkedList<Integer>();
            int sum = 0;
            for (int i = 0; i < n; i++) {
                int num = Integer.parseInt(bf.readLine());
                if (num != 0) {
                    ints.add(num);
                }
                if (num == 0) {
                    ints.remove(ints.size()-1);
                }
            }
            for (int i:ints) {
                sum += i;
            }
            System.out.println(sum);
        }
    }
}