import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str = bf.readLine();
        HashSet<String> hashSet = new HashSet<>();
        for (int i = 1; i <= str.length(); i++) {
            int first = 0,end = i;
            while (end <= str.length()){
                hashSet.add(str.substring(first,end));
                first++;
                end++;
            }
        }
        System.out.println(hashSet.size());
    }
}