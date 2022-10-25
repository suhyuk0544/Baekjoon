package 스택;

import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class problem10828 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(bf.readLine());
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(bf.readLine());
            String str = st.nextToken();
            switch (str) {
                case "push" -> {
                    stack.push(Integer.parseInt(st.nextToken()));
                }
                case "pop" -> {
                    if (!stack.empty()) {
                        bw.write(stack.peek() + "\n");
                        stack.pop();
                    } else {
                        bw.write(-1 + "\n");
                    }
                }
                case "size" -> {
                    bw.write(stack.size() + "\n");
                }
                case "empty" -> {
                    if (stack.empty()) {
                        bw.write(1 + "\n");
                    } else {
                        bw.write(0 + "\n");
                    }
                }
                case "top" -> {
                    if (stack.empty()) {
                        bw.write(-1 + "\n");
                    } else {
                        bw.write(stack.peek() + "\n");
                    }
                }
            }
        }
        bw.flush();
    }
}