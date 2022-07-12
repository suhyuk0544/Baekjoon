import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(bf.readLine());

        for (int i = 0; i < n; i++) {
            String str = bf.readLine();
            if (select(str)){
                bw.write("YES\n");
            }else {
                bw.write("NO\n");
            }
        }
        bw.flush();
        bw.close();
    }
    static boolean select(String str){
        Stack<Character> stack = new Stack<>();
        for(int j = 0; j < str.length(); j++) {
            if(str.charAt(j) == '(') {
                stack.push(str.charAt(j));
            }else {
                if(stack.empty()) {
                    stack.push(str.charAt(j));
                    break;
                }else {
                    stack.pop();
                }
            }
        }
        return stack.empty();
    }
}